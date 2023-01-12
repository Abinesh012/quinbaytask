import java.util.Scanner;
public class head extends reader {
    public static void main(String[] args){
        //System.out.println();
        Scanner sc=new Scanner(System.in);
        reader r1=new reader();
        r1.get();
        int c;
        while(true){
            System.out.println("\nEnter your Choice \n1.Display \n2.Buy \n3.Exit");
            c=sc.nextInt();
            switch(c){
                case 1:
                    System.out.println("\n1.Wholesaler\n2.Retailer1\n3.Retailer2\n4.Inventory");
                    c=sc.nextInt();
                    switch(c){
                        case 1:
                            r1.wholesaler_stock();
                            break;
                        case 2:
                            r1.retailer1_stock();
                            break;
                        case 3:
                            r1.retailer2_stock();
                            break;
                        case 4:
                            r1.warehouse();
                            break;
                        default:
                            break;
                    }
                case 2:
                    System.out.println("\n1.Wholesaler\n2.Retailer1\n3.Retailer2");
                    c=sc.nextInt();
                    switch(c){
                        case 1:
                            r1.whole_buy();
                            break;
                        case 2:
                            r1.retailer1_buy();
                            break;
                        case 3:
                            r1.retailer2_buy();
                            break;
                        default:
                            break;
            }
                default:
                    break;


        }
    }
}}
