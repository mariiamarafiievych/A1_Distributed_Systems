package entities;

import java.util.ArrayList;
import java.util.UUID;

public final class Supplier {
    private final UUID id;
    private final String firstName;
    private final String lastName;

    public Supplier( String firstName, String lastName,ArrayList<Item> itemsList) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String GetFirstName(){
        return firstName;
    }

    public String GetLastName(){
        return lastName;
    }

    public String toString(ArrayList<Item> orderedItemsList){
        return "The supplier " +" " + this.firstName + " " + this.lastName + " with id " + this.id + " has just delivered these products: "
                + orderedItemsList.get(0).GetName() +" and "+orderedItemsList.get(1).GetName() +"\n";
    }

}
