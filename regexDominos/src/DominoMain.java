import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DominoMain {
    public static void main(String[] args) {
        DominoKette();
    }

    public static ArrayList<String> DominoKette(){
        ArrayList<String> DominoKette = new ArrayList<>();

        //Kopiere die Liste in eine ArrayList, die für diesen Versuch verhackstückelt werden kann
        String [][] DominosArr = Dominos.getRegexDominos();
        ArrayList<String[]> Dominos = new ArrayList<>(Arrays.asList(DominosArr));

        /* for (String[] Domino : Dominos) {
            System.out.println(Domino[1]);
        } */

        return DominoKette;
    }

    private boolean isMatch(String regex, String string){


        return true;
    }
}
