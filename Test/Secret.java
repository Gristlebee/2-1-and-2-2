import java.util.Scanner;
class Secret {
     public static void main(String[]args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("What is the code?");
          String a=sc.next();
         if(a.equals("Dragon")){
             System.out.println("You may pass");
            }
            else {
               System.out.println("You shall not pass"); 
            }
        }
    
    
    
}