package HomeWork.homeWork6;

import HomeWork.homeWork6.NBRB.NBRBLoader;
import HomeWork.homeWork6.NBRB.SiteLoader;
import HomeWork.homeWork6.alfaBank.AlfaBankLoader;
import HomeWork.homeWork6.alfaBank.SiteLoaderForAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigBossMain {
    public static void main(String[] args) throws IOException {
        NBRBLoader nb = new NBRBLoader();
        AlfaBankLoader al = new AlfaBankLoader();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double course;

        System.out.print("Enter the rates of which bank: ");
        String bankName = reader.readLine();

        System.out.print("Enter USD, EUR or RUB: ");
        String currency = reader.readLine();

        /**
         *  дату в альфа банка не смог взять причины: 1) не смог найти ответ по API сайта
         *                                         2) времени не хватило попробовать другие банка кроме Беларусь банка
         */
        System.out.print("Укажите дату в формате(2020-7-15 -> year-month-day): ");
        String date = reader.readLine();

        System.out.print("Чтобы записать результат в файл, укажите путь(нажмите enter, чтобы записать в корневую папку)... : ");
        String path = reader.readLine();

        System.out.println("Loading...");

        switch (bankName) {
            case "национальный банк" -> {
                course = nb.load(SiteLoader.Currency.valueOf(currency), date);
                nb.NBRBFileWriter(path, course, currency, nb.changeDate(date));
            }
            case "альфа банк" -> {
                course = al.load(SiteLoaderForAB.Currency.valueOf(currency), al.changeDate(date));
                al.AlfaBankFileWriter(date, path, course, currency);
            }
        }



        reader.close();
    }
}
