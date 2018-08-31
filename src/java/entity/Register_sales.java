package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamedQuery(name=Register_sales.Number,
        query="SELECT s.planned_amount FROM Register_sales s WHERE s.cash_number = :cash")

 
@Entity
@Table(name="REGISTER_SALES")
public class Register_sales implements Serializable {
 
    @Id @NotNull
    private String cash_number;
    private int sales_proceeds;
    private int planned_amount;
    
    public static final String Number = "Number";
    
    public Register_sales() {}
    
    public Register_sales(String cash_number) {
        this.cash_number = cash_number  + " ";
    }

    public Register_sales(String cash_number, int sales_proceeds, int planned_amount) {
        this.cash_number = cash_number;
        this.sales_proceeds = sales_proceeds;
        this.planned_amount = planned_amount;
    }
    
    public String getCash_number() {
        return cash_number;
    }

    public void setCash_number(String cash_number) {
        this.cash_number = cash_number;
    }
    
    public int getSales_proceeds() {
        return sales_proceeds;
    }

    public void setSales_proceeds(int sales_proceeds) {
        this.sales_proceeds = sales_proceeds;
    }

    public int getPlanned_amount() {
        return planned_amount;
    }

    public void setPlanned_amount(int planned_amount) {
        this.planned_amount = planned_amount;
    }
    
}
