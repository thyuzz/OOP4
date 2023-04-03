package org.example;

/*
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature)
 *      выдающий продукт соответствующий имени, объему и температуре
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        VedMach venMach = new VedMach<TemperatureHotDrink>();
        List<TemperatureHotDrink> products = new ArrayList<>(Arrays.asList(new TemperatureHotDrink("Coffee", 120, 70),
                new TemperatureHotDrink("Tea", 200, 70)));
        venMach.setVendingMachine(products);
        venMach.addProduct(new TemperatureHotDrink("Water", 500, 22));
        venMach.addProduct(new TemperatureHotDrink("Coffee", 200, 70));
        venMach.addProduct(new TemperatureHotDrink("Tea", 150, 70));

        System.out.println(venMach.getAllProducts().toString());




    }
}