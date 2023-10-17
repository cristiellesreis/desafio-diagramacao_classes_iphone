public class Vivo implements Telefone{
    @Override
    public void ligar() {
        System.out.println("Fazendo uma ligação");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação");

    }

    @Override
    public void iniciarChamadaVoz() {
        System.out.println("Iniciando uma chamada de voz");

    }
}
