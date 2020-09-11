package services;
import entities.Customer;
import entities.StaffMember;

public final class SalesService {
    private final StaffMember SalesManager;
    private final StaffMember AccountManager;
    private final Customer customer;

    public SalesService(StaffMember SalesManager, StaffMember AccountManager, Customer customer) {
        this.SalesManager= SalesManager;
        this.AccountManager = AccountManager;
        this.customer = customer;
    }

    public void MonitorMarket(){
        System.out.println(this.SalesManager+" has just monitored the market."+"\n");
    }

    public void MakeCommercialOffer(){
        System.out.println(this.SalesManager+" has just made a new commercial offer."+"\n");
    }

    public void SolveConflicts(Customer customer){
        System.out.println(this.AccountManager+" has just solved a conflict with a client "+this.customer.GetFirstName()
                +" " +this.customer.GetLastName()+"\n");
    }

    public void SearchForClients(){
        System.out.println(this.AccountManager+" has just made a method of searching for clients."+"\n");
    }

}
