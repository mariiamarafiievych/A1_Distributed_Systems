package entities;
import java.util.UUID;

public final class Item {
    private final String name;
    private final String firm;
    private final UUID id;
    private final double price;

    public Item(String name, String firm, double price) {
        this.name = name;
        this.firm = firm;
        this.id =  UUID.randomUUID();
        this.price = price;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return this.name +" "+ this.firm + " is " + " at the moment. And it costs " + this.price +"\n";
    }

}
