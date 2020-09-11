package services;

import entities.Customer;
import entities.StaffMember;

public final class ITService {
    private final StaffMember webDesigner;
    private final StaffMember webDeveloper;
    Customer customer;

    public ITService(StaffMember webDesigner, StaffMember webDeveloper, Customer customer) {
        this.webDesigner = webDesigner;
        this.webDeveloper = webDeveloper;
        this.customer = customer;
    }

    public void FixBugs(){
        System.out.println(this.webDeveloper +" has just fixed the bug, what the customer "
                + this.customer.GetFirstName()+" "+this.customer.GetLastName()+ " was complaining about."+"\n");
    }

    public void ImproveInterface(){
        System.out.println(this.webDesigner +" has just improved the interface."+"\n");
    }


}
