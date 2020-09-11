package services;
import entities.StaffMember;
import entities.Item;

import java.util.ArrayList;

public final class MarketingService {
    private final StaffMember targetedAdvertSpec;
    private final StaffMember contentManager;

    public MarketingService(StaffMember targetedAdvertSpec, StaffMember contentManager) {
        this.targetedAdvertSpec = targetedAdvertSpec;
        this.contentManager = contentManager;
    }

    public void SetTargetedAdvertisement(){
        System.out.println(this.targetedAdvertSpec + " has just set new targeted advertisement."+"\n");
    }

    public void DescribeItems(ArrayList<Item> itemsList){
        System.out.println(this.contentManager +" has just written new descriptions for these items: "+ itemsList.get(0).GetName()
                +" "+itemsList.get(1).GetName() +"\n");
    }


}
