import java.util.Scanner;
class Grade {
     public static void main(String[]args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("What was the test out of?");
          double out_of=sc.nextInt();
          System.out.println("What was your test mark?");
          double mark=sc.nextInt();
          double M2=(mark/out_of)*100;
          if(M2>=0 && M2<=100) {
          System.out.println("You got: " +M2+ "%");
        } else {
            System.out.println("Silly human, thats not possible");
        }
          
          if(M2>=86 && M2<=100) {
            System.out.println("An A! Fantastic work.");  
            } else
              if(M2>=73 && M2<=85) {
            System.out.println("A B. Not bad.");  
            }
           if(M2>=67 && M2<=72) {
            System.out.println("A C+. You could do better.");  
            } else
              if(M2>=60 && M2<=66) {
            System.out.println("A C. Study harder.");  
            } else
              if(M2>=50 && M2<=59) {
            System.out.println("A C-. At least it's not an F.");  
            }
             else if(M2>=73 && M2<=85) {
            System.out.println("A F. Oh no.");  
            } 
           
        }
}