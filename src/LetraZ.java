public class LetraZ {

    public static char[][] letraZ(char caracter) {
        char[][] arr = {
                {caracter, caracter, caracter, caracter, caracter},
                {' ', ' ', ' ', caracter, ' '},
                {' ', ' ', caracter, ' ', ' '},
                {' ', caracter, ' ', ' ', ' '},
                {caracter, caracter, caracter, caracter, caracter}
        };
        return arr;
    }
}
