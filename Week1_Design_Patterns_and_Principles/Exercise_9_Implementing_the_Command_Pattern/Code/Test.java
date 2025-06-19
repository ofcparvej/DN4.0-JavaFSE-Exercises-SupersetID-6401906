import Commands.LightOffCommand;
import Commands.LightOnCommand;
import ICommand.Command;
import Receiver.Light;

public class Test {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);  // command are ready

        RemoteControl remote = new RemoteControl();    // remote is ready

        remote.setCommand(lightOn);                    // execution
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();

    }
}
