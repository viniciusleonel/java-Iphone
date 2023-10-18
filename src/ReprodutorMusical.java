import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReprodutorMusical extends Iphone{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public List<String> listaDeMusicas = new ArrayList<String>();

    protected ReprodutorMusical() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

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

    public void ligar() {
        if (!(getLigado())) {
            this.setLigado(true);
            System.out.println("Ligando...");
        } else {
            System.out.println("Aparelho já está ligado!");
        }

    }

    public void desligar() {
        if (getLigado()){
            this.setLigado(false);
            System.out.println("Desligando...");
        } else {
            System.out.println("Impossível desligar, aparelho já está desligado!");
        }

    }

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

    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
            System.out.println("Aumentando volume em + 5");
        }
    }

    public void menosVolume() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume() -5);
            System.out.println("Diminuindo volume em - 5");
        } else if(this.getVolume() == 0){
            ligarMudo();
        }
    }

    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
            System.out.println("Mudo ativado!");
        } else if(this.getLigado() && this.getVolume() == 0){
            System.out.println("Mudo já está ativado!");
        }
    }

    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
            System.out.println("Mudo desativado!");
        } else if(this.getLigado() && this.getVolume() != 0){
            System.out.println("Mudo já está desativado!");
        }
    }

    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
            System.out.println("Tocando Musica...");
        } else {
            System.out.println("Aparelho já está tocando!");
        }
    }

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
