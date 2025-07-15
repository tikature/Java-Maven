
import static org.junit.Assert.*;
import org.junit.Test;

public class VotingSystemTest {

    @Test
    public void testVotingAndWinner() {
        VotingSystem system = new VotingSystem();
        system.vote("Alice");
        system.vote("Bob");
        system.vote("Bob");

        assertEquals(2, (int) system.getAllVotes().get("Bob"));
        assertEquals("Bob", system.getWinner());
    }

    @Test
    public void testTieCase() {
        VotingSystem system = new VotingSystem();
        system.vote("Alice");
        system.vote("Bob");

        String winner = system.getWinner();
        assertTrue(winner.equals("Alice") || winner.equals("Bob")); // no tie-breaker
    }
}
