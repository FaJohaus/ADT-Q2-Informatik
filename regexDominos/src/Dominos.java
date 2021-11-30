import java.util.Arrays;
import java.util.List;

public class Dominos {
    public static List<String[]> regexDominos;

    public static List<String[]> getRegexDominos() {
        //Erstelle eine Liste mit allen Dominos jeweils als String Array
        regexDominos =
            (List<String[]>) Arrays.asList(
                new String[]{"c(a+b)*", "bcb"},
                new String[]{"b(a+c)b", "abc"},
                new String[]{"ab*c", "ccb"},
                new String[]{"c*bb*", "ba"},
                new String[]{"(b+a)*", "acb"},
                new String[]{"a(c+b)", "baba"},
                new String[]{"b(a+b)*", "cb"},
                new String[]{"(a+b+c)*", "a"},
                new String[]{"(a+b)c*", "bb"},
                new String[]{"a+cc+b*", "bca"},
                new String[]{"bc+a*", "bc"},
                new String[]{"a+b*c*", "ba"},
                new String[]{"(ba)*", "accb"},
                new String[]{"ac*b+c*b", "bab"},
                new String[]{"b(ab)*", "aabc"},
                new String[]{"(aa+a)b*c", "bcb"},
                new String[]{"b(a+c)b", "ca"},
                new String[]{"b*ca*", "abbc"},
                new String[]{"a(b+c)*", "b"},
                new String[]{"b(c+a)*", "b"},
                new String[]{"b+ca", "ab"},
                new String[]{"b(ab)*", "ba"},
                new String[]{"ab*c", "bc"},
                new String[]{"b(a+c)b", "acb"}
        );
        return regexDominos;
    }
}
