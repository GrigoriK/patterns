package patterns.behavioural.mediator;

public interface Client {
    void sendMessage(String message);
    void handleMessage(String message);
}
