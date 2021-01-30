package patterns.behavioural.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@AllArgsConstructor
public class Pilot implements Client {
    private String boardName;
    private RadioChat radioChat;
    @Override
    public void sendMessage(String message) {
     radioChat.sendMessage("Message from "+ this.getBoardName()+
             " Ú\""+message+"\"",this);
    }

    @Override
    public void handleMessage(String message) {
        log.info("Pilot {} receive message : {}",boardName,message);
    }
}
