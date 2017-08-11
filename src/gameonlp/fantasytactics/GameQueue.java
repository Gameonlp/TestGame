package gameonlp.fantasytactics;

import java.util.LinkedList;
import java.util.Queue;

public class GameQueue implements Updatable {

    private static GameQueue ourInstance = new GameQueue();
    private Queue<Message> currentMessages;
    private Queue<Message> nextMessages;
    private LinkedList<Listener> listeners;

    private GameQueue() {
        currentMessages = new LinkedList<>();
        nextMessages = new LinkedList<>();
        listeners = new LinkedList<>();
    }

    public static GameQueue getInstance() {
        return ourInstance;
    }

    public synchronized void addMessage(Message message) {
        nextMessages.add(message);
    }

    public synchronized void register(Listener listener) {
        listeners.add(listener);
    }

    public synchronized boolean unRegister(Listener listener) {
        if (listeners.contains(listener)) {
            listeners.remove(listener);
            return true;
        }
        return false;
    }

    @Override
    public void update() {
        for (Message currentMessage : currentMessages) {
            for (Listener listener : listeners) {
                listener.listen(currentMessage);
            }
        }
        currentMessages.clear();
        currentMessages.addAll(nextMessages);
        nextMessages.clear();
    }
}
