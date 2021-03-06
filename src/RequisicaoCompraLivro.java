import java.time.LocalDate;

public class RequisicaoCompraLivro extends RequisicaoCompra {
    String estado;
    LocalDate data;
    String oficio;
    PropostaAquisicao propostaAquisicao;
    Livro livro;
    Utilizador utilizador;

    public RequisicaoCompraLivro(String estado, LocalDate data, String oficio, PropostaAquisicao propostaAquisicao, Livro livro, Utilizador utilizador) {
        super(estado, data, oficio, livro, utilizador);
        this.estado = estado;
        this.data = data;
        this.oficio = oficio;
        this.propostaAquisicao = propostaAquisicao;
        this.livro = livro;
        this.utilizador = utilizador;
    }

    @Override
    public String getEstado() {
        return estado;
    }

    @Override
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public LocalDate getData() {
        return data;
    }

    @Override
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String getOficio() {
        return oficio;
    }

    @Override
    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public PropostaAquisicao getPropostaAquisicao() {
        return propostaAquisicao;
    }

    public void setPropostaAquisicao(PropostaAquisicao propostaAquisicao) {
        this.propostaAquisicao = propostaAquisicao;
    }

    @Override
    public Livro getLivro() {
        return livro;
    }

    @Override
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public Utilizador getUtilizador() {
        return utilizador;
    }

    @Override
    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
}
