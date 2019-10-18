import java.util.Scanner;

 class Intcalc
{
     public static void main (String[]args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Inetrest Calculator");
         System.out.println("_________________________");
         System.out.println("What is the principle?");
         double p =sc.nextInt();
          System.out.println("What is the rate?");
          double r =sc.nextInt();
          System.out.println("How many years will accrue interest?");
           double i =sc.nextInt();
          double rate=(1+r);
          double years=Math.pow(rate,i);
          double amount=years*p;
          System.out.println("The amount is "+ amount);
          
        }
    
}