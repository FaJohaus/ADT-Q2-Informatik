import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DominoMain {
    public static void main(String[] args) {
        for (String[] Domino : Dominos.getRegexDominos()) {
            System.out.println(Domino[1]);
        }

        //Kopiere die Liste in eine ArrayList, die für diesen Versuch verhackstückelt werden kann
    }
}
