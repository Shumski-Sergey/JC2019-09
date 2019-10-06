package nbogdan.FullPokerStars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Check {
    Check(){}
    static boolean answer(String s) {
        Pattern p = Pattern.compile("[dDдД][aAаА]|(yes|YES)|[yY]");
        Matcher matcher = p.matcher(s);
        return matcher.find();
    }
}
