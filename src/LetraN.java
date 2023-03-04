public class LetraN {

    public static char[][] letraN(char caracter) {
        char[][] arr = {
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, caracter, ' ', ' ', caracter},
                {caracter, ' ', caracter, ' ', caracter},
                {caracter, ' ', ' ', caracter, caracter},
                {caracter, ' ', ' ', ' ', caracter}
        };
        return arr;
    }
}
