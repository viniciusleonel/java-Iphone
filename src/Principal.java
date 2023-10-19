public class Principal {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligarAparelho();
        iphone.abrirMenu();
        iphone.ligar("+55 11 99331-0776");
        iphone.encerrar();
        iphone.atender();
        iphone.encerrar();
        iphone.exibirPagina("https://github.com/viniciusleonel/java-Iphone");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.play();
        iphone.selecionarMusica();
        iphone.pause();
        iphone.desligarAparelho();
    }
}
