package patterns.behavioural.mediator;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Slf4j
public class FlightControl extends RadioChat {
    private Client dispatcher;
    private List<Client> pilots;

    public FlightControl() {
        pilots = new ArrayList<>();
    }

    public void addPilot(Client client) {
        if (client instanceof Pilot)
            pilots.add(client);
    }

    public void removePilot(Client client) {
        if (client instanceof Pilot) {
            pilots.remove(client);
        } else {
            log.info("Wrong type of object {}", client.getClass().getSimpleName());
        }
    }

    public void setDispatcher(Client dispatcher) {
        if (dispatcher instanceof Dispatcher) {
            this.dispatcher = dispatcher;
        } else {
            log.info("Wrong type of object {}", dispatcher.getClass().getSimpleName());
        }
    }


    @Override
    public void sendMessage(String message, Client client) {
        pilots.forEach(pilot -> {
            if (client instanceof Dispatcher) {
                pilot.handleMessage(message);
            } else {


                if (!client.equals(pilot)) {
                    pilot.handleMessage(message);
                }
            }
        });
        if (client != dispatcher) {
            dispatcher.handleMessage(message);
        }

    }

}
