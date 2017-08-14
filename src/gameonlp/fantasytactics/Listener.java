package gameonlp.fantasytactics;

public interface Listener {
    GameQueue queue = GameQueue.getInstance();

    void listen(Message m);
}
