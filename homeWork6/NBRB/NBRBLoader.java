package HomeWork.homeWork6.NBRB;

import java.io.*;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @param date дата
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName, String date) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId() + "?ondate=" + date,
                currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        String text = "";
        text = content.substring(content.indexOf("Cur_OfficialRate"));
        text = text.substring(text.indexOf(":"), text.indexOf("}"));
        text = currencyName + ": " + text.substring(1);
        return Double.parseDouble(text.substring(text.indexOf(" ")));
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
    public void NBRBFileWriter(String path, double course, String currency, String date){
        File file = new File(path);

        try {
            FileWriter writer;
            if(file.exists()){
                writer = new FileWriter(file, true);
            } else {
                writer = new FileWriter("NBRBCourse.txt", true);
            }
            writer.write(date + " -> " + currency + ": " + course + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

