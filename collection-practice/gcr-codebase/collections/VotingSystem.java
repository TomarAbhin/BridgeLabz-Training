import java.util.*;
public class VotingSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //hashMap to store total votes per candidate
        Map<String, Integer> voteCount = new HashMap<>();
        //linkedHashMap to maintain vote order
        Map<Integer, String> voteOrder = new LinkedHashMap<>();
        System.out.print("enter number of voters: ");
        int voters = s.nextInt();
        for (int i = 1; i <= voters; i++) {
            System.out.print("enter candidate name for voter " + i + ": ");
            String candidate = s.next();
            //maintain vote order
            voteOrder.put(i, candidate);
            //count votes
            voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        }
        System.out.println("\nVote Order (LinkedHashMap):");
        for (Map.Entry<Integer, String> entry : voteOrder.entrySet()) {
            System.out.println("Voter " + entry.getKey() + " voted for " + entry.getValue());
        }
        System.out.println("\nVote Count (HashMap):");
        System.out.println(voteCount);

        //display sorted results
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteCount);

        System.out.println("\nFinal Results (TreeMap - Sorted by Candidate):");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " votes");
        }
    }
}
