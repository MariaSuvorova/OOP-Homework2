/*
1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного 
количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). 
Если коту удалось покушать (хватило еды), сытость = true. Считаем, что если коту 
мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину 
сыт (это сделано для упрощения логики программы).
3. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой 
тарелки и потом вывести информацию о сытости котов в консоль.
4. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в 
тарелку. */

//package Homework2;

import java.util.ArrayList;
import java.util.List;

import Homework2.Plate;
import Homework2.cat;


public class MainClass {
    public static void main(String[] args) {
        Plate plate = new Plate(50);
        plate.info();
        List<cat> cats = new ArrayList<>();
            cat cat1 = new cat("Barsik", 20);
            cats.add(cat1);
            cat cat2 = new cat("Persik", 15);
            cats.add(cat2);
            cats.add(new cat("Tima", 25));
            cats.add(new cat("Kuzya", 10));
            cats.add(new cat("Lina", 15));

            for (cat hungryCat : cats) {
                System.out.print("Кот " + hungryCat.getName());
                if (plate.getFood() >= hungryCat.getAppetite()){
                    hungryCat.eat(plate.getFood());
                    plate.setFood(plate.getFood() - hungryCat.getAppetite());
                }
                if (hungryCat.isHappiness()) System.out.println(" наелся");
                else System.out.println(" остался голодным");
                System.out.print("осталось ");
                plate.info();
            }
            plate.addFood(50);
            System.out.println("после добавления на тарелеке стало " + plate.getFood());
    }
}

