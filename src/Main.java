import Entities.*;
import Services.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public final class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date:" +date+"\n");

        Item BodyCream1 = new Item("Body Cream", "Avene", 2.50);
        Item BodyCream2 = new Item("Body Cream", "Clarins", 5.50);
        Item BodyCream3 = new Item("Body Cream", "Avene", 2.50);
        Item FaceCream1 = new Item("Face Cream", "La Roche-Posay", 3.75);
        Item FaceCream2 = new Item("Face Cream", "La Roche-Posay", 3.75);
        Item Lotion1 = new Item("Lotion", "Avene",  2.00);
        Item Lotion2 = new Item("Lotion", "Avene",  2.00);
        Item Shampoo = new Item("Shampoo", "Clarins",  4.75);
        Item Balm = new Item("Balm", "Avene", 4.85);

        Item OrderedBalm = new Item("Balm", "Avene", 4.85);
        Item OrderedShampoo = new Item("Shampoo", "Clarins", 4.75);

        Item LotionToBuy = new Item("Lotion", "Avene", 2.00);
        Item FaceCreamToBuy = new Item("Face Cream", "La Roche-Posay", 3.75);

        ArrayList<Item> BodyCreamList = new ArrayList<>(Arrays.asList(BodyCream1, BodyCream2,BodyCream3));
        ArrayList<Item> FaceCreamList = new ArrayList<>(Arrays.asList(FaceCream1,FaceCream2));
        ArrayList<Item> LotionList = new ArrayList<>(Arrays.asList(Lotion1, Lotion2));
        ArrayList<Item> ShampooList = new ArrayList<>(Arrays.asList(Shampoo));
        ArrayList<Item> BalmList = new ArrayList<>(Arrays.asList(Balm));

        ArrayList<Item> OrderedItems = new ArrayList<>();
        ArrayList<Item> ShopCart = new ArrayList<>();

        StaffMember PurchaseManager = new StaffMember("Purchase Manager", "Diana", "Frolova", 2000);
        StaffMember TransportationManager = new StaffMember("Transportation Manager", "Alex", "Petrov", 2000);
        StaffMember SalesManager = new StaffMember("Sales Manager", "Kateryna", "Melnyk", 1750);
        StaffMember AccountManager = new StaffMember("Account Manager", "Iryna", "Volkova", 2200);
        StaffMember TargetedAdvertSpec = new StaffMember("Targeted Advertasing Spec.", "Ihor", "Ivanov", 2200);
        StaffMember ContentManager = new StaffMember("Content Manager", "Olena", "Klymenko", 2000);
        StaffMember WebDeveloper = new StaffMember("Web-developer", "Bogdan", "Alexandrov", 2500);
        StaffMember WebDesigner = new StaffMember("Web-designer", "Daryna", "Yakovleva", 2000);

        Customer customer = new Customer("Mariia", "Petrenko", ShopCart);
        customer.AddItem(LotionToBuy);
        customer.AddItem(FaceCreamToBuy);

        Supplier supplier = new Supplier("Fedor", "Fedorov", OrderedItems);

        ITService ITService = new ITService(WebDesigner, WebDeveloper, customer);
        LogisticService LogisticsService = new LogisticService(PurchaseManager, TransportationManager, supplier, OrderedItems);
        MarketingService MarketingService = new MarketingService(TargetedAdvertSpec,ContentManager);
        SalesService sales_service = new SalesService(SalesManager, AccountManager, customer);

        System.out.println(ShampooList.get(0).toString());
        System.out.println(BodyCreamList.get(0).toString());
        System.out.println(BodyCreamList.get(1).toString());
        System.out.println(BodyCreamList.get(2).toString());
        System.out.println(FaceCreamList.get(0).toString());
        System.out.println(LotionList.get(0).toString());
        System.out.println(LotionList.get(1).toString());
        System.out.println(BalmList.get(0).toString());

        LogisticsService.CommunicateWithSuppliers(supplier);
        LogisticsService.MakeOrderedItemsList(OrderedBalm);
        LogisticsService.MakeOrderedItemsList(OrderedShampoo);
        LogisticsService.OrderItems(OrderedItems);
        LogisticsService.CommunicateWithDelivery();

        System.out.println(supplier.toString(OrderedItems));

        LogisticsService.AddItems(BalmList, OrderedItems.get(0));
        LogisticsService.AddItems(ShampooList, OrderedItems.get(1));

        System.out.println(customer.toString());
        customer.ClearShopCart(ShopCart);

        LogisticsService.RemoveItems(LotionList);
        LogisticsService.RemoveItems(FaceCreamList);

        MarketingService.SetTargetedAdvertisement();
        MarketingService.DescribeItems(OrderedItems);

        sales_service.MakeCommercialOffer();
        sales_service.MonitorMarket();
        sales_service.SearchForClients();
        sales_service.SolveConflicts(customer);

        ITService.FixBugs();
        ITService.ImproveInterface();
    }
}