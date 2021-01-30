package patterns.behavioural.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@Data
public class Dispatcher implements Client {
    private RadioChat radioChat;
    private String dispatcherName;
    @Override
    public void sendMessage(String message) {

        radioChat.sendMessage("Message from "+ this.getDispatcherName()+
                " \""+message+"\"",this);
    }

    @Override
    public void handleMessage(String message) {
     log.info("Dispatcher receive message: {}",message);
    }
}
