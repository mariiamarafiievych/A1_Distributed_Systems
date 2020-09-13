package services;
import entities.StaffMember;
import entities.Supplier;
import entities.Item;

import java.util.ArrayList;

public final class LogisticService {
    private final StaffMember purchaseManager;
    private final StaffMember transportationManager;
    private final Supplier supplier;
    private final ArrayList<Item> orderedItemsList;

    public LogisticService(StaffMember purchaseManager, StaffMember transportationManager, Supplier supplier, ArrayList<Item> orderedItemsList) {
        this.purchaseManager = purchaseManager;
        this.transportationManager = transportationManager;
        this.supplier = supplier;
        this.orderedItemsList = orderedItemsList;
    }

    public void makeOrderedItemsList(Item items){
        orderedItemsList.add(items);
    }

    public void orderItems(ArrayList<Item> items_list){
        String emptyString="";
        StringBuilder orderingItem = new StringBuilder(emptyString);
        orderingItem.append(this.purchaseManager.getFirstName()).append(" ")
                .append(this.purchaseManager.getLastName())
                .append(" has just ordered these items: ");
        for(int i=0; i<orderedItemsList.size();i++)
           orderingItem.append(this.orderedItemsList.get(i).getName()).append(" ")
                   .append(" from supplier ");
        orderingItem.append(this.supplier.getFirstName()).append(" ")
                .append(this.supplier.getLastName());
        System.out.println(orderingItem);
    }

    public void addItems(ArrayList<Item> items, Item ordered_item) {
        items.add(ordered_item);
        System.out.println("Now the number of "+ items.get(0).getName() + " increased to " + items.size()+"\n");
    }

    public void removeItems(ArrayList<Item> items){
        items.remove(items.size()-1);
        System.out.println("Now the number of "+ items.get(0).getName() + " decreased to " + items.size()+"\n");
    }

    public void communicateWithDelivery(){
        System.out.println(this.transportationManager +" has just communicated with delivery."+"\n");
    }
}

