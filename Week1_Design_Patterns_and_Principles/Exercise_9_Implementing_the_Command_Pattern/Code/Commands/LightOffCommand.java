package Commands;
import Receiver.Light;
import ICommand.Command;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light=light;
    }

    public void execute(){
        light.turnOff();
    }

}
