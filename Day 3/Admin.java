import java.util.List;
import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.add();
        //warehouse.displayWarehouse();
        WholeSeller wholeSeller = new WholeSeller();
        Retailer retailer=new Retailer();
        wholeSeller.add();
        retailer.add();
        RetailerManager retailerManager=new RetailerManager();
        Scanner scanner=new Scanner(System.in);
        List<WholeSeller> wholeSellerList = wholeSeller.getWholeSellerList();
        WholeSellerManager wholeSellerManager = new WholeSellerManager();
        List<Retailer> retailerlist= retailer.getRetailerList();
        int control=1,choice;
        while(control>0){
            System.out.println("Enter Your Choice \n1.Display WareHouse\n2.Wholeseller Purchase\n3.Wholeseller Details\n4.Retailer Purchase\n5.Retailer Details\n6.Exit");
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    warehouse.displayWarehouse();
                    break;
                case 2:
                    System.out.println("Available Wholesellers :");
                    for (int i = 0; i < wholeSellerList.size(); i++) {
                        System.out.println(i+1+"."+wholeSellerList.get(i).getWholeseller_name());
                    }
                    choice=scanner.nextInt();

                    switch(choice){
                        case 1:
                            wholeSellerManager.wholeSellerPurchase(warehouse.getProductList(), wholeSellerList.get(0));
                            //wholeSellerManager.displayWholeSellerProducts(wholeSellerList.get(0));
                            break;
                        case 2:
                            wholeSellerManager.wholeSellerPurchase(warehouse.getProductList(), wholeSellerList.get(1));
                            //wholeSellerManager.displayWholeSellerProducts(wholeSellerList.get(1));
                            break;
                        case 3:
                            wholeSellerManager.wholeSellerPurchase(warehouse.getProductList(), wholeSellerList.get(2));
                            //wholeSellerManager.displayWholeSellerProducts(wholeSellerList.get(2));
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Available Wholesellers :");
                    for (int i = 0; i < wholeSellerList.size(); i++) {
                        System.out.println(i+1+"."+wholeSellerList.get(i).getWholeseller_name());
                    }
                    choice=scanner.nextInt();

                    switch(choice){
                        case 1:
                            wholeSellerManager.displayWholeSellerProducts(wholeSellerList.get(0));
                            break;
                        case 2:
                            wholeSellerManager.displayWholeSellerProducts(wholeSellerList.get(1));
                            break;
                        case 3:
                            wholeSellerManager.displayWholeSellerProducts(wholeSellerList.get(2));
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Available Retailers :");
                    for (int i = 0; i < retailerlist.size(); i++) {
                        System.out.println(i+1+"."+retailerlist.get(i).getRetailer_name());
                    }
                    choice=scanner.nextInt();
                    switch(choice) {
                        case 1:
                            System.out.println("Available Wholesellers :");
                            for (int i = 0; i < wholeSellerList.size(); i++) {
                                System.out.println(i + 1 + "." + wholeSellerList.get(i).getWholeseller_name());
                            }
                            choice=scanner.nextInt();
                            switch(choice) {
                                case 1:
                                    retailerManager.retailerPurchase(wholeSellerList.get(0).getWholeSellerProducts(), retailerlist.get(0));
                                    break;
                                case 2:
                                    retailerManager.retailerPurchase(wholeSellerList.get(1).getWholeSellerProducts(), retailerlist.get(0));
                                    break;
                                case 3:
                                    retailerManager.retailerPurchase(wholeSellerList.get(2).getWholeSellerProducts(), retailerlist.get(0));
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("Available Wholesellers :");
                            for (int i = 0; i < wholeSellerList.size(); i++) {
                                System.out.println(i + 1 + "." + wholeSellerList.get(i).getWholeseller_name());
                            }
                            choice=scanner.nextInt();
                            switch(choice) {
                                case 1:
                                    retailerManager.retailerPurchase(wholeSellerList.get(0).getWholeSellerProducts(), retailerlist.get(1));
                                    break;
                                case 2:
                                    retailerManager.retailerPurchase(wholeSellerList.get(1).getWholeSellerProducts(), retailerlist.get(1));
                                    break;
                                case 3:
                                    retailerManager.retailerPurchase(wholeSellerList.get(2).getWholeSellerProducts(), retailerlist.get(1));
                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("Available Wholesellers :");
                            for (int i = 0; i < wholeSellerList.size(); i++) {
                                System.out.println(i + 1 + "." + wholeSellerList.get(i).getWholeseller_name());
                            }
                            switch(choice) {
                                case 1:
                                    retailerManager.retailerPurchase(wholeSellerList.get(0).getWholeSellerProducts(), retailerlist.get(2));
                                    break;
                                case 2:
                                    retailerManager.retailerPurchase(wholeSellerList.get(1).getWholeSellerProducts(), retailerlist.get(2));
                                    break;
                                case 3:
                                    retailerManager.retailerPurchase(wholeSellerList.get(2).getWholeSellerProducts(), retailerlist.get(2));
                                    break;
                            }
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Available Retailers :");
                    for (int i = 0; i < retailerlist.size(); i++) {
                        System.out.println(i + 1 + "." + retailerlist.get(i).getRetailer_name());
                    }
                    choice=scanner.nextInt();

                    switch(choice){
                        case 1:
                            retailerManager.displayRetailerProductDetails(retailerlist.get(0));
                            break;
                        case 2:
                            retailerManager.displayRetailerProductDetails(retailerlist.get(1));
                            break;
                        case 3:
                            retailerManager.displayRetailerProductDetails(retailerlist.get(2));
                            break;
                    }
                    //retailerManager.displayRetailerProducts(retailerlist.get(1));
                    break;
                case 6:
                    control=-1;
            }
        }


//        System.out.println("Available Wholesellers :");
//        for (int i = 0; i < wholeSellerList.size(); i++) {
//            System.out.println(i+1+"."+wholeSellerList.get(i).getWholeseller_name());
//        }
//        choice=scanner.nextInt();
//
//        switch(choice){
//            case 1:
//                wholeSellerManager.wholeSellerPurchase(warehouse.getProductList(), wholeSellerList.get(0));
//                wholeSellerManager.displayWholeSellerProducts(wholeSellerList.get(0));
//                break;
//            case 2:
//                wholeSellerManager.wholeSellerPurchase(warehouse.getProductList(), wholeSellerList.get(1));
//                wholeSellerManager.displayWholeSellerProducts(wholeSellerList.get(1));
//                break;
//            case 3:
//                wholeSellerManager.wholeSellerPurchase(warehouse.getProductList(), wholeSellerList.get(2));
//                wholeSellerManager.displayWholeSellerProducts(wholeSellerList.get(2));
//                break;
//        }
//        System.out.println("Updated Warehouse product details");
//        System.out.println();
//        warehouse.displayWarehouse();





        //for (int i = 0; i < wholeSellerList.size(); i++) {
        //    System.out.println("Wholeseller Name: " + wholeSellerList.get(i).getWholeseller_name());
        //    wholeSellerManager.wholeSellerPurchase(warehouse.getProductList(), wholeSellerList.get(i));
        //    wholeSellerManager.displayWholeSellerProducts(wholeSellerList.get(i));
        //}


//        WholeSeller wholeSeller = new WholeSeller();
//        Retailer retailer = new Retailer();
//        wholeSeller.add();
//        retailer.add();
//        retailer.wholesellerPurchase();
//
//
//        wholeSeller.display_warehouse();
        //wholeSeller.wholesellerPurchase();
    }
}
