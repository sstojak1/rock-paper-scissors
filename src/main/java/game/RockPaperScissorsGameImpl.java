package game;

import model.Player;
import model.ShapeValue;

public class RockPaperScissorsGameImpl implements RockPaperScissorsGame {

    private static final int GAMES_TO_PLAY = 100;
    private static int PLAYER_A_WON_GAMES = 0;
    private static int PLAYER_B_WON_GAMES = 0;

    private final Player playerA;
    private final Player playerB;

    public RockPaperScissorsGameImpl() {
        playerA = new Player(ShapeValue.PAPER);
        playerB = new Player();
    }

    @Override
    public void play() {
        for (int game = 0; game < GAMES_TO_PLAY; game++) {
            playerB.setPlayerShape(ShapeValue.randomShapeValue());
            final var winner = getWinningPlayer(playerA, playerB);
            incrementPlayersWinGameCount(winner);
        }

        printResults();
    }

    private Player getWinningPlayer(Player playerA, Player playerB) {
        final var playerAShape = playerA.getPlayerShape();
        final var playerBShape = playerB.getPlayerShape();
        if (playerAShape.beats(playerBShape)) {
            return playerA;
        } else if (playerBShape.beats(playerAShape)) {
            return playerB;
        }
        return null;
    }

    private void incrementPlayersWinGameCount(Player winner) {
        if (winner != null) {
            if (playerA.equals(winner)) {
                PLAYER_A_WON_GAMES++;
            } else {
                PLAYER_B_WON_GAMES++;
            }
        }
    }

    private void printResults() {
        System.out.printf("Player A wins %d of 100 games%n", PLAYER_A_WON_GAMES);
        System.out.printf("Player B wins %d of 100 games%n", PLAYER_B_WON_GAMES);
        System.out.printf("Tie: %d of 100 games%n", getTies());
    }

    private int getTies() {
        return GAMES_TO_PLAY - PLAYER_A_WON_GAMES - PLAYER_B_WON_GAMES;
    }
}
