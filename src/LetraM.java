public class LetraM {
    public static char[][] letraM(char caracter) {
        char[][] arr = {
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, caracter, ' ', caracter, caracter},
                {caracter, ' ', caracter, ' ', caracter},
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, ' ', ' ', ' ', caracter}
        };
        return arr;
    }
}
