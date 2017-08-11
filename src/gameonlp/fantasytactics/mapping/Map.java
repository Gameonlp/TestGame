package gameonlp.fantasytactics.mapping;

import gameonlp.fantasytactics.Updatable;

public class Map implements Updatable {
    private int height, width;
    Tile[] tiles = new Tile[height * width];

    @Override
    public void update() {

    }
}
