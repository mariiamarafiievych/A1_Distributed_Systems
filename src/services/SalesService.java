package services;
import entities.Customer;
import entities.StaffMember;

public final class SalesService {
    private final StaffMember salesManager;
    private final StaffMember accountManager;

    public SalesService(StaffMember salesManager, StaffMember accountManager) {
        this.salesManager = salesManager;
        this.accountManager = accountManager;
    }

    public void monitorMarket(){
        System.out.println(this.salesManager +" has just monitored the market."+"\n");
    }

    public void makeCommercialOffer(){
        System.out.println(this.salesManager +" has just made a new commercial offer."+"\n");
    }

    public void solveConflicts(Customer customer){
        System.out.println(this.accountManager +" has just solved a conflict with a client "+customer.getFirstName()
                +" " +customer.getLastName()+"\n");
    }

    public void searchForClients(){
        System.out.println(this.accountManager +" has just made a method of searching for clients."+"\n");
    }

}
