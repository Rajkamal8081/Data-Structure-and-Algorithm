import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        System.out.println("enter the number for the array ");
        int marks [] = new int[100];
        Scanner sc = new Scanner(System.in);

         marks[0] =sc.nextInt();
         marks[1] =sc.nextInt();
         marks[2]= sc.nextInt();
        System.out.println("orignal value");
         System.out.println("physic :" + " "+marks[0]);
         System.out.println("english :" + " " + marks[1]);
         System.out.println("hindi:"+ " "+ marks[2]);

         marks[2]=40;
         marks[1]= marks[1]+20;
         System.out.println("updated value");
          System.out.println("english :" + " " + marks[1]);
         System.out.println("hindi:"+ " "+ marks[2]);
         sc.close();
    }
    
    
}

//preforming array opreation like create update delete and 