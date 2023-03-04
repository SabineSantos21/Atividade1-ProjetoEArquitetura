public class EnviarLetras {
    public static void letras(char[] letras) {

        for (var i = 0; i < letras.length; i++) {
            char[][] arrLetra = verificarLetra.verificarLetra(letras[i]);

            ImprimirLetra.imprimirLetra(arrLetra);
            System.out.println();
        }

        System.out.println("------------------------------------------------------------");
    }
}
