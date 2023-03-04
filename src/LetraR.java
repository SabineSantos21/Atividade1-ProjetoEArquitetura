public class LetraR {
    public static char[][] letraR(char caracter) {
        char[][] arr = {
                {caracter, caracter, caracter, caracter, caracter},
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, caracter, caracter, caracter, caracter},
                {caracter, ' ', ' ', caracter, ' '},
                {caracter, ' ', ' ', ' ', caracter}
        };
        return arr;
    }
}
