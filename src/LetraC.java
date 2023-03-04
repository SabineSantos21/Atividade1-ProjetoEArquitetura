public class LetraC {

    public static char[][] letraC(char caracter) {
        char[][] arr = {
                {' ', ' ', caracter, caracter, caracter},
                {' ', caracter, ' ', ' ', ' '},
                {caracter, ' ', ' ', ' ', ' '},
                {' ', caracter, ' ', ' ', ' '},
                {' ', ' ', caracter, caracter, caracter}
        };
        return arr;
    }
}
