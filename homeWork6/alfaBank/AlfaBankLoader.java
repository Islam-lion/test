package HomeWork.homeWork6.alfaBank;

import HomeWork.homeWork6.NBRB.SiteLoader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Загрузчик курса с сайта Альфа Банка
 */
public class AlfaBankLoader extends SiteLoaderForAB {

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoaderForAB.Currency currencyName, String date) {
        return load("https://developerhub.alfabank.by:8273/partner/1.0.1/public/rates/" + date, currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoaderForAB.Currency currencyName) {
        String text = "";
        Pattern pattern = Pattern.compile(currencyName.toString() + "\",\"sellCode\":\\d{3},\"buyRate\":\\d\\.\\d+,");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            text =matcher.group();
        }
        text = text.replaceAll("Rate\":", ";");
        text = text.substring(text.indexOf(";")).substring(1, text.indexOf(","));
        return Double.parseDouble(text);
    }

    /**
     *  Метод меняет формат записи даты
     * @param date  дата
     * @return  новый формат даты
     */
    public String changeDate(String date){
        date = date.replaceAll("([.\\-])","/").replaceFirst("/",".");
        String year = date.substring(0,4);
        String month = date.substring(date.indexOf("."), date.indexOf("/"));
        String day = date.substring(date.indexOf("/"));
        date = day.substring(1) + "." + month.substring(1) + "." + year;
        return date;
    }

    /**
     *  Метод записывает полученный course в файл указанный в
     *  параметре path (путь к файлу). Иначе, если нет указанного файла
     *  запись производится в корневую папку приложения
     * @param path      Путь к файлу
     * @param course    курс который нам нужно записать
     * @param currency наиминование курса
     * @param date дата
     */
    public void AlfaBankFileWriter(String date, String path, double course, String currency){
        File file = new File(path);
        try {
            FileWriter writer;
            if(file.exists()){
                writer = new FileWriter(path,true);
            } else {
                writer = new FileWriter("AlfaBankCourse.txt", true);
            }
            writer.write(date + " -> "+ currency + ": " + course + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

