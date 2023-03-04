public class LetraK {
    public static char[][] letraK(char caracter) {
        char[][] arr = {
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, ' ', ' ', caracter, ' '},
                {caracter, caracter, caracter, ' ', ' '},
                {caracter, ' ', ' ', caracter, ' '},
                {caracter, ' ', ' ', ' ', caracter}
        };
        return arr;
    }
}
