package beans;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HenkyakuBb {
     private List <HenkyakuBean> henkyakuBean;
    
    {   //初期化
        henkyakuBean = new ArrayList<>();
        henkyakuBean.add(new HenkyakuBean(1,"パイオーツ・オブ・カリビアン","新作","2018/7/10"));
        henkyakuBean.add(new HenkyakuBean(2,"ハメンジャーズ","旧作","1919/11/14"));
        henkyakuBean.add(new HenkyakuBean(3,"アメイジング・オッパイダーマン","準新作","2017/5/14"));
        henkyakuBean.add(new HenkyakuBean(4,"ハーミデーター","新作","2018/6/30"));
    }
    
    public void clear1(){
        this.henkyakuBean.removeAll(henkyakuBean);
    }
    
    public String next(){
        return "/templates/henkyaku.xhtml";
    }
    
    public List<HenkyakuBean> getHenkyakubean() {
        return henkyakuBean;
    }

    public void setHenkyakubean(List<HenkyakuBean> henkyakubean) {
        this.henkyakuBean = henkyakubean;
    }
    
    
}
