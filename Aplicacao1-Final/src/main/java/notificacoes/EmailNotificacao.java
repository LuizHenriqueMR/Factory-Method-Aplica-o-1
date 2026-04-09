package notificacoes;

public class EmailNotificacao implements Notificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[E-MAIL] Enviando para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Status: e-mail enviado com sucesso.\n");
    }
}
