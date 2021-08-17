package game;

import lombok.RequiredArgsConstructor;
import model.Player;

@RequiredArgsConstructor
public class RockPaperScissorsGameImpl implements RockPaperScissorsGame {
    private final Player playerA;
    private final Player playerB;

    @Override
    public void play() {
        final var winner = getWinningPlayer(playerA, playerB);
        incrementPlayersWinGameCount(winner);
    }

    private Player getWinningPlayer(final Player playerA, final Player playerB) {
        final var playerAShape = playerA.getPlayerShape();
        final var playerBShape = playerB.getPlayerShape();
        if (playerAShape.beats(playerBShape)) {
            return playerA;
        } else if (playerBShape.beats(playerAShape)) {
            return playerB;
        }
        return null;
    }

    private void incrementPlayersWinGameCount(final Player winner) {
        if (winner != null) {
            if (playerA.equals(winner)) {
                playerA.incrementGamesWon();
            } else {
                playerB.incrementGamesWon();
            }
        }
    }
}
