import entities.*;
import services.*;

import java.util.ArrayList;
import java.util.Date;

public final class Main {
    public static void createOrderedItems(LogisticService logisticsService){
        Item orderedBalm = new Item("Balm", "Avene", 4.85);
        Item orderedShampoo = new Item("Shampoo", "Clarins", 4.75);
        logisticsService.makeOrderedItemsList(orderedBalm);
        logisticsService.makeOrderedItemsList(orderedShampoo);
    }

    public static void  createBodyCreamList(ArrayList<Item> bodyCreamList){
        Item bodyCream1 = new Item("Body Cream", "Avene", 2.50);
        Item bodyCream2 = new Item("Body Cream", "Clarins", 5.50);
        Item bodyCream3 = new Item("Body Cream", "Avene", 2.50);
        bodyCreamList.add(bodyCream1);
        bodyCreamList.add(bodyCream2);
        bodyCreamList.add(bodyCream3);
        for(int i=0; i<bodyCreamList.size()-1; i++)
          System.out.println(bodyCreamList.get(i).toString());
    }

    public static void createFaceCreamList(ArrayList<Item> faceCreamList){
        Item faceCream1 = new Item("Face Cream", "La Roche-Posay", 3.75);
        Item faceCream2 = new Item("Face Cream", "La Roche-Posay", 3.75);
        faceCreamList.add(faceCream1);
        faceCreamList.add(faceCream2);
        for(int i=0; i<faceCreamList.size()-1; i++)
            System.out.println(faceCreamList.get(i).toString());
    }

    public static void createLotionList(ArrayList<Item> lotionList){
        Item lotion1 = new Item("Lotion", "Avene",  2.00);
        Item lotion2 = new Item("Lotion", "Avene",  2.00);
        lotionList.add(lotion1);
        lotionList.add(lotion2);
        for(int i=0; i<lotionList.size()-1; i++)
            System.out.println(lotionList.get(i).toString());
    }

    public static void  createShampooList(ArrayList<Item> shampooList){
        Item shampoo = new Item("Shampoo", "Clarins",  4.75);
        shampooList.add(shampoo);
        System.out.println(shampooList.get(0).toString());
    }

    public static void createBalmList(ArrayList<Item> balmList){
        Item balm = new Item("Balm", "Avene", 4.85);
        balmList.add(balm);
        System.out.println(balmList.get(0).toString());
    }

    public static void createItemsToBuy(Customer customer){
        Item lotionToBuy = new Item("Lotion", "Avene", 2.00);
        Item faceCreamToBuy = new Item("Face Cream", "La Roche-Posay", 3.75);
        customer.addItem(lotionToBuy);
        customer.addItem(faceCreamToBuy);
    }


    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date:" +date+"\n");

        ArrayList<Item> orderedItems = new ArrayList<>();
        ArrayList<Item> bodyCreamList = new ArrayList<>();
        ArrayList<Item> faceCreamList = new ArrayList<>();
        ArrayList<Item> lotionList = new ArrayList<>();
        ArrayList<Item> shampooList = new ArrayList<>();
        ArrayList<Item> balmList = new ArrayList<>();

        createBodyCreamList(bodyCreamList);
        createFaceCreamList(faceCreamList);
        createLotionList(lotionList);
        createShampooList(shampooList);
        createBalmList(balmList);

        Customer customer = new Customer("Mariia", "Petrenko");
        createItemsToBuy(customer);

        Supplier supplier = new Supplier("Fedor", "Fedorov", orderedItems);

        StaffMember purchaseManager = new StaffMember("Purchase Manager", "Diana", "Frolova", 2000);
        StaffMember transportationManager = new StaffMember("Transportation Manager", "Alex", "Petrov", 2000);
        LogisticService logisticsService = new LogisticService(purchaseManager, transportationManager, supplier, orderedItems);
        createOrderedItems(logisticsService);

        StaffMember salesManager = new StaffMember("Sales Manager", "Kateryna", "Melnyk", 1750);
        StaffMember accountManager = new StaffMember("Account Manager", "Iryna", "Volkova", 2200);
        SalesService salesService = new SalesService(salesManager, accountManager);

        StaffMember targetedAdvertSpec = new StaffMember("Targeted Advertasing Spec.", "Ihor", "Ivanov", 2200);
        StaffMember contentManager = new StaffMember("Content Manager", "Olena", "Klymenko", 2000);
        MarketingService marketingService = new MarketingService(targetedAdvertSpec,contentManager);

        StaffMember webDeveloper = new StaffMember("Web-developer", "Bogdan", "Alexandrov", 2500);
        StaffMember webDesigner = new StaffMember("Web-designer", "Daryna", "Yakovleva", 2000);
        ITService itService = new ITService(webDesigner, webDeveloper);

        logisticsService.orderItems(orderedItems);
        logisticsService.communicateWithDelivery();

        System.out.println(supplier.supplierInfo(orderedItems));

        logisticsService.addItems(balmList, orderedItems.get(0));
        logisticsService.addItems(shampooList, orderedItems.get(1));

        System.out.println(customer.toString());

        logisticsService.removeItems(lotionList);
        logisticsService.removeItems(faceCreamList);

        marketingService.setTargetedAdvertisement();
        marketingService.describeItems(orderedItems);

        salesService.makeCommercialOffer();
        salesService.monitorMarket();
        salesService.searchForClients();
        salesService.solveConflicts(customer);

        itService.fixBugs(customer);
        itService.improveInterface();
        customer.clearShopCart();
    }
}