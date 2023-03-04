public class LetraP {
    public static char[][] letraP(char caracter) {
        char[][] arr = {
                {caracter, caracter, caracter, caracter, caracter},
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, caracter, caracter, caracter, caracter},
                {caracter, ' ', ' ', ' ', ' '},
                {caracter, ' ', ' ', ' ', ' '}
        };
        return arr;
    }
}
