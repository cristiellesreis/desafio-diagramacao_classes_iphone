public class Spotfy implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando música");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a música");

    }
}
