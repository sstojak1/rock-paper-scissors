package game;

import lombok.RequiredArgsConstructor;
import model.Player;

@RequiredArgsConstructor
public class TwoPlayerGame implements RockPaperScissorsGame {
    private final Player playerA;
    private final Player playerB;

    @Override
    public Player play() {
        return getWinningPlayer();
    }

    private Player getWinningPlayer() {
        final var playerAShape = playerA.chooseShape();
        final var playerBShape = playerB.chooseShape();
        if (playerAShape.beats(playerBShape)) {
            return playerA;
        } else if (playerBShape.beats(playerAShape)) {
            return playerB;
        }
        return null;
    }
}
