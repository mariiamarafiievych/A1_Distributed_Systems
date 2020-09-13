package services;

import entities.Customer;
import entities.StaffMember;

public final class ITService {
    private final StaffMember webDesigner;
    private final StaffMember webDeveloper;

    public ITService(StaffMember webDesigner, StaffMember webDeveloper) {
        this.webDesigner = webDesigner;
        this.webDeveloper = webDeveloper;
    }

    public void fixBugs(Customer customer){
        String emptyString="";
        StringBuilder fixingBugs = new StringBuilder(emptyString);
        fixingBugs.append(this.webDeveloper);
        fixingBugs.append(" has just fixed the bug, what the customer ");
        fixingBugs.append(customer.getFirstName()).append(" ")
                .append(customer.getLastName());
        fixingBugs.append(" was complaining about.").append("\n");
        System.out.println(fixingBugs);
    }

    public void improveInterface(){
        System.out.println(this.webDesigner +" has just improved the interface."+"\n");
    }


}
