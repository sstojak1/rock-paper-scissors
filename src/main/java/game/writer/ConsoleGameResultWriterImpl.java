package game.writer;

import game.GameResult;

public class ConsoleGameResultWriterImpl implements GameResultWriter {

    @Override
    public void write(final GameResult gameResult) {
        System.out.printf("Player A wins %d of %d games%n", gameResult.getPlayerAGamesWon(), gameResult.getGamesPlayed());
        System.out.printf("Player B wins %d of %d games%n", gameResult.getPlayerBGamesWon(), gameResult.getGamesPlayed());
        System.out.printf("Tie: %d of %d games%n", gameResult.getTiedGames(), gameResult.getGamesPlayed());
    }
}
