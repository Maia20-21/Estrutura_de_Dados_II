public class NoMatriz {
    public int linha;
    public int coluna;
    public int valor;

    // ponteiros para a estrutura de Listas Cruzadas
    public NoMatriz proxLinha;
    public NoMatriz proxColuna;

    public NoMatriz(int i, int j, int v) {
        this.linha = i;
        this.coluna = j;
        this.valor = v;
        this.proxLinha = null;
        this.proxColuna = null;
    }

    public String toString() {
        return "()" + linha + "," + coluna + "): " + valor;
    }
}
