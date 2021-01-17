package HomeWork.homeWork5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine{

    @Override
    public long search(String text, String word) {
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.insert(0, " ").append(word).append(" ");
        long counter = 0;
        Pattern pattern = Pattern.compile(String.valueOf(stringBuilder));
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            list.add(matcher.group());
            counter++;
        }
        return counter;
    }
}
