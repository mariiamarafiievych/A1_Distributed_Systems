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

    public void setTargetedAdvertisement(){
        System.out.println(this.targetedAdvertSpec + " has just set new targeted advertisement."+"\n");
    }

    public void describeItems(ArrayList<Item> itemsList){
        String emptyString="";
        StringBuilder itemDescription = new StringBuilder(emptyString);
        itemDescription.append(this.contentManager);
        itemDescription.append(" has just written new descriptions for these items: ");
        for(int i=0;i<itemsList.size();i++)
            itemDescription.append(itemsList.get(i).getName()).append(" ");
        itemDescription.append("\n");
        System.out.println(itemDescription);
    }


}
