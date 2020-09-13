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

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public StringBuilder supplierInfo(ArrayList<Item> orderedItemsList){
        String startString = "The supplier ";
        StringBuilder infoOut = new StringBuilder(startString);
        infoOut.append(this.firstName).append(" ").append(this.lastName);
        infoOut.append(" with id ").append(this.id);
        infoOut.append(" has just delivered these products: ");
        for(int i=0; i<orderedItemsList.size();i++)
            infoOut.append(orderedItemsList.get(i).getName()).append(" ");
        infoOut.append("\n");
        return infoOut;
    }

}
