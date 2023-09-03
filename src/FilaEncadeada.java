import java.util.Scanner;

// Pedro Gonçalves Classen

public class FilaEncadeada {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Fila fila = new Fila();
        int acao;
        int valor;

        while(true) {
            // instrucoes
            System.out.println("\n1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("0 - Imprimir");
            acao = scanner.nextInt();

            switch (acao) {
                // insert
                case 1:
                    System.out.print("Valor: ");
                    valor = scanner.nextInt();
                    fila.inserir(valor);
                    break;

                // remove
                case 2:
                    fila.remover();
                    break;

                // imprimir
                case 0:
                    fila.imprimir();
                    break;

                default:
                    System.out.println("Operacao invalida.");
            }
        }
    }
}
