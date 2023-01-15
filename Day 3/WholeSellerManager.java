import java.io.FileOutputStream;
import java.io.*;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.DocumentException;
import com.itextpdf.kernel.pdf.PdfDocument;
//import com.itextpdf.kernel.pdf.PdfWriter;

import com.itextpdf.text.Image;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.DocWriter;



public class WholeSellerManager {

    public WholeSellerManager() {
    }

    public void wholeSellerPurchase(List<Product> productList, WholeSeller wholeSeller) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Id");
        int productId = sc.nextInt();
        if(productId>3){
            System.out.println("\n---- No Such Product Found ----\n");
            return;
        }
        System.out.println("Enter Quantity");
        int quantity = sc.nextInt();

        for(int i = 0; i < productList.size(); i++) {
            if (productId == productList.get(i).getId()) {
                long price = productList.get(i).getPrice()+((productList.get(i).getPrice() * 10)/100);
                Product product = new Product(productList.get(i).getId(), productList.get(i).getName(),price, 0);
                if (checkQuantity(quantity, productList.get(i).getStock())) {
                    if (wholeSeller.getWholeSellerProducts().size() == 0) {
                        wholeSeller.getWholeSellerProducts().add(product);
                        wholeSeller.getWholeSellerProducts().get(0).setStock(wholeSeller.getWholeSellerProducts().get(0).getStock() + quantity);
                        productList.get(i).setStock(productList.get(i).getStock() - quantity);
                        System.out.println("---- Purchase Successful ----");
                        System.out.println();
                        break;
                    }

                    if (isProductAlreadyPresent(wholeSeller, productId)) {
                        for (Product wholeSellerProduct : wholeSeller.getWholeSellerProducts()) {
                            wholeSellerProduct.setStock(wholeSellerProduct.getStock() + quantity);
                            productList.get(i).setStock(productList.get(i).getStock() - quantity);
                            System.out.println("---- Purchase Successful ----");
                            System.out.println();
                        }
                    } else {
                        ListIterator<Product> wholeSellerProductIterator = wholeSeller.getWholeSellerProducts().listIterator();
                        while (wholeSellerProductIterator.hasNext()) {
                            Product newProduct = new Product(product.getId(), product.getName(),price, quantity);
                            wholeSeller.getWholeSellerProducts().add(newProduct);
                          //  wholeSellerProductIterator.next().setStock(wholeSellerProductIterator.previous().getStock() + quantity);
                            productList.get(i).setStock(productList.get(i).getStock() - quantity);
                            System.out.println("---- Purchase Successful ----");
                            System.out.println();
                            break;
                        }
                    }
                }
            }
        }
    }

    private boolean isProductAlreadyPresent(WholeSeller wholeSeller, int productId) {
        boolean isProductPresent = false;
        for (Product wholeSellerProduct : wholeSeller.getWholeSellerProducts()) {
            if (productId == wholeSellerProduct.getId()) {
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

    public void displayWholeSellerProducts(WholeSeller wholeSeller) {
        System.out.println("Products Available with the wholeseller");
        System.out.println("\nWhole Seller Name:" + wholeSeller.getWholeseller_name() + " ID: " + wholeSeller.getWholeseller_id());
        System.out.println("\nList of products");
        for (int j = 0;  j < wholeSeller.getWholeSellerProducts().size(); j++) {
            Product product = wholeSeller.getWholeSellerProducts().get(j);
            System.out.println();
            System.out.println("Product ID  :" + product.getId());
            System.out.println("Product Name  :" + product.getName());
            System.out.println("Product Price :" + product.getPrice());
            System.out.println("Product Stock  :" + product.getStock());
            System.out.println();
        }
        System.out.println();
    }

//    public void wholesellerInvoice(int product_id,String Product_name,long price,int stock){
//        Document document=new Document();
//        String dest = "/users/Abinesh/pongal/src/invoice.pdf";
//        PdfWriter writer;
//        writer = new PdfWriter(dest);
//        try (PdfDocument pdfDoc = new PdfDocument(writer)) {
//        }
//
//
//        try{
//            PdfWriter pdfWriter = new PdfWriter.getInstance(document , new FileOutputStream("Invoice.pdf"));
//           document.open();
//            document.add(new Paragraph("Hii"));
//        }catch (DocumentException e){
//            e.printStackTrace();
//       }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//    }
}

