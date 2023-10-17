public abstract class Celular {

    protected ReprodutorMusical reprodutorMusical;
    protected Telefone telefone;
    protected Navegador navegador;

    public Celular(ReprodutorMusical reprodutorMusical, Telefone telefone, Navegador navegador) {
        this.reprodutorMusical = reprodutorMusical;
        this.telefone = telefone;
        this.navegador = navegador;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Navegador getNavegador() {
        return navegador;
    }

    public void setNavegador(Navegador navegador) {
        this.navegador = navegador;
    }
}
