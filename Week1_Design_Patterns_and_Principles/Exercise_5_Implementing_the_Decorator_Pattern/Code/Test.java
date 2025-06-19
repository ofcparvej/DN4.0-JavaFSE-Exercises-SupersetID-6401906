import Inotifier.Notifier;

public class Test {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        SMSNotifierDecorator smsNotifier = new SMSNotifierDecorator(notifier);
        SlackNotifierDecorator slackNotifier = new SlackNotifierDecorator(notifier);
        System.out.println("This is for SMS notifier ::");
        smsNotifier.send();
        System.out.println();
        System.out.println("This is for Second slake notifier ::");
        slackNotifier.send();


    }
}
