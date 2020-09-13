package entities;
import java.util.ArrayList;
import java.util.UUID;

public final class Customer {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private ArrayList<Item> shopCart;

    public Customer(String firstName, String lastName) {
        this.id =  UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.shopCart = new ArrayList<Item>();
    }
    public void addItem(Item item){
        this.shopCart.add(item);
    }
    public void clearShopCart(){
        this.shopCart.clear();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return this.firstName +" "+this.lastName + " has just bought " + this.shopCart.get(0).getName() +" and "
                +this.shopCart.get(1).getName()+"\n";
    }
}
