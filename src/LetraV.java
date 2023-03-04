public class LetraV {
    public static char[][] letraV(char caracter) {
        char[][] arr = {
                {' ', ' ', ' ', ' ', ' '},
                {caracter, ' ', ' ', ' ', caracter},
                {' ', caracter, ' ', caracter, ' '},
                {' ', ' ', caracter, ' ' , ' '},
                {' ', ' ', caracter, ' ', ' '}
        };
        return arr;
    }
}
