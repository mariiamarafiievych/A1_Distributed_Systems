package Services;
import Entities.StaffMember;
import Entities.Supplier;
import Entities.Item;

import java.util.ArrayList;

public final class LogisticService {
    private final StaffMember PurchaseManager;
    private final StaffMember TransportationManager;
    private final Supplier supplier;
    private final ArrayList<Item> OrderedItemsList;

    public LogisticService(StaffMember PurchaseManager, StaffMember TransportationManager, Supplier supplier, ArrayList<Item> OrderedItemsList) {
        this.PurchaseManager= PurchaseManager;
        this.TransportationManager = TransportationManager;
        this.supplier = supplier;
        this.OrderedItemsList = OrderedItemsList;
    }

    public void CommunicateWithSuppliers(Supplier supplier){
        System.out.println(this.PurchaseManager+" has just communicated with supplier "+ this.supplier.GetFirstName()
                + " "+this.supplier.GetLastName()+"\n");
    }

    public void MakeOrderedItemsList(Item items){
        OrderedItemsList.add(items);
    }

    public void OrderItems(ArrayList<Item> items_list){
        System.out.println(this.PurchaseManager.GetFirstName()+" "+this.PurchaseManager.GetLastName()
                +" has just ordered these items: "+ this.OrderedItemsList.get(0).GetName()+" and "
                +this.OrderedItemsList.get(1).GetName()  + " from supplier "+this.supplier.GetFirstName()
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
        System.out.println(this.TransportationManager+" has just communicated with delivery."+"\n");
    }
}

