package game;

import lombok.Data;

@Data
public class GameResult {
    private int gamesPlayed;
    private int playerAGamesWon;
    private int playerBGamesWon;
    private int tiedGames;

    public GameResult(final int gamesPlayed, final int playerAGamesWon, final int playerBGamesWon) {
        this.gamesPlayed = gamesPlayed;
        this.playerAGamesWon = playerAGamesWon;
        this.playerBGamesWon = playerBGamesWon;
        this.tiedGames = getTiedGamesCount(gamesPlayed, playerAGamesWon, playerBGamesWon);
    }

    private int getTiedGamesCount(final int gamesToPlay, final int playerAGamesWon, final int playerBGamesWon) {
        return gamesToPlay - playerAGamesWon - playerBGamesWon;
    }
}
