package Services;

import Entities.Customer;
import Entities.StaffMember;

public final class ITService {
    private final StaffMember WebDesigner;
    private final StaffMember WebDeveloper;
    Customer Customer;

    public ITService(StaffMember WebDesigner, StaffMember WebDeveloper, Customer Customer) {
        this.WebDesigner= WebDesigner;
        this.WebDeveloper = WebDeveloper;
        this.Customer = Customer;
    }

    public void FixBugs(){
        System.out.println(this.WebDeveloper+" has just fixed the bug, what the customer "
                + this.Customer.GetFirstName()+" "+this.Customer.GetLastName()+ " was complaining about."+"\n");
    }

    public void ImproveInterface(){
        System.out.println(this.WebDesigner+" has just improved the interface."+"\n");
    }


}
