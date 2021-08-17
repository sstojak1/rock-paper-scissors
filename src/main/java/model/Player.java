package model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Player {
    private int gamesWon;
    private ShapeValue playerShape;

    public Player(final ShapeValue shapeValue) {
        this.playerShape = shapeValue;
    }

    public void incrementGamesWon() {
        gamesWon++;
    }
}
