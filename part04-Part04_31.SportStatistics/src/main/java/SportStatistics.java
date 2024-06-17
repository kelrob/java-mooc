import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int teamGamesPlayed = 0;
        int teamWins = 0;
        int teamLosses = 0;

        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] array = line.split(",");
                String homeTeam = array[0];
                String awayTeam = array[1];
                int homePoint = Integer.parseInt(array[2]);
                int awayPoint = Integer.parseInt(array[3]);

                if (team.equals(homeTeam) || team.equals(awayTeam)) {
                    teamGamesPlayed++;
                }

                if (team.equals(homeTeam) && homePoint > awayPoint || team.equals(awayTeam) && awayPoint > homePoint) {
                    teamWins++;
                }

                if (team.equals(homeTeam) && awayPoint > homePoint || team.equals(awayTeam) && awayPoint < homePoint) {
                    teamLosses++;
                }
            }
        } catch (Exception e) {
            System.out.println("There was an error reading this file");
        }

        System.out.println("Games: " + teamGamesPlayed);
        System.out.println("Wins: " + teamWins);
        System.out.println("Losses: " + teamLosses);
    }

}
