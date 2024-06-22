import java.util.Random;

public class MagicalArena {
    private Player playerA;
    private Player playerB;
    private Random random = new Random();

    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void playMatch() {
        int playerARoll = rollDice();
        int playerBRoll = rollDice();

        System.out.println("Player A rolled: " + playerARoll);
        System.out.println("Player B rolled: " + playerBRoll);

        if (playerARoll > playerBRoll) {
            System.out.println("Player A wins!");
            playerA.incrementWins();
        } else if (playerBRoll > playerARoll) {
            System.out.println("Player B wins!");
            playerB.incrementWins();
        } else {
            System.out.println("It's a tie!");
        }
    }

    private int rollDice() {
        return random.nextInt(6) + 1; // Roll a 6-sided die
    }
}