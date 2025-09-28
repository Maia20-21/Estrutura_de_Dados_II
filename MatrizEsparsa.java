public class MatrizEsparsa {
    private int numLinhas;
    private int numColunas;
    private NoMatriz[] vetorLinhas;   // Vetor L[i] - ponteiro para o 1º nó da linha
    private NoMatriz[] vetorColunas;  // Vetor C[i]

    public MatrizEsparsa(int m, int n) {
        this.numLinhas = m;
        this.numLinhas = n;
        this.vetorLinhas = new NoMatriz[m];
        this.vetorColunas = new NoMatriz[n];
    }

    // método auxiliar para buscar um nó específico
    
}