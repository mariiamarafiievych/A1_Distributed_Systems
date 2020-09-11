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

    public void CommunicateWithSuppliers(Supplier supplier){
        System.out.println(this.purchaseManager +" has just communicated with supplier "+ this.supplier.GetFirstName()
                + " "+this.supplier.GetLastName()+"\n");
    }

    public void MakeOrderedItemsList(Item items){
        orderedItemsList.add(items);
    }

    public void OrderItems(ArrayList<Item> items_list){
        System.out.println(this.purchaseManager.GetFirstName()+" "+this.purchaseManager.GetLastName()
                +" has just ordered these items: "+ this.orderedItemsList.get(0).GetName()+" and "
                +this.orderedItemsList.get(1).GetName()  + " from supplier "+this.supplier.GetFirstName()
                + " "+this.supplier.GetLastName()+"\n");
    }

    public void AddItems(ArrayList<Item> items, Item ordered_item) {
        items.add(ordered_item);
        System.out.println("Now the number of "+ items.get(0).GetName() + " increased to " + items.size()+"\n");
    }

    public void RemoveItems(ArrayList<Item> items){
        items.remove(items.size()-1);
        System.out.println("Now the number of "+ items.get(0).GetName() + " decreased to " + items.size()+"\n");
    }

    public void CommunicateWithDelivery(){
        System.out.println(this.transportationManager +" has just communicated with delivery."+"\n");
    }
}

