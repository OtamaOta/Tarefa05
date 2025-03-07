import java.util.Scanner;

// Classe principal que executa o programa
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu de opções
        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente

        String type = "";
        switch (choice) {
            case 1:
                type = "email";
                break;
            case 2:
                type = "sms";
                break;
            case 3:
                type = "push";
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        // Solicita a mensagem
        System.out.println("Digite a mensagem a ser enviada:");
        String message = scanner.nextLine();

        // Cria a notificação usando o Factory
        Notification notification = NotificationFactory.createNotification(type);

        // Envia a notificação
        notification.send(message);

        scanner.close();
    }
}