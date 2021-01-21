package restaurant;
import java.util.*;
public class MenuItem {
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;
    private String new_Item;
    public Calendar modified_date;

    public void MenuItem(Double price,String description,String category)
    {
     this.price=price;
     this.description=description;
     this.category=category;
     this.isNew=true;
     this.new_Item="yes";
     this.modified_date=Calendar.getInstance();
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
