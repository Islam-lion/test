package HomeWork.homeWork5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarAndPeace{

    public String readFile(String link) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(link));
        String text = "";
        while (scanner.hasNext()){
            text += scanner.nextLine() + "\r\n";
        }
        scanner.close();
        return text;
    }

    public Set<String> findUniqueWord(String text){
        List<String> mainList = new LinkedList<>();
        List<String> reserveList = new LinkedList<>();

        Pattern pattern = Pattern.compile("[а-яА-Яa-zA-Z]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            mainList.add(matcher.group());
        }

        for (int i = 0; i < mainList.size(); i++) {
            for (int j = i+1; j < mainList.size(); j++) {
                if(mainList.get(i).equals(mainList.get(j))){
                    reserveList.add(mainList.get(j));
                }
            }
        }

        mainList.removeAll(reserveList);
        Set<String> set = new LinkedHashSet<>(mainList);
        return set;
    }

    public Map<Integer, String> findTopTenWord(String text){
        Map<Integer, String> treeMap = new TreeMap<>(new MapComparator());
        Map<Integer, String> treeMapTopTen = new TreeMap<>(new MapComparator());
        List<String> list = new LinkedList<>();

        Pattern pattern = Pattern.compile("[а-яА-Яa-zA-Z]+");
        Matcher m1 = pattern.matcher(text);
        while (m1.find()){
            list.add(m1.group());
        }

        int counter;
        for (int i = 0; i < list.size(); i++) {
            counter = 0;
            for (int j = 1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    counter++;
                }
            }
            treeMap.put(counter, list.get(i));
        }
        int temp = 0;
        for(Map.Entry<Integer, String> entry : treeMap.entrySet()){
            treeMapTopTen.put(entry.getKey(), entry.getValue());
            ++temp;
            if(temp == 10){
                break;
            }
        }

        return treeMapTopTen;
    }

}
