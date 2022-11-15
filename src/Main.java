import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //this creates an ArrayList of Strings
    public static ArrayList<String> moves = new ArrayList<>();

    public static void main(String[] args) {
        //this adds Strings to the ArrayList by using the method moveSetter(), MUST BE FIRST TO HAVE REQUIRED MOVESET
        moveSetter();
        movesPrinter();
        Scanner scan = new Scanner(System.in);
        String playerMove = scan.nextLine();
        String cpuMove = null;
        cpuMove = cpuChoice();
        System.out.println(cpuMove);
        gameLogic(playerMove, cpuMove);

    }

    public static void movesPrinter(){
        System.out.println("Please select your move: ");
        //this prints off the moves one can take while playing rock/paper/scissors/lizard/spock
        for (int i = 0; i < moves.size(); i++) {
            System.out.println(moves.get(i));
        }
    }
    public static void moveSetter(){
        //this adds Strings to the ArrayList
        moves.add("Rock");
        moves.add("Paper");
        moves.add("Scissors");
        moves.add("Lizard");
        moves.add("Spock");
    }

    public static void gameLogic(String playerMove, String cpuMove){
        if (playerMove.equals(cpuMove)) {
            System.out.println("Tie!!");
            System.out.println("No one wins because "+ playerMove + " is the same as " + cpuMove);
        } else if (playerMove.equalsIgnoreCase("paper") && (cpuMove.equalsIgnoreCase("scissors") || cpuMove.equalsIgnoreCase("lizard"))) {
            System.out.println("CPU Wins!!");
            System.out.println("CPU wins because "+ playerMove + " loses to " + cpuMove);
        }else if (playerMove.equalsIgnoreCase("scissors") && (cpuMove.equalsIgnoreCase("rock") || cpuMove.equalsIgnoreCase("spock"))) {
            System.out.println("CPU Wins!!");
            System.out.println("CPU wins because "+ playerMove + " loses to " + cpuMove);
        }else if (playerMove.equalsIgnoreCase("lizard") && (cpuMove.equalsIgnoreCase("rock") || cpuMove.equalsIgnoreCase("scissors"))) {
            System.out.println("CPU Wins!!");
            System.out.println("CPU wins because "+ playerMove + " loses to " + cpuMove);
        }else if (playerMove.equalsIgnoreCase("spock") && (cpuMove.equalsIgnoreCase("paper") || cpuMove.equalsIgnoreCase("lizard"))) {
            System.out.println("CPU Wins!!");
            System.out.println("CPU wins because "+ playerMove + " loses to " + cpuMove);
        } else if (playerMove.equalsIgnoreCase("rock") && (cpuMove.equalsIgnoreCase("paper") || cpuMove.equalsIgnoreCase("spock"))) {
            System.out.println("CPU Wins!!");
            System.out.println("CPU wins because " + playerMove + " loses to " + cpuMove);
        } else {
            System.out.println("Player smoked CPU");
            System.out.println("Player wins because "+ cpuMove + " loses to " + playerMove);
        }
    }

    public static String gameLogicReturn(String playerMove, String cpuMove){
        String winner= null;
        if (playerMove.equals(cpuMove)) {
            System.out.println("Tie!!");
            System.out.println("No one wins because "+ playerMove + " is the same as " + cpuMove);
            winner = "Tie";
            System.out.println(winner);
        } else if (playerMove.equalsIgnoreCase("paper") && (cpuMove.equalsIgnoreCase("scissors") || cpuMove.equalsIgnoreCase("lizard"))) {
            System.out.println("CPU Wins!!");
            System.out.println("CPU wins because "+ playerMove + " loses to " + cpuMove);
            winner = "CPU Wins";
        }else if (playerMove.equalsIgnoreCase("scissors") && (cpuMove.equalsIgnoreCase("rock") || cpuMove.equalsIgnoreCase("spock"))) {
            System.out.println("CPU Wins!!");
            System.out.println("CPU wins because "+ playerMove + " loses to " + cpuMove);
            winner = "CPU Wins";
        }else if (playerMove.equalsIgnoreCase("lizard") && (cpuMove.equalsIgnoreCase("rock") || cpuMove.equalsIgnoreCase("scissors"))) {
            System.out.println("CPU Wins!!");
            System.out.println("CPU wins because "+ playerMove + " loses to " + cpuMove);
            winner = "CPU Wins";
        }else if (playerMove.equalsIgnoreCase("spock") && (cpuMove.equalsIgnoreCase("paper") || cpuMove.equalsIgnoreCase("lizard"))) {
            System.out.println("CPU Wins!!");
            System.out.println("CPU wins because "+ playerMove + " loses to " + cpuMove);
            winner = "CPU Wins";
        } else if (playerMove.equalsIgnoreCase("rock") && (cpuMove.equalsIgnoreCase("paper") || cpuMove.equalsIgnoreCase("spock"))) {
            System.out.println("CPU Wins!!");
            System.out.println("CPU wins because " + playerMove + " loses to " + cpuMove);
            winner = "CPU Wins";
        } else {
            System.out.println("Player smoked CPU");
            System.out.println("Player wins because "+ playerMove + " smokes " + cpuMove);
            winner = "Player Wines";
        }
        return winner;
    }

    public static String cpuChoice(){
        String cpuMove = null;
        Random rando = new Random();
        int ranMove = rando.nextInt(4);
        if (ranMove == 0){
            cpuMove = "rock";
        } else if (ranMove == 1) {
            cpuMove = "paper";
        }else if (ranMove == 2) {
            cpuMove = "scissors";
        }else if (ranMove == 3) {
            cpuMove = "lizard";
        }else if (ranMove == 4) {
            cpuMove = "spock";
        }
        return cpuMove;
    }
}
