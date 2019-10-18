import java.util.Scanner;

 class distformula
{
   
    public static void main (String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("What is the x cordinates of the first point?");
         double x1 =sc.nextInt();
        System.out.println("What is the y cordinates of the first point?");
         double y1=sc.nextInt();
        System.out.println("What is the x cordinates of the second point?");
         double x2 =sc.nextInt();
        System.out.println("What is the y cordinates of the second point?");
         double y2 =sc.nextInt();
        double distX=(x1-x2);
        double distY=(y1-y2);
        System.out.println(" ");
        System.out.println("The distance between the Xs is"+ distX +" and the distance between the Ys is " +distY);
    }

    
}
