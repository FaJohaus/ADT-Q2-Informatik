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

        //Nehme so lange einen zufälligen Domino, bis ein Match gefunden wurde, oder bis alle ausprobiert wurden


        return DominoKette;
    }

    private boolean isMatch(String regex, String string2check){
        //Überprüfe, ob der erste Buchstaben des Strings mit der regex möglich
        
        for (int i = 0; i < regex.length();) {
            //Gehe die regex so lange durch, bis ein "+", "*", ")", oder "(" gefunden wird
            while(isLetter(regex.charAt(i))) i++;
            String first = regex.substring(0, i-1);

            if(regex.charAt(i) == '+'){
                ArrayList<String> choices = new ArrayList<>();
                choices.add(first);

                while(isLetter(regex.charAt(i))) i++;
                choices.add(regex.substring(first.length()+1, i-1));

                //Überprüfe, da es ein 'oder' gibt, ob der string mit einer der möglichkeiten (alle strings in choices) beginnt
                boolean isChoice = false;
                for (String choice : choices) {
                    if(string2check.substring(0, choice.length()-1).equals(choice)){ isChoice = true; };
                }
                if(!isChoice) return false;


            }

            if(regex.charAt(i) == '*'){

            }

            //Bei Klammern einfach mit einggeklammertem rekursiv aufrufen
        }
        
        //if(rekursiver aufruf) is true return true, else return false
        return true;
    }

    /* private boolean isPlusCharChain(String regex, String string2check){
        if(regex.charAt(i) == '+'){
            ArrayList<String> choices = new ArrayList<>();
            choices.add(first);

            while(isLetter(regex.charAt(i))) i++;
            choices.add(regex.substring(first.length()+1, i-1));

            //Überprüfe, da es ein 'oder' gibt, ob der string mit einer der möglichkeiten (alle strings in choices) beginnt
            boolean isChoice = false;
            for (String choice : choices) {
                if(string2check.substring(0, choice.length()-1).equals(choice)){ isChoice = true; };
            }
            if(!isChoice) return false;


        }
    } */

    private boolean isLetter(char c){
        if(c != '+' && c != '*' && c != '(' && c != ')') return true;
        return false;
    }
}
