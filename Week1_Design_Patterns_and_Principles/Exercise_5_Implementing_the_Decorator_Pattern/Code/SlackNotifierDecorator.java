import Inotifier.Notifier;

public class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator (Notifier notifier){
        super(notifier);
    }

    public void send() {
        super.send();
        System.out.println("Sending Slake Notification");
    }
}
