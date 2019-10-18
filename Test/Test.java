
import java.util.Scanner;
class Test {
    
    public static void main(String[]args) {
        
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("-------------");
        System.out.println("");
        System.out.println("A. ");
        double a=sc.nextInt();
        System.out.println("B. ");
        double b=sc.nextInt();
        double c=Math.sqrt(a+a +b*b);
        
        
        String name=sc.nextLine();
        System.out.println(c);
        
    }
    
    
}