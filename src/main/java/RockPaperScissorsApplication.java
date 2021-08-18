import game.TwoPlayerRepeatableGame;
import game.writer.ConsoleGameResultWriterImpl;
import model.strategy.PaperStrategy;
import model.Player;
import model.strategy.RandomStrategy;

public class RockPaperScissorsApplication {

    public static void main(String[] args) {
        final var playerA = new Player(new PaperStrategy());
        final var playerB = new Player(new RandomStrategy());
        final var twoPlayerRepeatableGame = new TwoPlayerRepeatableGame(playerA, playerB);
        final var gameResult = twoPlayerRepeatableGame.play(100);

        new ConsoleGameResultWriterImpl().write(gameResult);
    }
}
