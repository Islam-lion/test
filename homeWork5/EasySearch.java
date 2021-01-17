package HomeWork.homeWork5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasySearch implements ISearchEngine{
    @Override
    public long search(String text, String word) {
        long counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.insert(0, " ").append(word).append(" ");
        int index = text.indexOf(String.valueOf(stringBuilder));
        while (index != -1){
            counter++;
            index = text.indexOf(String.valueOf(stringBuilder), index+1);
        }
        return counter;
    }
}
