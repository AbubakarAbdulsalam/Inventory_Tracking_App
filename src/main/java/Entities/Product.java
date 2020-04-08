package Entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private int productId;
    private String productName;

    /**
     *
     */
    public Product()
    {

    }


    /**
     *
     * @return
     */
    public int getProductId()
    {
       return this.productId;
    }

    /**
     *
     * @return
     */
    public String getProductName()
    {
        return  this.productName;
    }

    /**
     *
     * @param name
     */
    public void setProductName(String name)
    {
        this.productName = name;
    }




}
