package app;

import notificacoes.EmailNotificacaoFactory;
import notificacoes.NotificacaoFactory;
import notificacoes.PushNotificacaoFactory;
import notificacoes.SmsNotificacaoFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== APLICAÇÃO 1 - FACTORY METHOD ===\n");

        NotificacaoFactory emailFactory = new EmailNotificacaoFactory();
        NotificacaoFactory smsFactory = new SmsNotificacaoFactory();
        NotificacaoFactory pushFactory = new PushNotificacaoFactory();

        emailFactory.processarEnvio("cliente@email.com", "Seu pedido foi aprovado.");
        smsFactory.processarEnvio("(64) 99999-0000", "Seu código de verificação é 1234.");
        pushFactory.processarEnvio("clienteApp01", "Você recebeu uma oferta especial no aplicativo.");
    }
}
