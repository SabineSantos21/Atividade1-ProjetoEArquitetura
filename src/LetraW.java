public class LetraW {
    public static char[][] letraW(char caracter) {
        char[][] arr = {
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, ' ', caracter, ' ', caracter},
                {caracter, caracter, ' ', caracter, caracter},
                {caracter, ' ', ' ', ' ', caracter}
        };
        return arr;
    }
}
