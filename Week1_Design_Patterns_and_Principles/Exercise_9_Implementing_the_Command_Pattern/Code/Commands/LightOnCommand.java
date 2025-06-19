package Commands;
import Receiver.Light;
import ICommand.Command;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

    public void execute(){
        light.turnOn();
    }

}
