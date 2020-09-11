package services;
import entities.Customer;
import entities.StaffMember;

public final class SalesService {
    private final StaffMember salesManager;
    private final StaffMember accountManager;
    private final Customer customer;

    public SalesService(StaffMember salesManager, StaffMember accountManager, Customer customer) {
        this.salesManager = salesManager;
        this.accountManager = accountManager;
        this.customer = customer;
    }

    public void MonitorMarket(){
        System.out.println(this.salesManager +" has just monitored the market."+"\n");
    }

    public void MakeCommercialOffer(){
        System.out.println(this.salesManager +" has just made a new commercial offer."+"\n");
    }

    public void SolveConflicts(Customer customer){
        System.out.println(this.accountManager +" has just solved a conflict with a client "+this.customer.GetFirstName()
                +" " +this.customer.GetLastName()+"\n");
    }

    public void SearchForClients(){
        System.out.println(this.accountManager +" has just made a method of searching for clients."+"\n");
    }

}
