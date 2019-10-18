
import java.util.Scanner;
class ball {
    public static void main(String[]args){
        System.out.println("I know all. What is your question?");
      Scanner sac= new Scanner(System.in);
     String Q=sac.next();
     int Rp =(int) (Math.random()*20)+1;
     if(Rp==1) {
         System.out.println("It is certain");
     }
     if(Rp==2) {
         System.out.println("Without a doubt");
        }
      if(Rp==3) {
         System.out.println("You may rely on it");
     }
      if(Rp==3) {
         System.out.println("Yes definitely");
     }
      if(Rp==4) {
         System.out.println("It is decidedly so");
     } if(Rp==5) {
         System.out.println("As I see it, yes");
     } if(Rp==6) {
         System.out.println("Most likely");
     } if(Rp==7) {
         System.out.println("Yes");
     } if(Rp==8) {
         System.out.println("Outlook good");
     } if(Rp==9) {
         System.out.println("Signs point to yes");
     } if(Rp==10) {
         System.out.println("Reply hazy try again");
     } if(Rp==11) {
         System.out.println("Better not tell you now");
     }
      if(Rp==12) {
         System.out.println("Ask again later");
     } if(Rp==13) {
         System.out.println("Cannot predict now");
     } if(Rp==14) {
         System.out.println("Concentrate and ask again");
     } if(Rp==15) {
         System.out.println("Don’t count on it");
     } if(Rp==16) {
         System.out.println("Outlook not so good");
     } if(Rp==17) {
         System.out.println("My sources say no");
     } if(Rp==18) {
         System.out.println("Very doubtful");
     } if(Rp==19) {
         System.out.println("My reply is no");
     } if(Rp==20) {
         System.out.println("You're screwed");
     }
    }
    
    
    
}