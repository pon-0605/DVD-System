package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NamedQueries({
    @NamedQuery(name=Event.EventQName,
            query = "SELECT e FROM Event e WHERE e.eventName = ?1"),
    @NamedQuery(name=Event.EventQAll,
            query = "SELECT e FROM Event e")
})

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "eventName"))
public class Event implements Serializable {
    
    public static final String EventQName = "EventQName";
    public static final String EventQAll = "EventQAll";
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer eventId;
    @Size(max=20,min=1)
    private String eventName;
    @Transient
    private boolean editable;
    
    public Event(){
        
    }
    
    public Event(String eventName){
        this.eventName=eventName;
    }
    
    public Event(Integer eventId, String eventName){
        this.eventId=eventId;
        this.eventName=eventName;
    }

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

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
    
    
 }
