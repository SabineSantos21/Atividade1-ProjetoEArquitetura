public class verificarLetra {

    public static char[][] verificarLetra(char letra) {
        switch (letra) {
            case 'A':
                return LetraA.letraA('A');

            case 'B':
                return LetraB.letraB('B');

            case 'C':
                return LetraC.letraC('C');

            case 'D':
                return LetraD.letraD('D');

            case 'E':
                return LetraE.letraE('E');

            case 'F':
                return LetraF.letraF('F');

            case 'G':
                return LetraG.letraG('G');

            case 'H':
                return LetraH.letraH('H');

            case 'I':
                return LetraI.letraI('I');

            case 'J':
                return LetraJ.letraJ('J');

            case 'L':
                return LetraL.letraL('L');

            case 'M':
                return LetraM.letraM('M');

            case 'N':
                return LetraN.letraN('N');

            case 'O':
                return LetraO.letraO('O');

            case 'P':
                return LetraP.letraP('P');

            case 'Q':
                return LetraQ.letraQ('Q');

            case 'R':
                return LetraR.letraR('R');

            case 'S':
                return LetraS.letraS('S');

            case 'T':
                return LetraT.letraT('T');

            case 'U':
                return LetraU.letraU('U');

            case 'V':
                return LetraV.letraV('V');

            case 'W':
                return LetraW.letraW('W');

            case 'X':
                return LetraX.letraX('X');

            case 'Y':
                return LetraY.letraY('Y');

            case 'Z':
                return LetraZ.letraZ('Z');

            default:
                break;
        }

        return new char[0][];
    }
}
