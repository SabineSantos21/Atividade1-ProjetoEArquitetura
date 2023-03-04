public class LetraB {

    public static char[][] letraB(char caracter) {
        char[][] arr = {
                { caracter, caracter, caracter, caracter, ' '},
                { caracter, ' ', ' ', ' ', caracter},
                { caracter, caracter, caracter, caracter, ' '},
                { caracter, ' ', ' ', ' ', caracter},
                { caracter, caracter, caracter, caracter, ' '}
        };
        return arr;
    }
}
