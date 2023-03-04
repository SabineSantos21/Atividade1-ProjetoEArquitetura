public class LetraD {
    public static char[][] letraD(char caracter) {
        char[][] arr = {
                {caracter, caracter, caracter, caracter, ' '},
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, caracter, caracter, caracter, ' '}
        };
        return arr;
    }
}
