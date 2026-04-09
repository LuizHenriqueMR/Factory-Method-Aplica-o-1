package notificacoes;

public abstract class NotificacaoFactory {
    public abstract Notificacao criarNotificacao();

    public void processarEnvio(String destinatario, String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(destinatario, mensagem);
    }
}
