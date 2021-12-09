package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {


    public List<Character> getUniqueChars(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text is null.");
        }
        List<Character> resultCharList = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            char findChar = text.charAt(i);
            if (!(isCharInList(resultCharList, findChar))) {
                resultCharList.add(findChar);
            }
        }
        return resultCharList;
    }


    public boolean isCharInList(List<Character> list, char findChar) {
        boolean result = false;
        for (Character element : list) {
            if (element == findChar) {
                result = true;
            }
        }
        return result;
    }

}
