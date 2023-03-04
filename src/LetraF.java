public class LetraF {
    public static char[][] letraF(char caracter) {
        char[][] arr = {
                {caracter, caracter, caracter, caracter, caracter},
                {caracter, ' ', ' ', ' ', ' '},
                {caracter, caracter, caracter, caracter, ' '},
                {caracter, ' ', ' ', ' ', ' '},
                {caracter, ' ', ' ', ' ', ' '}
        };
        return arr;
    }

}
