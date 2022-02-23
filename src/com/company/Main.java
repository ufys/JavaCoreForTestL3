package com.company;

public class Main {
    
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();


        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2);


        //сравнение коробок по весу
        System.out.println("Сравнение коробок по весу");
        System.out.println("Вес коробки 1: ");
        System.out.println(box1.getWeight());

        System.out.println("Вес коробки 2: ");
        System.out.println(box2.getWeight());

        System.out.println("Массы коробок равны: ");
        System.out.println(box1.compare(box2));


        //добавить фрукты
        System.out.println("Добавить фрукты - ");
        System.out.println("Вес коробки до добавления фруктов ");
        System.out.println(box1.getWeight());
        System.out.println("Добавляем фрукт/ы в коробку... ");

        box1.addFruit(new Apple());

        System.out.println("Вес коробки : ");
        System.out.println(box1.getWeight());


        //перемещение из 1 коробки в другую
        System.out.println("Перемещение из 1 коробки в другую - ");
        System.out.println("Вес коробки 2: ");
        System.out.println(box2.getWeight());
        System.out.println("Вес коробки 3: ");
        Box<Orange> box3 = new Box<Orange>();
        System.out.println(box3.getWeight());

        System.out.println("Перемещение...");
        box2.transfer(box3);

        System.out.println("Вес коробки 2: ");
        System.out.println(box2.getWeight());
        System.out.println("Вес коробки 3: ");
        System.out.println(box3.getWeight());

    }
}