package gameonlp.fantasytactics;

public class Achievement implements Listener {

    public Achievement() {
        queue.register(this);
    }

    @Override
    public void listen(Message m) {
        switch (m.messageType) {
            case ATTACKMESSAGE:
                System.out.println("attack");
                break;
            case REGIONENTERMESSAGE:
                System.out.println("region enter");
                break;
        }
    }
}
