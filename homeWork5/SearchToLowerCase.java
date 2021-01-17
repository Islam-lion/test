package HomeWork.homeWork5;

public class SearchToLowerCase implements ISearchEngine{
    @Override
    public long search(String text, String word) {
        String toLowerCaseText = text.toLowerCase();
        String toLowerCaseWord = word.toLowerCase();
        long counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.insert(0, " ").append(toLowerCaseWord).append(" ");
        int index = toLowerCaseText.indexOf(String.valueOf(stringBuilder));
        while (index != -1) {
            counter++;
            index = toLowerCaseText.indexOf(String.valueOf(stringBuilder), index+1);
        }
        return counter;
    }
}
