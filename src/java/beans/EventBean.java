package beans;

import db.EventDb;
import entity.Event;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Size;

@Named
@ConversationScoped
public class EventBean implements Serializable {
    
   private Integer eventId;
   @Size(max=20,min=1)
   private String eventName;
   private List<Event>eventList;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    public EventDb getEventDb() {
        return eventDb;
    }

    public void setEventDb(EventDb eventDb) {
        this.eventDb = eventDb;
    }

    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
    }

    public Conversation getConv() {
        return conv;
    }

    public void setConv(Conversation conv) {
        this.conv = conv;
    }
   
   @EJB
   EventDb eventDb;
   @Inject
   transient Logger log;
   
   @Inject
   Conversation conv;
   
   @PreDestroy
   public void start(){
       if(!conv.isTransient()){
           log.info(log.getName()+"|会話スコープ終了");
           conv.end();
       }
   }
   
   public String create(){
       log.info(log.getName()+"|イベント登録画面");
       if(conv.isTransient()){
           conv.begin();
       }
       return "/pages/event/create.xhtml";
   }
   
   public String confirm(){
       log.info(log.getName()+"|イベント登録確認画面");
       return "confirm.xhtml";
   }
   
   public String execCreate(){
       log.info(log.getName()+"|イベント登録処理");
       Event event = new Event(eventName);
       try{
           eventDb.create(event);
           eventList=eventDb.find(eventName);
       }catch(Exception e){
           log.fine("■"+log.getName()+"|"+e.getMessage());
       }
       log.info(log.getName()+"|会話スコープの終了");
       conv.end();
       return "complete.xhtml";
   }
   
   public String top(){
       return "/top.xhtml";
   }
   
   public void clear(){
       eventName=null;
   }

}
