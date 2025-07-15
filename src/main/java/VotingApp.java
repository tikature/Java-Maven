package contohproject;

public class VotingApp {
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        // Simulasi voting
        system.vote("Alice");
        system.vote("Bob");
        system.vote("Alice");
        system.vote("Charlie");
        system.vote("Bob");
        system.vote("Bob");

        System.out.println("Voting results:");
        system.getAllVotes().forEach((name, count) ->
            System.out.println(name + ": " + count + " votes")
        );

        System.out.println("Winner: " + system.getWinner());
    }
}
