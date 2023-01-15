import java.util.ArrayList;
import java.util.List;

public class WholeSeller {

    int wholeseller_id;
    String wholeseller_name;
    List<Product> wholeSellerProducts = new ArrayList<>();
    List<WholeSeller> wholeSellers = new ArrayList<>();

    public WholeSeller() {
    }

    public int getWholeseller_id() {
        return wholeseller_id;
    }

    public String getWholeseller_name() {
        return wholeseller_name;
    }

    public WholeSeller(int wholeseller_id, String wholeseller_name) {
        this.wholeseller_id = wholeseller_id;
        this.wholeseller_name = wholeseller_name;
    }


    public List<Product> getWholeSellerProducts() {
        return wholeSellerProducts;
    }


    public void add() {
//        String path="/users/Abinesh/Pongal/wholesellers.csv";
//        File file = new File(path);
//        try (FileReader fr = new FileReader(file)) {
//            BufferedReader br = new BufferedReader(fr);
//            String line = br.readLine();
//            while (line != null) {
//                String[] attributes = line.split(",");
//                int wholeseller_id = Integer.parseInt(attributes[0]);
//                String name = attributes[1];
//                wholeSellers.add(new WholeSeller(wholeseller_id,wholeseller_name));
//            }
//            br.close();
//            } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        WholeSeller w1 = new WholeSeller(1001, "Adani");
        WholeSeller w2 = new WholeSeller(1002, "Reliance");
        WholeSeller w3 = new WholeSeller(1003, "Amazon");

        wholeSellers.add(w1);
        wholeSellers.add(w2);
        wholeSellers.add(w3);
    }


    public List<WholeSeller> getWholeSellerList() {
        return wholeSellers;
    }

}
