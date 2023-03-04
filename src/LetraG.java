public class LetraG {
    public static char[][] letraG(char caracter) {
        char[][] arr = {
                {caracter, caracter, caracter, caracter, caracter},
                {caracter, ' ', ' ', ' ', ' '},
                {caracter, ' ', caracter, caracter, caracter},
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, caracter, caracter, caracter, caracter}
        };
        return arr;
    }
}
