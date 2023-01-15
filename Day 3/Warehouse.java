import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Warehouse {



    ArrayList<Product> products =new ArrayList<>();

    public void add() {
//        String path="/users/Abinesh/Pongal/src/Products.csv";
//        File file = new File(path);
//        try (FileReader fr = new FileReader(file)) {
//            BufferedReader br = new BufferedReader(fr);
//            String line = br.readLine();
//            while (line != null) {
//                String[] attributes = line.split(",");
//                int id = Integer.parseInt(attributes[0]);
//                String name = attributes[1];
//                long price = Long.parseLong(attributes[2]);
//                int quantity=Integer.parseInt(attributes[3]);
//                products.add(new Product(id,name,price,quantity));
//            }
//            br.close();
//            } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Product p1=new Product(1,"Smart Phone", 10000,100);
        Product p2=new Product(2,"Washing Machine",20000,100);
        Product p3=new Product(3,"Television",30000,100);

        products.add(p1);
        products.add(p2);
        products.add(p3);

    }
//    public createBook(String[] attributes) {
//
//
//    }

    public List<Product> getProductList() {
        return products;
    }

    public void displayWarehouse() {
        System.out.println("Products Available in the WareHouse\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("Product ID    :" + products.get(i).getId());
            System.out.println("Product Name  :" + products.get(i).getName());
            System.out.println("Product Price :" + products.get(i).getPrice());
            System.out.println("Product Stock :" + products.get(i).getStock());
            System.out.println();
        }
    }
}

