package streams;

public class SoccerPlayer {
    final String name;
    int overall;
    final String country;

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "name='" + name + '\'' +
                ", overall=" + overall +
                ", country='" + country + '\'' +
                '}';
    }

    SoccerPlayer (String name, int overall, String country){
        this.name = name;
        this.overall = overall;
        this.country = country;
    }
}
