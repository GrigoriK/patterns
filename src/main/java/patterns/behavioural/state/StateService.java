package patterns.behavioural.state;

import lombok.Data;

@Data
public class StateService {
    private State state;

    public StateService(State state) {
        this.state = state;
    }

    public void changeState(){
        if (state instanceof Sleep){
            state = new Eat();
        }else if (state instanceof Eat){
            state = new Work();
        }else if (state instanceof Work){
            state = new Training();
        }else if (state instanceof Training){
            state = new Sleep();
        }
    }
    public void showCurrentActivity(){
        state.doSomeActivity();
    }

}
