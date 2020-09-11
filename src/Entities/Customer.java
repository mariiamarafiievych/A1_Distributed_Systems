package Entities;
import java.util.ArrayList;
import java.util.UUID;

public final class Customer {
    private final UUID id;
    private final String FirstName;
    private final String LastName;
    private ArrayList<Item> ShopCart;

    public Customer(String FirstName, String LastName,ArrayList<Item> ShopCart) {
        this.id =  UUID.randomUUID();
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.ShopCart = ShopCart;
    }
    public void AddItem(Item item){
        ShopCart.add(item);
    }
    public void ClearShopCart(ArrayList<Item> ShopCart){
        ShopCart.clear();
    }

    public String GetFirstName() {
        return FirstName;
    }

    public String GetLastName() {
        return LastName;
    }

    public String toString() {
        return this.FirstName +" " +this.LastName + " has just bought " + this.ShopCart.get(0).GetName() +" and "
                +this.ShopCart.get(1).GetName()+"\n";
    }
}
