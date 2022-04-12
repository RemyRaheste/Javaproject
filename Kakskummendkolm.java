import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Kakskummendkolm {
    private static final Scanner input = new Scanner(System.in);

    private static final String
        npc = "Arvuti",
        human = "Inimene",
        winner = "Võitja: ",
        tie = "Viik",
        start = "Alusta mängu? (Y | N) - ",
        play = "Mängi uuesti? (Y | N) - ",
        game_over = "Mäng läbi - ",
        score = "Skoor: ";

    private static int
        score_npc = 0,
        score_human = 0;

    public static void main(String[] args) {
        System.out.print(start);
        String answer = input.nextLine();
        System.out.println(answer);

        if (!answer.equals("Y") && !answer.equals("y")) {
            gameOver();
            return;
        }

        while(true) {
            final int
                dice_npc = ThreadLocalRandom.current().nextInt(1, 7),
                dice_human = ThreadLocalRandom.current().nextInt(1, 7);

            if (dice_npc > dice_human) {
                score_npc++;
            } else if (dice_npc < dice_human) {
                score_human++;
            }

            System.out.println("Arvuti veeretas: " + dice_npc);
            System.out.println("Inimene veeretas: " + dice_human);
            printScore();

            System.out.print(play);
            String again = input.nextLine();

            if (!again.equals("Y") && !again.equals("y")) {
                gameOver();
                return;
            }
        }
    }

    private static void gameOver() {
        System.out.print(game_over);

        if (score_npc == score_human) {
            System.out.println(tie);
        } else if (score_npc > score_human) {
            System.out.println(winner + npc);
        } else {
            System.out.println(winner + human);
        }
    }

    private static void printScore() {
        System.out.println(score + npc + "[" + score_npc + "] : " + human + "[" + score_human + "]");
        System.out.println();
    }
}
