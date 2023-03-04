public class LetraS {
    public static char[][] letraS(char caracter) {
        char[][] arr = {
                {caracter, caracter, caracter, caracter, caracter},
                {caracter, ' ', ' ', ' ', ' '},
                {caracter, caracter, caracter, caracter, caracter},
                {' ', ' ', ' ', ' ', caracter},
                {caracter, caracter, caracter, caracter, caracter}
        };
        return arr;
    }
}
