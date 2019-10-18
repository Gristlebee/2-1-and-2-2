import java.util.Scanner;
class area_to_radius {
    public static void main(String[]args){
        Scanner sac= new Scanner(System.in);
        System.out.println("What is the area of the circle?");
        System.out.println(" ");
        double a=sac.nextInt();
        double b=(a/Math.PI);
        double c= Math.sqrt(b);
        String name=sac.nextLine();
        System.out.println("The radius is " + c);
    }
}