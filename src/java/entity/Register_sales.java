package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQuery(name=Register_sales.Number,
        query="SELECT s.sales_proceeds FROM Register_sales s WHERE s.cash_number = :cash_number")

@Entity
@Table(name="REGISTER_SALES")
public class Register_sales implements Serializable {
 
    @Id
    private String cash_number;
    private int sales_proceeds;
    
    public static final String Number = "Number";

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
    
}
