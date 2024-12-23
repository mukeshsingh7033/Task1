package CodSoft;

import java.sql.SQLOutput;
import java.util.Scanner;

class Guesser{
    int GuesserNum;
    public int GuesserNumb(){
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Guesser please guess the number between 1 to 100:");
            GuesserNum = scan.nextInt();

              if (GuesserNum >=1 && GuesserNum <=100){
                System.out.println("You Entered:" +GuesserNum);
                break;
            }else {
                 System.out.println("invalid");
             }

        }
        return GuesserNum;
    }

}


class Player{
    int PlayerNum;
    public int PlayerNumb(){
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Player1 please guess the number between 1 to 100:");
            PlayerNum = scan.nextInt();

            if (PlayerNum >=1 && PlayerNum <=100){
                System.out.println("You Entered:" +PlayerNum);

                break;
            }else {
                System.out.println("invalid");
            }


        }

        return PlayerNum;

    }

}

class Umpire{
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;

    public void CollectNumFromGuesser(){
        Guesser Gu = new Guesser();
        Guessernum=Gu.GuesserNumb();
    }
    public void CollectNumFromPlayer(){
       System.out.print("Player1 please guess the number between 1 to 100:");
        Player P1 = new Player();
        Playernum1= P1.PlayerNumb();
       if (Guessernum > Playernum1)
        {
            System.out.println("To Low");
        }
        else {
            System.out.println("To High");
        }

        System.out.print("Player2 please guess the number between 1 to 100:");
        Player P2 = new Player();
        Playernum2= P2.PlayerNumb();
       if (Guessernum > Playernum2)
        {
            System.out.println("To Low");
        }
        else {
            System.out.println("To High");
        }

        System.out.print("Player3 please guess the number between 1 to 100:");
        Player P3 = new Player();
        Playernum3= P3.PlayerNumb();
       if (Guessernum > Playernum3)
        {
            System.out.println("To Low");
        }
        else {
            System.out.println("To High");
        }

    }
    public void Compare(){


        if (Guessernum==Playernum1)
        {
            if (Guessernum==Playernum2 && Guessernum==Playernum3){
                System.out.println("All Player won the game");
            } else if (Guessernum==Playernum2) {
                System.out.println("Player 1 and  Player2 won the Game");
            } else if (Guessernum==Playernum3) {
                System.out.println("Player1 and Player3 won the Game");
            }
            else {
                System.out.println("Player1 won the Game");
            }
        } else if (Guessernum==Playernum2) {
            if (Guessernum==Playernum3){
                System.out.println("Player2 and Player3 won the game");
            }
            else {
                System.out.println("Player2 won the Game");
            }

        } else if (Guessernum==Playernum3) {
            System.out.println("Player3 won the Game");
        }
        else {
            System.out.println("All Player lost the Game");
        }
    }

}
public class MyGuesserGame {
    public static void main(String[] args) {
        System.out.println("------Game Started------");
        Umpire UM = new Umpire();
        UM.CollectNumFromGuesser();
        UM.CollectNumFromPlayer();
        UM.Compare();
        System.out.println("------ Game Over------");

    }
}
