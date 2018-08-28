package beans;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class BlackmemberBean {
    
    private List <Blackmember> blackmember ;
    {
        blackmember =new ArrayList<>();
        blackmember.add(new Blackmember("大森 壮馬","18110964732",null,15,11,93,"1ヶ月延滞"));
        blackmember.add(new Blackmember("橋本 晃希","16220335247",null,5,4,20,"要注意人物"));
        blackmember.add(new Blackmember("武隈 蒼季","18310174631",null,35,4,89,""));
        blackmember.add(new Blackmember("角張 雄一郎","17110532573",null,10,1,90,"1ヶ月延滞"));
        blackmember.add(new Blackmember("木村 周平","15120742519",null,20,10,50,"延滞多い"));
        blackmember.add(new Blackmember("浜谷 武尊","11210236452",null,20,3,85,"キャバクラ"));
        blackmember.add(new Blackmember("五十嵐 宏輝","13120373821",null,18,3,83,""));
        blackmember.add(new Blackmember("横山 葉流樹","18110973624",null,30,3,90,""));
        blackmember.add(new Blackmember("神戸 渉吾","18110964732",null,15,11,93,"1ヶ月延滞"));
        blackmember.add(new Blackmember("大森 壮馬","18110964732",null,15,11,93,"1ヶ月延滞"));
        blackmember.add(new Blackmember("大森 壮馬","18110964732",null,15,11,93,"1ヶ月延滞"));
        blackmember.add(new Blackmember("大森壮 馬","18110964732",null,15,11,93,"1ヶ月延滞"));
        blackmember.add(new Blackmember("大 森壮馬","18110964732",null,15,11,93,"1ヶ月延滞"));
        blackmember.add(new Blackmember("大森 壮馬","18110964732",null,15,11,93,"1ヶ月延滞"));
        blackmember.add(new Blackmember("大森 壮馬","18110964732",null,15,11,93,"1ヶ月延滞"));
        
    }

    public String next(){
        return "/templates/blackmember.xhtml";
    }

    public List<Blackmember> getBlackmember() {
        return blackmember;
    }

    public void setBlackmember(List<Blackmember> blackmember) {
        this.blackmember = blackmember;
    }

    
}
