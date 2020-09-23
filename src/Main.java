import Financa.TelaFinanca;
import Home.home;
import Login.Login;

public class Main {
    public static void main (String[] args)
    {
        Login meuLogin = new Login();
        meuLogin.setVisible(true);

        TelaCadastro cadastro = new TelaCadastro();
        cadastro.setVisible(true);

        home telaHome = new home();
        telaHome.setVisible(true);

        telaDetalharPostIt post = new telaDetalharPostIt();
        post.setVisible(true);




        telaCadastrarEvento evento = new telaCadastrarEvento();
        evento.setVisible(true);

        TelaCadastrarPostIt postIt = new TelaCadastrarPostIt();
        postIt.setVisible(true);

        TelaCalendarioEvento calEvent = new TelaCalendarioEvento();
        calEvent.setVisible(true);





        telaCartaoCredito cartao = new telaCartaoCredito();
        cartao.setVisible(true);

        TelaConfiguracao config = new TelaConfiguracao();
        config.setVisible(true);

        telaContaCorrente conta = new telaContaCorrente();
        conta.setVisible(true);

        TelaDashboard board = new TelaDashboard();
        board.setVisible(true);

        TelaDetalharFinanca financa  = new TelaDetalharFinanca();
        financa.setVisible(true);

        TelaFinanca cont = new TelaFinanca();
        cont.setVisible(true);

        TelaGasto gasto = new TelaGasto();
        gasto.setVisible(true);

        TelaPainel painel = new TelaPainel();
        painel.setVisible(true);

    }

}
