public class HelloWorld {
    public static void main(String[] args) {
        letraS();
        System.out.println();

        letraA();
        System.out.println();

        letraB();
        System.out.println();

        letraI();
        System.out.println();

        letraN();
        System.out.println();

        letraE();
        System.out.println();
    }

    public static void letraS() {
        imprimirLinha(new char[]{'S', 'S', 'S', 'S', 'S'});
        imprimirLinha(new char[]{'S', ' ', ' ', ' ', ' '});
        imprimirLinha(new char[]{'S', 'S', 'S', 'S', 'S'});
        imprimirLinha(new char[]{' ', ' ', ' ', ' ', 'S'});
        imprimirLinha(new char[]{'S', 'S', 'S', 'S', 'S'});
    }

    public static void letraA() {
        imprimirLinha(new char[]{'A', 'A', 'A', 'A', 'A'});
        imprimirLinha(new char[]{'A', ' ', ' ', ' ', 'A'});
        imprimirLinha(new char[]{'A', 'A', 'A', 'A', 'A'});
        imprimirLinha(new char[]{'A', ' ', ' ', ' ', 'A'});
        imprimirLinha(new char[]{'A', ' ', ' ', ' ', 'A'});
    }

    public static void letraB() {
        imprimirLinha(new char[]{'B', 'B', 'B', 'B', ' '});
        imprimirLinha(new char[]{'B', ' ', ' ', ' ', 'B'});
        imprimirLinha(new char[]{'B', 'B', 'B', 'B', ' '});
        imprimirLinha(new char[]{'B', ' ', ' ', ' ', 'B'});
        imprimirLinha(new char[]{'B', 'B', 'B', 'B', ' '});
    }

    public static void letraI() {
        imprimirLinha(new char[]{'I', 'I', 'I', 'I', 'I'});
        imprimirLinha(new char[]{' ', ' ', 'I', ' ', ' '});
        imprimirLinha(new char[]{' ', ' ', 'I', ' ', ' '});
        imprimirLinha(new char[]{' ', ' ', 'I', ' ', ' '});
        imprimirLinha(new char[]{'I', 'I', 'I', 'I', 'I'});
    }

    public static void letraN() {
        imprimirLinha(new char[]{'N', ' ', ' ', ' ', 'N'});
        imprimirLinha(new char[]{'N', 'N', ' ', ' ', 'N'});
        imprimirLinha(new char[]{'N', ' ', 'N', ' ', 'N'});
        imprimirLinha(new char[]{'N', ' ', ' ', 'N', 'N'});
        imprimirLinha(new char[]{'N', ' ', ' ', ' ', 'N'});
    }

    public static void letraE() {
        imprimirLinha(new char[]{'E', 'E', 'E', 'E', 'E'});
        imprimirLinha(new char[]{'E', ' ', ' ', ' ', ' '});
        imprimirLinha(new char[]{'E', 'E', 'E', 'E', ' '});
        imprimirLinha(new char[]{'E', ' ', ' ', ' ', ' '});
        imprimirLinha(new char[]{'E', 'E', 'E', 'E', 'E'});
    }

    public static void imprimirLinha(char [] linha) {
        for (int i = 0; i < linha.length; i++) {
            System.out.print(linha[i] + " ");
        }
        System.out.println();
    }
}
