public class LetraQ {
    public static char[][] letraQ(char caracter) {
        char[][] arr = {
                {caracter, caracter, caracter, caracter, caracter},
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, ' ', caracter, ' ', caracter},
                {caracter, ' ', ' ', caracter, caracter},
                {caracter, caracter, caracter, caracter, caracter}
        };
        return arr;
    }
}
