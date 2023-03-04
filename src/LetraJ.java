public class LetraJ {
    public static char[][] letraJ(char caracter) {
        char[][] arr = {
                {' ', caracter, caracter, caracter, caracter},
                {' ', ' ', ' ', caracter, ' '},
                {' ', ' ', ' ', caracter, ' '},
                {caracter, ' ', ' ', caracter, ' '},
                {caracter, caracter, caracter, caracter, ' '}
        };
        return arr;
    }
}
