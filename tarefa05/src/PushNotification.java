// Classe que implementa a notificação por Push Notification
public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando Push Notification: " + message);
    }
}