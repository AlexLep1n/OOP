package com.oop_hw;

import java.util.ArrayList;
import java.util.List;

// 1. Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.

// 2. Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и реализуйте перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт, соответствующий имени, объему и температуре.

// 3. В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.

public class App {
    public static void main(String[] args) {
        HotDrink hotDrink1 = new HotDrink("Coffe", 1, 50, 1, 90, 0.5);
        HotDrink hotDrink2 = new HotDrink("Latte", 1, 65, 2, 90, 0.45);
        HotDrink hotDrink3 = new HotDrink("Capuchino", 1, 40, 3, 90, 0.4);

        List<HotDrink> hotDrinks = new ArrayList<>();
        hotDrinks.add(hotDrink1);
        hotDrinks.add(hotDrink2);
        hotDrinks.add(hotDrink3);

        HotDrinksVMachine hotDrinksVMachine = new HotDrinksVMachine(hotDrinks);
        System.out.println(hotDrinksVMachine); // все имеющиеся напитки в автомате горячих напитков

        // покупатель получает выбранный напиток
        System.out.println("Ваш напиток: " + hotDrinksVMachine.getProduct(1, 0.5, 90));
    }
}
