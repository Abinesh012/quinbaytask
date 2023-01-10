import java.io.*;
import java.util.*;
public class read {
  public static void main(String[] args) throws IOException{
    //ArrayList<String> l1=new ArrayList();
    HashMap map=new HashMap();
    
    String[] str=new String[10];
    String new1 =null;
    String [][] sol=new String[100][100];
    int i=0,j=0,k=0;

    try {
      File myObj = new File("/users/abinesh/task 2/employees.txt");
      FileWriter myWriter = new FileWriter("newfile.txt");
      Scanner myReader = new Scanner(myObj);

      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        new1=data;
        String s1=new1;
        String[] words=s1.split(",");
        for(j=0;j<51;){
            for(k=0;k<6;k++){
                for(String w:words){
                    sol[j][k]=w;
                    System.out.println(sol[j][k]);
                }
            }
        }
        j++;
        //str=data.split(" ");
        //System.out.println(new1);
        //map.put(new1.split(" ")) ; //=new1.split(" ");
        //System.out.println(data);
        myWriter.write(data);
        i++;
        for(j=0;j<51;j++){
            for(k=0;k<5;k++){
                System.out.println(sol[j][k]);
            }
        }
      }
      myReader.close();
      myWriter.close();

    } catch(IOException e) {
      System.out.println("Abinesh Check it Again!");
    }
    try{
        
        
    }catch(Exception e){

    }



  }
}