import java.util.*;

public class Driver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Snakes: ");
        int noOfSnakes = scanner.nextInt();

        List<Snake> snakes = new ArrayList<Snake>();
        for(int i=0; i<noOfSnakes; i++) {
            System.out.println("Enter the start and end of Snake: ");
            snakes.add(new Snake(scanner.nextInt(), scanner.nextInt()));
        }

        System.out.println("Enter the number of Ladders: ");
        int noOfLadders = scanner.nextInt();

        List<Ladder> ladders = new ArrayList<Ladder>();
        for(int i=0; i<noOfLadders; i++) {
            System.out.println("Enter the start and end of Ladder: ");
            ladders.add(new Ladder(scanner.nextInt(), scanner.nextInt()));
        }

        System.out.println("Enter the number of players: ");

        int noOfPlayers = scanner.nextInt();

        List<Player> players = new ArrayList<Player>();
        for(int i=0; i<noOfPlayers; i++) {
            System.out.println("Enter the name of player: ");
            players.add(new Player(scanner.next()));
        }

        SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService();
        snakeAndLadderService.setLadders(ladders);
        snakeAndLadderService.setSnakes(snakes);
        snakeAndLadderService.setPlayers(players);

        snakeAndLadderService.startGame();
    }
};