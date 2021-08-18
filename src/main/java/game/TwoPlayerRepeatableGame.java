package game;

import model.Player;

import java.util.HashMap;
import java.util.Map;

public class TwoPlayerRepeatableGame {
    private final Player playerA;
    private final Player playerB;
    private final Map<Player, Integer> playersMap;

    public TwoPlayerRepeatableGame(final Player playerA, final Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.playersMap = initializeMap(playerA, playerB);
    }

    public GameResult play(final int gamesToPlay) {
        final var twoPlayerGame = new TwoPlayerGame(playerA, playerB);
        for (int game = 0; game < gamesToPlay; game++) {
            final var winner = twoPlayerGame.play();
            incrementPlayersWinGameCount(winner);
        }

        return new GameResult(gamesToPlay, playersMap.get(playerA), playersMap.get(playerB));
    }

    private void incrementPlayersWinGameCount(final Player winner) {
        if (winner != null) {
            playersMap.merge(winner, 1, Integer::sum);
        }
    }

    private Map<Player, Integer> initializeMap(final Player playerA, final Player playerB) {
        final var playersMap = new HashMap<Player, Integer>();
        playersMap.put(playerA, 0);
        playersMap.put(playerB, 0);

        return playersMap;
    }
}