import java.util.Scanner;
import java.util.Random;
class Game{
    int takeuserinput;
    int number;
    boolean iscorrect;
    int noofinputs=0;
    Game(){
        Random rd=new Random();
        number=rd.nextInt(100);
       
    }
    void takeuserinput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        takeuserinput=sc.nextInt();
       
    }
    boolean iscorrect(){
        noofinputs++;
        if(takeuserinput==number){
            System.out.printf("You won!\n you did it in %d attempts",noofinputs);
            return true;
        }
        else if(takeuserinput<number){
            System.out.println("too less..");
        }
        else if(takeuserinput>number){
            System.out.println("too high..");
        }
        return false;
    }
}
public class Main{
    public static void main(String[]args){
        Game g=new Game();
        boolean b= false;
        while(!b){
              g.takeuserinput();
              b=g.iscorrect();
        }
     
    }
}
