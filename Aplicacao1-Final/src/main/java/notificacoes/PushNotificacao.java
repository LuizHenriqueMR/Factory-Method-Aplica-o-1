package notificacoes;

public class PushNotificacao implements Notificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[PUSH] Enviando para o usuário/app: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Status: push notification enviada com sucesso.\n");
    }
}
