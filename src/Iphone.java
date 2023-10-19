import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean emLigacao;

    public List<String> listaDeMusicas = new ArrayList<String>();

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean getLigacao() {
        return emLigacao;
    }

    private void setLigacao(boolean emLigacao) {
        this.emLigacao = emLigacao;
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba do navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web");
    }

    @Override
    public void ligar(String numero){
        if(!this.getLigacao()){
            System.out.println("Ligando para " + numero);
            this.setLigacao(true);
        } else {
            System.out.println("Ligação em andamento...");
        }
    }

    @Override
    public void atender(){
        System.out.println("Atendendo ligação");
    }

    @Override
    public void encerrar(){
        if(this.getLigacao()){
            System.out.println("Encerrando ligação");
            this.setLigacao(false);
        }
    }

    @Override
    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void ligarAparelho() {
        if (!(getLigado())) {
            this.setLigado(true);
            System.out.println("Ligando Iphone");
        } else {
            System.out.println("Iphone já está ligado!");
        }

    }

    @Override
    public void desligarAparelho() {
        if (getLigado()){
            this.setLigado(false);
            System.out.println("Desligando Iphone");
        } 
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----Menu-----");
        System.out.println("Está ligado? " + this.getLigado() );
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+= 10){
            System.out.print("|");
        }
        System.out.println(" ");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() && this.getVolume() < 100){
            this.setVolume(this.getVolume() + 5);
            System.out.println("Aumentando volume em + 5");
        } else if(this.getVolume() >= 100){
            this.setVolume(100);
            System.out.println("Volume Máximo");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume() -5);
            System.out.println("Diminuindo volume em - 5");
        } else if(this.getVolume() == 0){
            ligarMudo();
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
            System.out.println("Mudo ativado!");
        } else if(this.getLigado() && this.getVolume() == 0){
            System.out.println("Mudo já está ativado!");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
            System.out.println("Mudo desativado!");
        } else if(this.getLigado() && this.getVolume() != 0){
            System.out.println("Mudo já está desativado!");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
            System.out.println("Tocando Musica...");
        } else {
            System.out.println("Aparelho já está tocando!");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
            System.out.println("Musica pausada!");
        } else {
            System.out.println("Aparelho já está pausado!");
        }
    }

    private void listandoMusicas(){
        listaDeMusicas.add("We Will Rock You - Queen");
        listaDeMusicas.add("It's Only Rock 'N' Roll (But I Like It) - Rolling Stones");
        listaDeMusicas.add("Enter Sandman - Metallica");
        listaDeMusicas.add("Another Brick In The Wall - Pink Floyd");
        listaDeMusicas.add("Back In Black - AC/DC");
        for (String musica : listaDeMusicas) {
            System.out.println((listaDeMusicas.indexOf(musica)+1) +  "- " + musica);
        }
    }

    @Override
    public void selecionarMusica(){
        if (this.getLigado()){
            System.out.println("Escolha uma musica:");
            listandoMusicas();
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    play();
                    System.out.println(listaDeMusicas.get(escolha-1));
                    break;
                case 2:
                    play();
                    System.out.println(listaDeMusicas.get(escolha-1));
                    break;
                case 3:
                    play();
                    System.out.println(listaDeMusicas.get(escolha-1));
                    break;
                case 4:
                    play();
                    System.out.println(listaDeMusicas.get(escolha-1));
                    break;
                case 5:
                    play();
                    System.out.println(listaDeMusicas.get(escolha-1));
                    break;
                default:
                    System.out.println("Musica não encontrada!");
            }  
        }        
    }
}
