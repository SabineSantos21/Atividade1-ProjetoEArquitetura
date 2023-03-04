public class LetraX {
    public static char[][] letraX(char caracter) {
        char[][] arr = {
                {caracter, ' ', ' ', ' ', caracter},
                {' ', caracter, ' ', caracter, ' '},
                {' ', ' ', caracter, ' ', ' '},
                {' ', caracter, ' ', caracter, ' '},
                {caracter, ' ', ' ', ' ', caracter}
        };
        return arr;
    }
}
