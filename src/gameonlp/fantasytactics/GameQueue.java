package gameonlp.fantasytactics;

import java.util.Queue;

public class GameQueue implements Updatable {

    private static GameQueue ourInstance = new GameQueue();
    private Queue<MessageDecorator> currentMessages;
    private Queue<MessageDecorator> nextMessages;

    private GameQueue() {
    }

    public static GameQueue getInstance() {
        return ourInstance;
    }

    @Override
    public void update() {

    }
}
