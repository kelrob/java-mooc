import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private final ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random rand = new Random();
            int index = rand.nextInt(this.jokes.size());
            return this.jokes.get(index);
        }
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
