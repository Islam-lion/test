package HomeWork.homeWork5;

import java.io.FileNotFoundException;

public class WarAndPeaceMain1{
    public static void main(String[] args) throws FileNotFoundException {
        WarAndPeace war = new WarAndPeace();
        EasySearch easySearch = new EasySearch();
        RegExSearch regExSearch = new RegExSearch();
        SearchToLowerCase searchToLowerCase = new SearchToLowerCase();
        String text = war.readFile("C://Users//pryse//OneDrive//Рабочий стол//Война и мир_книга.txt");
        System.out.println(searchToLowerCase.search(text,"война"));
        System.out.println(searchToLowerCase.search(text,"и"));
        System.out.println(searchToLowerCase.search(text,"мир"));
    }
}
