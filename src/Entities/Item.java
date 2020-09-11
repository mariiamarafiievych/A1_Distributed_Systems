package Entities;
import java.util.Date;
import java.util.UUID;

public final class Item {
    private final String Name;
    private final String Firm;
    private final UUID id;
    private final double Price;

    public Item(String Name, String Firm, double Price) {
        this.Name = Name;
        this.Firm = Firm;
        this.id =  UUID.randomUUID();
        this.Price = Price;
    }

    public String GetName(){
        return Name;
    }

    public String toString() {
        return this.Name +" "+ this.Firm + " is " + " at the moment. And it costs " + this.Price +"\n";
    }

}
