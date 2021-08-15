import java.util.Scanner;
// A condition where if the player moves to a position greater than 100 then he remains at the same position
public class SnakeLadder_UC5 {
    public static final int min = 1;
    public static final int max = 6;

    public static void main( String args[] ) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Press any key to start");
        a=scan.nextInt();
        int start=0, rollCount=0;
        label:
        while ( start<100){
            rollCount++;
            System.out.println("Rolling a die");
            int dieRoll = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println(dieRoll);
            int snakeLadder=(int) Math.floor(Math.random()*10%3);
            switch(snakeLadder){
                case 1: //ladder
                    start=start+dieRoll;
                    break;
                case 2: //snake
                    start=start-dieRoll;
                    break;
                default://safe
                    start=start;
            }
            if (start<0){
                start=0;
                continue label;
            }
            if (start>100)
            {
                start=start-dieRoll;
            }
            dieRoll++;

            System.out.println("Die ROll:"+dieRoll+"  Position:"+start);
            System.out.println("Number of Die Rolls: "+rollCount);
        }


        System.out.println("You Won");
    }
}
