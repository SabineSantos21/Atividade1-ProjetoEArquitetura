public class LetraA {

    public static char[][] letraA(char caracter) {
        char[][] arr = {
                {caracter, caracter, caracter, caracter, caracter},
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, caracter, caracter, caracter, caracter},
                {caracter, ' ', ' ', ' ', caracter},
                {caracter, ' ', ' ', ' ', caracter}
        };
        return arr;
    }
}
