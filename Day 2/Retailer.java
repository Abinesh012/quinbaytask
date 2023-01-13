import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Retailer extends Wholesaler{
    int r_id;
    String r_name;
    ArrayList<Producer> retail_productlist=new ArrayList<>();
    Retailer(int id,String name){
        this.r_id=id;
        this.r_name=name;
        this.retail_productlist.add(new Producer(100,"Watch",1000,55000));
        this.retail_productlist.add(new Producer(101,"TV",1000,60000));
        this.retail_productlist.add(new Producer(102,"Laptop",1000,65000));
    }
    void add_stock(Producer whole_stock){
        for(Producer prod1: retail_productlist) {
            if (prod1.id == whole_stock.id){
                prod1.stock=prod1.stock+whole_stock.stock;

            }
        }
    }

    void disp_ret_stock(){
        System.out.println(r_id+"\t"+r_name+" Products");
        try {
            if (retail_productlist.size() == 0) {
                System.out.println("\tNo Products Available");
            } else {
                for (Producer r_list : this.retail_productlist) {
                    System.out.println("\t"+r_list.id + "\t" + r_list.name + "\t" + r_list.stock + "\t" + r_list.price);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){

        String prod_fileName= "/Users/abinesh/Morning/src/Producer.csv";
        File prod_file= new File(prod_fileName);
        List<List<String>> prod = new ArrayList<>();
        Scanner prod_inputStream;
        try{
            prod_inputStream = new Scanner(prod_file);

            while(prod_inputStream.hasNext()){
                String prod_line= prod_inputStream.next();
                String[] values = prod_line.split(",");
                prod.add(Arrays.asList(values));
            }
            prod_inputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Producer apple[] = new Producer[10];
        for(int i=0;i<prod.size();i++){
            apple[i]= new Producer(Integer.parseInt(prod.get(i).get(0)),prod.get(i).get(1),Integer.parseInt(prod.get(i).get(2)),Integer.parseInt(prod.get(i).get(3)));
        }


        String whole_fileName= "/Users/abinesh/Morning/src//Wholesaler.csv";
        File whole_file= new File(whole_fileName);
        List<List<String>> whole = new ArrayList<>();
        Scanner whole_inputStream;
        try{
            whole_inputStream = new Scanner(whole_file);

            while(whole_inputStream.hasNext()){
                String whole_line= whole_inputStream.next();
                String[] whole_values = whole_line.split(",");
                whole.add(Arrays.asList(whole_values));
            }
            whole_inputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Wholesaler wholesaler[] = new Wholesaler[10];
        for(int i=0;i<whole.size();i++){
            wholesaler[i]= new Wholesaler(Integer.parseInt(whole.get(i).get(0)),whole.get(i).get(1));
        }


        String ret_fileName= "/Users/abinesh/Morning/src//Retailer.csv";
        File ret_file= new File(ret_fileName);
        List<List<String>> ret = new ArrayList<>();
        Scanner ret_inputStream;
        try{
            ret_inputStream = new Scanner(ret_file);

            while(ret_inputStream.hasNext()){
                String ret_line= ret_inputStream.next();
                String[] ret_values = ret_line.split(",");
                ret.add(Arrays.asList(ret_values));
            }
            ret_inputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Retailer retailer[] = new Retailer[10];
        for(int i=0;i<ret.size();i++){
            retailer[i]= new Retailer(Integer.parseInt(ret.get(i).get(0)),ret.get(i).get(1));
        }

        Scanner sc=new Scanner(System.in);
        boolean check=true;

        while(check) {
            System.out.println("\nEnter Your Choice\n1. View Producer\n2. View Wholesaler\n3. View Retailer\n4. Wholesaler Purchase \n5. Retailer Purchase\n6. Exit");
            int role = sc.nextInt();
            switch (role) {
                case 1:
                    for(int i=0;i<prod.size();i++){
                        apple[i].disp_warehouse();
                    }
                    break;
                case 2:
                    for(int i=0;i<3;i++){
                        wholesaler[i].disp_whole_stock();
                    }
                    break;
                case 3:
                    for(int i=0;i<3;i++){
                        retailer[i].disp_ret_stock();
                    }
                    break;
                case 4:
                    System.out.println("Choose wholesaler\n1. Wholesaler1\n2. Wholesaler2\n3. Wholesaler3");
                    int choose_wholesaler = sc.nextInt();
                    switch (choose_wholesaler){
                        case 1:
                            System.out.println("\n1. Watch\n2. TV\n3. Laptop");
                            int choose_product= sc.nextInt();
                            System.out.println("Quantity");
                            int choose_qty = sc.nextInt();
                            switch (choose_product){
                                case 1:
                                    if(apple[0].stock>choose_qty) {
                                        apple[0].mang_warehouse(choose_qty);
                                        Producer obj = new Producer(100, "Watch", choose_qty, 1);
                                        wholesaler[0].add_stock(obj);
                                    }
                                    else{System.out.println("The Stock Available :"+apple[0].stock);}
                                    break;
                                case 2:
                                    if(apple[1].stock>choose_qty) {
                                        apple[1].mang_warehouse(choose_qty);
                                        Producer obj1 = new Producer(101, "TV", choose_qty, 1);
                                        wholesaler[0].add_stock(obj1);
                                    }else{System.out.println("Stock Available :"+apple[1].stock);}
                                    break;
                                case 3:
                                    if(apple[2].stock>choose_qty) {
                                        apple[2].mang_warehouse(choose_qty);
                                        Producer obj2 = new Producer(102, "TV", choose_qty, 1);
                                        wholesaler[0].add_stock(obj2);
                                    }else{System.out.println("Stock Available :"+apple[2].stock);}
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("\n1. Watch\n2. TV\n3. Laptop");
                            int choose_product1= sc.nextInt();
                            System.out.println("Quantity");
                            int choose_qty1 = sc.nextInt();
                            switch (choose_product1){
                                case 1:
                                    if(apple[0].stock>choose_qty1) {
                                        apple[0].mang_warehouse(choose_qty1);
                                        Producer obj = new Producer(100, "Watch", choose_qty1, 1);
                                        wholesaler[1].add_stock(obj);
                                    }else{System.out.println("Stock Available :"+apple[0].stock);}
                                    break;
                                case 2:
                                    if(apple[1].stock>choose_qty1) {
                                        apple[1].mang_warehouse(choose_qty1);
                                        Producer obj1 = new Producer(101, "TV", choose_qty1, 1);
                                        wholesaler[1].add_stock(obj1);
                                    }else{System.out.println("Stock Available :"+apple[1].stock);}
                                    break;
                                case 3:
                                    if(apple[2].stock>choose_qty1) {
                                        apple[2].mang_warehouse(choose_qty1);
                                        Producer obj2 = new Producer(102, "TV", choose_qty1, 1);
                                        wholesaler[1].add_stock(obj2);
                                    }else{System.out.println("Stock Available :"+apple[2].stock);}
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("\n1. Watch\n2. TV\n3. Laptop");
                            int choose_product2= sc.nextInt();
                            System.out.println("Quantity");
                            int choose_qty2 = sc.nextInt();
                            switch (choose_product2){
                                case 1:
                                    if(apple[0].stock>choose_qty2) {
                                        apple[0].mang_warehouse(choose_qty2);
                                        Producer obj = new Producer(100, "Watch", choose_qty2, 1);
                                        wholesaler[2].add_stock(obj);
                                    }else{System.out.println("Stock Available :"+apple[0].stock);}
                                    break;
                                case 2:
                                    if(apple[1].stock>choose_qty2) {
                                        apple[1].mang_warehouse(choose_qty2);
                                        Producer obj1 = new Producer(101, "TV", choose_qty2, 1);
                                        wholesaler[2].add_stock(obj1);
                                    }else{System.out.println("Stock Available :"+apple[1].stock);}
                                    break;
                                case 3:
                                    if(apple[2].stock>choose_qty2) {
                                        apple[2].mang_warehouse(choose_qty2);
                                        Producer obj2 = new Producer(102, "TV", choose_qty2, 1);
                                        wholesaler[2].add_stock(obj2);
                                    }else{System.out.println("Stock Available :"+apple[2].stock);}
                                    break;
                            }
                            break;
                    }
                    break;

                case 5:
                    System.out.println("\n1. Retailer 1\n2. Retailer 2\n3. Retailer 3");
                    int choose_retailer = sc.nextInt();
                    System.out.println("Select Wholesaler \n1. Wholesaler 1\n2. Wholesaler 2\n3. Wholesaler 3");
                    int choose_wholesaler3 = sc.nextInt();
                    Wholesaler find_wholesaler=wholesaler[choose_wholesaler3-1];

                    System.out.println("\n1. Watch\n2. TV\n3. Laptop");
                    int choose_product3= sc.nextInt();
                    System.out.println("Quantity");
                    int choose_qty3 = sc.nextInt();
                    switch (choose_product3){
                        case 1:
                            for(Producer obj_check: find_wholesaler.whole_productlist) {
                                if(obj_check.id==100){
                                    if (obj_check.stock > choose_qty3) {
                                        find_wholesaler.mang_whole_stock(choose_qty3,100);
                                        Producer obj = new Producer(100, "Watch", choose_qty3, 1);
                                        retailer[choose_retailer - 1].add_stock(obj);
                                    } else {
                                        System.out.println("Stock Available :" + obj_check.stock);
                                    }
                                }
                            }
                            break;
                        case 2:
                            for(Producer obj_check: find_wholesaler.whole_productlist) {
                                if(obj_check.id==100){
                                    if (obj_check.stock > choose_qty3) {
                                        find_wholesaler.mang_whole_stock(choose_qty3,101);
                                        Producer obj = new Producer(101, "TV", choose_qty3, 1);
                                        retailer[choose_retailer - 1].add_stock(obj);
                                    } else {
                                        System.out.println("Stock Available :" + obj_check.stock);
                                    }
                                }
                            }
                            break;
                        case 3:
                            for(Producer obj_check: find_wholesaler.whole_productlist) {
                                if(obj_check.id==100){
                                    if (obj_check.stock > choose_qty3) {
                                        find_wholesaler.mang_whole_stock(choose_qty3,102);
                                        Producer obj = new Producer(102, "TV", choose_qty3, 1);
                                        retailer[choose_retailer - 1].add_stock(obj);
                                    } else {
                                        System.out.println("Stock Available :" + obj_check.stock);
                                    }
                                }
                            }
                            break;
                    }
                    break;
                case 6:
                    check = false;
            }
        }
    }
}