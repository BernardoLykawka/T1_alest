import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        App app = new App();

        boolean done = false;
        while (!done) {
            System.out.println("Escolha: ");
            System.out.println("1. Fila");
            System.out.println("2. Pilha");
            System.out.println("3. Fila Encadeada");
            System.out.println("4. Pilha Encadeada");

            int a = sc.nextInt();
            switch (a) {
                case 1:
                    app.chamarFila();done = true;
                    break;

                case 2:
                    app.chamarPilha();done = true;
                    break;
                case 3:
                    app.chamarFilaEncadeada();done = true;
                    break;
                case 4:
                    app.chamarPilhaEncadeada(); done = true;
                    break;
                default:
                    done = true;
                    System.out.println("Fim do programa!!");
                    break;
            }
        }
    }
}
