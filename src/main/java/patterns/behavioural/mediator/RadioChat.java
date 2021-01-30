package patterns.behavioural.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class RadioChat {
    public abstract void sendMessage(String message, Client client);

}
