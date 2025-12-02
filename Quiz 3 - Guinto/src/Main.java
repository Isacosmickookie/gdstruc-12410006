import java.lang.foreign.SymbolLookup;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(10);
        Scanner scanner = new Scanner(System.in);
        int turn = 1;
        int gamesStarting = 0;
        int playerId = 1;

        while (gamesStarting < 10) {
            System.out.println("Turn: " + turn++ + " Games made: " + gamesStarting);

            Random random = new Random();

            System.out.println("press ENTER to continue");
            scanner.nextLine();

            int playersQueuing = random.nextInt(8);
            System.out.println(playersQueuing + " players are in queue");

            for (int i = 0; i < playersQueuing; i++) {
                Player newPlayer = new Player(playerId, "Player " + playerId, random.nextInt(100));
                queue.add(newPlayer);
                System.out.println("Player: " + newPlayer.getName() + " joined queue");
                playerId++;
            }

            System.out.println("Players waiting: " + queue.size());
            queue.printQueue();

            if (queue.size() >= 5)
            {
                gamesStarting++;
                System.out.println("GAME FOUND");
                for(int i = 0; i < 5; i++)
                {
                Player removedPlayer = queue.remove();
                }
                System.out.println("\n\nPlayers waiting: " + queue.size());
                queue.printQueue();
            }
            else
            {
                System.out.println("Not enough players please press ENTER\n");
            }
        }
        System.out.println("\n10 GAMES MADE SERVE OVERLOADING....SERVER BLEW UP.\n GOODBYE");
        scanner.close();
    }
 }
