import java.io.*;
public class reader{
public static void main(String[] args) {
    String path="/Users/Abinesh/Daily tasks/day1/products.csv";
    String line="";
    try{
        BufferedReader br=new BufferedReader(new FileReader(path));
        while((line=br.readLine())!=null){
            String [] values=line.split(",");
            System.out.println(values[2]);
        }
    }catch(Exception e){
        System.out.println("Redo da dei");
    }
    }
}