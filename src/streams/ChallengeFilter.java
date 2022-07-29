package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ChallengeFilter {
    public static void main(String[] args) {
        List<SoccerPlayer> playerList = Arrays.asList(
                new SoccerPlayer("Neymar", 91, "BR"),
                new SoccerPlayer("Lionel Messi", 93, "ARG"),
                new SoccerPlayer("Allison", 89, "BR"),
                new SoccerPlayer("Robert Lewandowski", 92, "POL"),
                new SoccerPlayer("Vinicius Jr", 80, "BR")
        );

        playerList.stream()
                .filter(s -> s.country.equals("BR"))
                .filter(s -> s.overall <= 90)
                .peek(s -> s.overall++)
                .map(s -> s.name)
                .forEach(s -> System.out.println(s + " (+1)"));
    }
}
