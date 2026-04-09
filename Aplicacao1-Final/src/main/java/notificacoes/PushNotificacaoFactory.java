package notificacoes;

public class PushNotificacaoFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new PushNotificacao();
    }
}
