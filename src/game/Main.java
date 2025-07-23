package game;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        int userScore = 0;
        int compScore = 0;

        while(userScore < 5 && compScore < 5) {
        
        System.out.print("Enter Rock, Paper or Scissors : ");
        String st = sc.nextLine().toLowerCase();
        int index = random.nextInt(3);
        String st2 = choices[index];
        System.out.println("User chose " + st + ", Computer chose " + st2 + ".");

        if (st.equals(st2)) {
            System.out.println("Its a tie!");
            System.out.println("User has " + userScore + " points. \nComputer has " + compScore + " points.");
        }
        else if (((st.equals("rock")) && (st2.equals("paper"))) || ((st.equals("paper")) && (st2.equals("scissors"))) || ((st.equals("scissors")) && (st2.equals("rock")))) {
            compScore++;
            System.out.println("Computer WON!");
            System.out.println("User has " + userScore + " points. \nComputer has " + compScore + " points.");
        }
        else if (((st.equals("rock")) && (st2.equals("scissors"))) || ((st.equals("paper")) && (st2.equals("rock"))) || ((st.equals("scissors")) && (st2.equals("paper")))) {
            userScore++;
            System.out.println("User WON!");
            System.out.println("User has " + userScore + " points. \nComputer has " + compScore + " points.");
        }
        else {
            System.out.println("Invalid input. Please Try Again!");
        }
    }

    if (userScore > compScore) {
        System.out.println();
        System.out.println("Final Result of the match :- ");
        System.out.println("USER WON THE GAME. HUMANS RULE!!");
    }
    else {
        System.out.println("COMPUTER WON THE GAME. NOW AI WILL TAKE OVER THIS WORLD!!");
    }
        sc.close();
    }
}
