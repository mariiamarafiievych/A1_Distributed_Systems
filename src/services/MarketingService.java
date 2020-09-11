package services;
import entities.StaffMember;
import entities.Item;

import java.util.ArrayList;

public final class MarketingService {
    private final StaffMember TargetedAdvertSpec;
    private final StaffMember ContentManager;

    public MarketingService(StaffMember TargetedAdvertSpec, StaffMember ContentManager) {
        this.TargetedAdvertSpec= TargetedAdvertSpec;
        this.ContentManager = ContentManager;
    }

    public void SetTargetedAdvertisement(){
        System.out.println(this.TargetedAdvertSpec + " has just set new targeted advertisement."+"\n");
    }

    public void DescribeItems(ArrayList<Item> ItemsList){
        System.out.println(this.ContentManager+" has just written new descriptions for these items: "+ ItemsList.get(0).GetName()
                +" "+ItemsList.get(1).GetName() +"\n");
    }


}
