import java.util.ArrayList;
import java.util.List;

public class Retailer {

    //List<Product> wholeSellerProducts = new ArrayList<>();
    //int stock;
    int retailer_id;
    String retailer_name;

    List<Product> retailerProductList = new ArrayList<>();
    List<Retailer> retailers = new ArrayList<>();


    public int getRetailer_id() {
        return retailer_id;
    }

    public String getRetailer_name() {
        return retailer_name;
    }
    public Retailer(int retailer_id, String retailer_name) {
        this.retailer_id = retailer_id;
        this.retailer_name = retailer_name;
    }
//    public List<Retailer> getRetailers() {
//        return retailers;
//    }
//    public void setRetailers(List<Retailer> retailers) {
//        this.retailers = retailers;
//    }

    public List<Product> getRetailerProductList() {
        return retailerProductList;
    }

//    public void setRetailerProductList(List<Product> retailerProductList) {
//        this.retailerProductList = retailerProductList;
//    }

//    public List<Product> retailerProducts() {
//        return retailerProducts();
//    }
    public List<Retailer> getRetailerList() {
        return retailers;
    }


    void add(){
//        String path="/users/Abinesh/Pongal/retailers.csv";
//        File file = new File(path);
//        try (FileReader fr = new FileReader(file)) {
//            BufferedReader br = new BufferedReader(fr);
//            String line = br.readLine();
//            while (line != null) {
//                String[] attributes = line.split(",");
//                int retailer_id = Integer.parseInt(attributes[0]);
//                String retailer_name = attributes[1];
//                retailers.add(new Retailer(retailer_id,retailer_name));
//            }
//            br.close();
//            } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Retailer r1 = new Retailer(2001, "Chennai Mobiles");
        Retailer r2 = new Retailer(2002, "Poorvika Mobiles");
        Retailer r3 = new Retailer(2003, "Supreme Mobiles");
        retailers.add(r1);
        retailers.add(r2);
        retailers.add(r3);

    }

    public Retailer(){

    }
}
