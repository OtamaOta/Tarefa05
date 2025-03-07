// Classe que implementa a notificação por e-mail
public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando e-mail: " + message);
    }
}