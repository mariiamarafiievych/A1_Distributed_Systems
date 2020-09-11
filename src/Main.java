import entities.*;
import services.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public final class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date:" +date+"\n");

        Item bodyCream1 = new Item("Body Cream", "Avene", 2.50);
        Item bodyCream2 = new Item("Body Cream", "Clarins", 5.50);
        Item bodyCream3 = new Item("Body Cream", "Avene", 2.50);
        Item faceCream1 = new Item("Face Cream", "La Roche-Posay", 3.75);
        Item faceCream2 = new Item("Face Cream", "La Roche-Posay", 3.75);
        Item lotion1 = new Item("Lotion", "Avene",  2.00);
        Item lotion2 = new Item("Lotion", "Avene",  2.00);
        Item shampoo = new Item("Shampoo", "Clarins",  4.75);
        Item balm = new Item("Balm", "Avene", 4.85);

        Item orderedBalm = new Item("Balm", "Avene", 4.85);
        Item orderedShampoo = new Item("Shampoo", "Clarins", 4.75);

        Item lotionToBuy = new Item("Lotion", "Avene", 2.00);
        Item faceCreamToBuy = new Item("Face Cream", "La Roche-Posay", 3.75);

        ArrayList<Item> bodyCreamList = new ArrayList<>(Arrays.asList(bodyCream1, bodyCream2,bodyCream3));
        ArrayList<Item> faceCreamList = new ArrayList<>(Arrays.asList(faceCream1,faceCream2));
        ArrayList<Item> lotionList = new ArrayList<>(Arrays.asList(lotion1, lotion2));
        ArrayList<Item> shampooList = new ArrayList<>(Arrays.asList(shampoo));
        ArrayList<Item> balmList = new ArrayList<>(Arrays.asList(balm));

        ArrayList<Item> orderedItems = new ArrayList<>();

        StaffMember purchaseManager = new StaffMember("Purchase Manager", "Diana", "Frolova", 2000);
        StaffMember transportationManager = new StaffMember("Transportation Manager", "Alex", "Petrov", 2000);
        StaffMember salesManager = new StaffMember("Sales Manager", "Kateryna", "Melnyk", 1750);
        StaffMember accountManager = new StaffMember("Account Manager", "Iryna", "Volkova", 2200);
        StaffMember targetedAdvertSpec = new StaffMember("Targeted Advertasing Spec.", "Ihor", "Ivanov", 2200);
        StaffMember contentManager = new StaffMember("Content Manager", "Olena", "Klymenko", 2000);
        StaffMember webDeveloper = new StaffMember("Web-developer", "Bogdan", "Alexandrov", 2500);
        StaffMember webDesigner = new StaffMember("Web-designer", "Daryna", "Yakovleva", 2000);

        Customer customer = new Customer("Mariia", "Petrenko");
        customer.AddItem(lotionToBuy);
        customer.AddItem(faceCreamToBuy);

        Supplier supplier = new Supplier("Fedor", "Fedorov", orderedItems);

        ITService itService = new ITService(webDesigner, webDeveloper, customer);
        LogisticService logisticsService = new LogisticService(purchaseManager, transportationManager, supplier, orderedItems);
        MarketingService marketingService = new MarketingService(targetedAdvertSpec,contentManager);
        SalesService salesService = new SalesService(salesManager, accountManager, customer);

        System.out.println(shampooList.get(0).toString());
        System.out.println(bodyCreamList.get(0).toString());
        System.out.println(bodyCreamList.get(1).toString());
        System.out.println(bodyCreamList.get(2).toString());
        System.out.println(faceCreamList.get(0).toString());
        System.out.println(lotionList.get(0).toString());
        System.out.println(lotionList.get(1).toString());
        System.out.println(balmList.get(0).toString());

        logisticsService.CommunicateWithSuppliers(supplier);
        logisticsService.MakeOrderedItemsList(orderedBalm);
        logisticsService.MakeOrderedItemsList(orderedShampoo);
        logisticsService.OrderItems(orderedItems);
        logisticsService.CommunicateWithDelivery();

        System.out.println(supplier.toString(orderedItems));

        logisticsService.AddItems(balmList, orderedItems.get(0));
        logisticsService.AddItems(shampooList, orderedItems.get(1));

        System.out.println(customer.toString());

        logisticsService.RemoveItems(lotionList);
        logisticsService.RemoveItems(faceCreamList);

        marketingService.SetTargetedAdvertisement();
        marketingService.DescribeItems(orderedItems);

        salesService.MakeCommercialOffer();
        salesService.MonitorMarket();
        salesService.SearchForClients();
        salesService.SolveConflicts(customer);

        itService.FixBugs();
        itService.ImproveInterface();
        customer.ClearShopCart();
    }
}