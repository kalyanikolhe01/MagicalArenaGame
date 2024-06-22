import org.junit.Test;
import static org.junit.Assert.*;

public class MagicalArenaTest {
    @Test
    public void testPlayMatch_PlayerAWins() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);
        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.playMatch();
        assertEquals(0, playerB.getHealth());
    }

    @Test
    public void testPlayMatch_PlayerBWins() {
        Player playerA = new Player("Player A", 100, 10, 5);
        Player playerB = new Player("Player B", 50, 5, 10);
        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.playMatch();
        assertEquals(0, playerA.getHealth());
    }

    @Test
    public void testRollDie() {
        MagicalArena arena = new MagicalArena(new Player("Player A", 50, 5, 10), new Player("Player B", 100, 10, 5));
        int roll = arena.rollDie(); // Make sure rollDie() is public or protected in MagicalArena
        assertTrue(roll >= 1 && roll <= 6);
    }
}