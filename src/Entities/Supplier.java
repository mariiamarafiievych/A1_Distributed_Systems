package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public final class Supplier {
    private final UUID id;
    private final String FirstName;
    private final String LastName;

    public Supplier( String FirstName, String LastName,ArrayList<Item> ItemsList) {
        this.id = UUID.randomUUID();
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String GetFirstName(){
        return FirstName;
    }

    public String GetLastName(){
        return LastName;
    }

    public String toString(ArrayList<Item> OrderedItemsList){
        return "The supplier " +" " + this.FirstName + " " + this.LastName+ " with id " + this.id + " has just delivered these products: "
                + OrderedItemsList.get(0).GetName() +" and "+OrderedItemsList.get(1).GetName() +"\n";
    }

}
