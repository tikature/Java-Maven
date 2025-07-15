
import java.util.HashMap;
import java.util.Map;

public class VotingSystem {
    private Map<String, Integer> votes = new HashMap<>();

    public void vote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
    }

    public String getWinner() {
        String winner = null;
        int maxVotes = -1;
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                winner = entry.getKey();
                maxVotes = entry.getValue();
            }
        }
        return winner;
    }

    public Map<String, Integer> getAllVotes() {
        return votes;
    }
}
