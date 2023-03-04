public class LetraI {
    public static char[][] letraI(char caracter) {
        char[][] arr = {
                {caracter, caracter, caracter, caracter, caracter},
                {' ', ' ', caracter, ' ', ' '},
                {' ', ' ', caracter, ' ', ' '},
                {' ', ' ', caracter, ' ', ' '},
                {caracter, caracter, caracter, caracter, caracter}
        };
        return arr;
    }
}
