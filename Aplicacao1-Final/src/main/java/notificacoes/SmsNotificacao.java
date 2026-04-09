package notificacoes;

public class SmsNotificacao implements Notificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[SMS] Enviando para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Status: SMS enviado com sucesso.\n");
    }
}
