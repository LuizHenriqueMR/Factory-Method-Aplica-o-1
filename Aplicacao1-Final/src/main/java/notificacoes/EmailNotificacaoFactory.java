package notificacoes;

public class EmailNotificacaoFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new EmailNotificacao();
    }
}
