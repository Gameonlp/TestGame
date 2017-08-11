package gameonlp.fantasytactics;

public interface Updatable {
    GameQueue queue = GameQueue.getInstance();

    void update();
}
