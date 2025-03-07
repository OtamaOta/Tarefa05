// Classe Factory que cria instâncias de notificações
public class NotificationFactory {
    // Método estático para criar a notificação com base no tipo
    public static Notification createNotification(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Tipo de notificação desconhecido: " + type);
        }
    }
}