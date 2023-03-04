public class LetraY {
    public static char[][] letraY(char caracter) {
        char[][] arr = {
                {caracter, ' ', ' ', ' ', caracter},
                {' ', caracter, ' ', caracter, ' '},
                {' ', ' ', caracter, ' ', ' '},
                {' ', ' ', caracter, ' ', ' '},
                {' ', ' ', caracter, ' ', ' '}
        };
        return arr;
    }
}
