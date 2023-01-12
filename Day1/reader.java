import java.io.*;
import java.util.*;

class reader{
    Scanner scanner=new Scanner(System.in);
    int i=0,j;
    String line="";
    int [] pid=new int[100];
    String [] pname=new String[100];
    long [] price=new long[100];
    int [] qty=new int[100];

    void get(){
        String path="/Users/Abinesh/Daily tasks/day1/products.csv";
        //ArrayList <String> arr =new ArrayList();


        try{
            BufferedReader br=new BufferedReader(new FileReader(path));
            while((line=br.readLine())!=null){
                if(line.indexOf("id")>=0){
                    i++;
                    continue;
                }
                j=i-1;
                String [] values=line.split(",");
                pid[j]=Integer.parseInt(values[0]);
                pname[j]=values[1];
                price[j]=Long.parseLong(values[2]);
                qty[j]=Integer.parseInt(values[3]);
                i++;
            }
        }catch(Exception e){
            //Nothing Happens
        }
    }
    void warehouse(){
        System.out.println("\n\n\tProducts in the Warehouse\n");
        for (int i=0;pid[i]!=0;i++){
            System.out.println("Product Id : "+pid[i]);
            System.out.println("Product Name : "+pname[i]);
            System.out.println("Product Price :"+price[i]);
            System.out.println("Product Quantity :"+qty[i]);
            System.out.println("\n");
        }

    }
    int pid1,qty1,l=0,z=0;
    int [] w_id=new int[100];
    String [] w_pname=new String[100];
    long[] w_price=new long[100];
    int[] w_qty=new int[100];

    void whole_buy() {
        System.out.println("Enter the Product Id you need to buy ");
        pid1 = scanner.nextInt();
        System.out.println("Enter the Quantity of the Product ");
        qty1 = scanner.nextInt();
        if (qty1 > qty[pid1]) {
            //System.out.println(qty[pid1]);
            System.out.println("Out of Stock");

        } else {

            w_id[l] = pid[pid1];
            w_pname[l] = pname[pid1];
            w_price[l] = price[pid1];
            w_qty[l] =qty1;
            stockupdate(w_id[l], w_qty[l]);
            l++;
        }
    }
    void stockupdate(int id, int qtty){
        qty[id]=qty[id]-qtty;
        warehouse();
    }
    void wholesaler_stock(){
        System.out.println("\t Stock in Whole seller Account");
        for(int j=0;w_id[j]!=0;j++) {
            System.out.println("Product id :" + w_id);
            System.out.println("Product name :" + w_pname);
            System.out.println("Product price :" + w_price);
            System.out.println("Product Quantity :" + w_qty);
        }
    }

    int ret1id,qty1id,n=0;
    int [] r1_id=new int[100];
    String [] r1_pname=new String[100];
    long[] r1_price=new long[100];
    int[] r1_qty=new int[100];
    void stockupdate2(int id,int qtty){
        w_qty[id]=w_qty[id]-qtty;
    }
    void retailer1_stock(){
        System.out.println("\t Stock in Whole seller Account");
        for(int j=0;w_id[j]!=0;j++) {
            System.out.println("Product id :" + r1_id);
            System.out.println("Product name :" + r1_pname);
            System.out.println("Product price :" + r1_price);
            System.out.println("Product Quantity :" + r1_qty);
        }
    }
    void retailer1_buy(){
        System.out.println("Enter the Product Id you need to buy ");
        ret1id = scanner.nextInt();
        System.out.println("Enter the Quantity of the Product ");
        qty1id=scanner.nextInt();
        if (qty1id > qty[qty1]) {
            //System.out.println(qty[pid1]);
            System.out.println("Out of Stock");

        } else {

            r1_id[z] = pid[ret1id];
            r1_pname[z] = w_pname[ret1id];
            r1_price[z] = w_price[ret1id];
            r1_qty[z] = ret1id;
            stockupdate2(r1_id[l], r1_id[l]);
            z++;
            retailer1_stock();
        }


        int ret2id,qty2id,v=0;
        int [] r2_id=new int[100];
        String [] r2_pname=new String[100];
        long[] r2_price=new long[100];
        int[] r2_qty=new int[100];

        void stockupdate3(int id,int qtty){
            w_qty[ret2id]=r2_qty[id]-qtty;
        };
        void retailer2_stock(){
            System.out.println("\t Stock in Whole seller Account");
            for(int j=0;w_id[j]!=0;j++) {
                System.out.println("Product id :" + r2_id);
                System.out.println("Product name :" + r2_pname);
                System.out.println("Product price :" + r2_price);
                System.out.println("Product Quantity :" + r2_qty);
            }
        }

        void retailer1_buy2(){
            System.out.println("Enter the Product Id you need to buy ");
            ret2id = scanner.nextInt();
            System.out.println("Enter the Quantity of the Product ");
            qty2id=scanner.nextInt();
            if (qty2id > qty[qty1]) {

                System.out.println("Out of Stock");

            } else {

                r2_id[z] = pid[ret1id];
                r1_pname[z] = w_pname[ret1id];
                r1_price[z] = w_price[ret1id];
                r1_qty[z] = ret1id;
                stockupdate3(r2_id[v], r2_qty[v]);
                //stockupdate3(r2_qty,r2_id[z]);
                v++;
            }
    }
}}
