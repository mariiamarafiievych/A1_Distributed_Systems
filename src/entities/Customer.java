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
    public void AddItem(Item item){
        this.shopCart.add(item);
    }
    public void ClearShopCart(){
        this.shopCart.clear();
    }

    public String GetFirstName() {
        return firstName;
    }

    public String GetLastName() {
        return lastName;
    }

    public ArrayList<Item> GetShopCart(){
        return shopCart;
    }

    public String toString() {
        return this.firstName +" " +this.lastName + " has just bought " + this.shopCart.get(0).GetName() +" and "
                +this.shopCart.get(1).GetName()+"\n";
    }
}
