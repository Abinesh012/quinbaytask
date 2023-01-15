import java.util.*;

public class RetailerManager {

//    WholeSeller wholeSeller = new WholeSeller();
//    List<WholeSeller> wholeSellerList = wholeSeller.getWholeSellerList();
//    Warehouse warehouse = new Warehouse();
//    Retailer retailer=new Retailer();
//    WholeSellerManager wholeSellerManager = new WholeSellerManager();
//    List<Retailer> retailerlist= retailer.getRetailerList();
//    Scanner scanner=new Scanner(System.in);
//    int choice;

    public void retailerPurchase(List<Product> wholesellerProductsList, Retailer retailer) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Id");
        int productId = sc.nextInt();
        if(productId > 3){
            System.out.println("\n---- No Such Product Found ----\n");
            return;
        }
        System.out.println("Enter quantity");
        int quantity = sc.nextInt();

        for (int i = 0; i < wholesellerProductsList.size(); i++) {
            if (productId == wholesellerProductsList.get(i).getId()) {
                long price = wholesellerProductsList.get(i).getPrice()+((wholesellerProductsList.get(i).getPrice() * 10)/100);
                Product product = new Product(wholesellerProductsList.get(i).getId(), wholesellerProductsList.get(i).getName(),
                        price, 0);
                if (checkQuantity(quantity, wholesellerProductsList.get(i).getStock())) {
                    if (retailer.getRetailerProductList().size() == 0) {
                        retailer.getRetailerProductList().add(product);
                        retailer.getRetailerProductList().get(0).setStock(retailer.getRetailerProductList().get(0).getStock() + quantity);
                        wholesellerProductsList.get(i).setStock(wholesellerProductsList.get(i).getStock() - quantity);
                        System.out.println("---- Purchase Successful ----");
                        System.out.println();
                        break;
                    }

                    if (isProductAlreadyPresent(retailer, productId)) {
                        for (Product retailerProduct : retailer.getRetailerProductList()) {
                            retailerProduct.setStock(retailerProduct.getStock() + quantity);
                            wholesellerProductsList.get(i).setStock(wholesellerProductsList.get(i).getStock() - quantity);
                            System.out.println("---- Purchase Successful ----");
                            System.out.println();
                        }
                    } else {
                        ListIterator<Product> retailerProductIterator = retailer.getRetailerProductList().listIterator();
                        while (retailerProductIterator.hasNext()) {
                            Product newProduct = new Product(product.getId(), product.getName(),
                                    price, quantity);
                            retailer.getRetailerProductList().add(newProduct);
                            //  wholeSellerProductIterator.next().setStock(wholeSellerProductIterator.previous().getStock() + quantity);
                            wholesellerProductsList.get(i).setStock(wholesellerProductsList.get(i).getStock() - quantity);
                            System.out.println("---- Purchase Successful ----");
                            System.out.println();
                            break;
                        }
                    }
                }
            }
        }

    }
    private boolean isProductAlreadyPresent(Retailer retailer, int productId) {
        boolean isProductPresent = false;
        for (Product retailerProduct : retailer.getRetailerProductList()) {
            if (productId == retailerProduct.getId()) {
                isProductPresent = true;
            } else {
                isProductPresent = false;
            }
        }
        return isProductPresent;
    }


    private boolean checkQuantity(int quantity, int stock) {
        if (quantity <= stock) {
            return true;
        } else if (stock==0){
            System.out.println("\nProduct Out Of Stock\n");
            return false;
        }
        else {
            System.out.println("Available Quantity : "+stock+" Purchase within the Available Quantity\n");
            return false;
        }
    }

    public void displayRetailerProductDetails(Retailer retailer) {
        System.out.println("Products Available with the retailer");
        System.out.println("\nRetailer Name:" + retailer.getRetailer_name() + " ID: " + retailer.getRetailer_id());
        System.out.println("\nList of products");
        for (int j = 0;  j < retailer.getRetailerProductList().size(); j++) {
            Product product = retailer.getRetailerProductList().get(j);
            System.out.println();
            System.out.println("Product ID  :" + product.getId());
            System.out.println("Product Name  :" + product.getName());
            System.out.println("Product Price :" + product.getPrice());
            System.out.println("Product Stock  :" + product.getStock());
            System.out.println();
        }
        System.out.println();
    }


//    choice=scanner.nextInt();
//        switch (choice) {
//        case 1:
//            System.out.println("Available Retailers :");
//            for (int i = 0; i < retailerlist.size(); i++) {
//                System.out.println(i+1+"."+retailerlist.get(i).getRetailer_name());
//            }
//            choice=scanner.nextInt();
//            //wholeSellerManager.wholeSellerPurchase(warehouse.getProductList(), wholeSellerList.get(0));
//            //wholeSellerManager.displayWholeSellerProducts(wholeSellerList.get(0));
//            System.out.println("Product ID  :" + wholesellerProductsList.get(0).getWholeSellerProducts().get(0));
//            System.out.println("Product Name  :" + wholesellerProductsList.get(0).getWholeSellerProducts().get(1));
//            System.out.println("Product Price :" + wholesellerProductsList.get(0).getWholeSellerProducts().get(2));
//            System.out.println("Product Stock  :" +wholesellerProductsList.get(0).getWholeSellerProducts().get(3));
//            System.out.println();
//            break;
//
//        case 2:
//            wholeSellerManager.wholeSellerPurchase(warehouse.getProductList(), wholeSellerList.get(1));
//            wholeSellerManager.displayWholeSellerProducts(wholeSellerList.get(1));
//            break;
//
//        case 3:
//            wholeSellerManager.wholeSellerPurchase(warehouse.getProductList(), wholeSellerList.get(2));
//            wholeSellerManager.displayWholeSellerProducts(wholeSellerList.get(2));
//            break;
//
//    }





}
