public class Fila {
    private Node inicio;
    public Node ultimo;
    public Fila() {
        inicio = null;
        ultimo = null;
    }

    public void inserir(int valor) {
        Node no = new Node();
        no.setInfo(valor);
        // inicia lista caso esteja vzia
        if (inicio == null) {
            inicio = no;
            ultimo = no;
        } else {
            ultimo.setProximo(no);
            ultimo = no;
        }
    }

    public void remover() {
        Node deletado;
        if (inicio == null) {
            System.out.println("Fila esta vazia.");
        }
        else {
            deletado = inicio;
            inicio = inicio.getProximo();
            deletado = null;
        }
    }

    public void imprimir() {
        Node proximo = inicio;
        if (proximo == null) {
            System.out.println("Fila esta vazia.");
        } else {
            while (proximo != null) {
                System.out.print(proximo.getInfo()+" ");
                proximo = proximo.getProximo();
            }
        }
    }
}
