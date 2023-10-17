public class Programa {

    public static void main(String[] args) {

        ReprodutorMusical spotfy = new Spotfy();
        Navegador chrome = new Chrome();
        Telefone vivo = new Vivo();

        Iphone iphone = new Iphone(spotfy, vivo, chrome);

        iphone.getNavegador().exibirPagina();
        iphone.getNavegador().adicionarNovaAba();
        iphone.getNavegador().atualizarPagina();

        iphone.getReprodutorMusical().tocar();
        iphone.getReprodutorMusical().pausar();
        iphone.getReprodutorMusical().selecionarMusica();

        iphone.getTelefone().ligar();
        iphone.getTelefone().atender();
        iphone.getTelefone().iniciarChamadaVoz();




    }
}
