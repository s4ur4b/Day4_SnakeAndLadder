import javax.swing.*;
import java.util.Scanner;

public class SnakeLadder2Player {
    public static final int min = 1;
    public static final int max = 6;
    public static void main( String args[] ) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Press any key to start");
        x=scan.nextInt();
        int start1=0,start2=0, rollCount=0;
        label:
        while ( start1 < 100 && start2<100){
            rollCount++;
            System.out.println("Rolling a die");
            int dieRoll = (int) Math.floor(Math.random() * (max - min + 1) + min);
            int dieRoll2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println("Player-1 Die Count: "+dieRoll+" Player-2 Die Count: "+dieRoll2);
            int snakeLadder=(int) Math.floor(Math.random()*10%3);
            int snakeLadder2=(int) Math.floor(Math.random()*10%3);
            switch(snakeLadder){
                case 1: //ladder
                    start1=start1+dieRoll;
                    break ;
                case 2: //snake
                          start1=start1-dieRoll;
                    break;
                default://safe
                    start1=start1;
            }
            if (start1<0){
                start1=0;
                continue label;
            }
            if (start1>100){
                start1=100;
                continue label;

            }
            switch(snakeLadder2){
                case 1: //ladder
                    start2=start2+dieRoll2;
                    break ;
                case 2: //snake
                    start2=start2-dieRoll2;
                    break;
                default://safe
                    start2=start2;
            }
            if (start2<0){
                start2=0;
                continue label;
            }
            if (start2>100){
                start2=100;
                continue label;}

        }//While loop ends here
        System.out.println( " Position Player-1: "+start1);
        System.out.println(" Position Player-2: "+start2);
        System.out.println("Number of Die Rolls: "+rollCount);
        String a = Integer.toString(start1);
        String b = Integer.toString(start2);

        if (a.compareTo(b)==0){
            System.out.println("It is a Tie");
        }
        else if (a.compareTo(b)<0) {
            System.out.println("Player-1 won");
        }else{
            System.out.println("Player-2 won");
        }
    }
}
