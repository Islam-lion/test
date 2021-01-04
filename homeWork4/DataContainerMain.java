package HomeWork.homeWork4;


import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> dataContainer = new DataContainer<>(new String[1]);
        System.out.println(dataContainer.add("One"));
        System.out.println(dataContainer.add("Two98765"));
        System.out.println(dataContainer.add("Three4"));
        System.out.println(dataContainer.add("Fou5645654646r"));
        System.out.println(dataContainer.add("Five"));
        System.out.println(Arrays.toString(dataContainer.getItems()));

    }
}
