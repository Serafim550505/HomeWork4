package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(" домашнее задание № 4 \n");

        System.out.println(" Задача № 1 ");
        int year = 17;
        if (year >= 18) {
            System.out.println("человеку 18 или больше лет\n");
        } else {
            System.out.println("возраст совершеннолетия еще не наступил,нужно немного подождать \n ");
        }


        System.out.println("Задача №2 ");
        int temperature = 15;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку\n");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки\n");
        }


        System.out.println(" Задача №3  ");

        int speed = 80;
        if (speed > 60) {
            System.out.println("скорость превышена\n");
        } else {
            System.out.println("превышения скорости нет  \n");

        }


        System.out.println("  Задача № 4 ");

        int age = 21;
        if (age < 2) {
            System.out.println(" Никуда не нужно\n");
        } else if (age > 2 && age <= 6) {
            System.out.println("нужно ходить в детский сад\n  ");
        } else if (age >= 7 && age <= 17) {
            System.out.println(" нужно ходить в школу \n");
        } else if (age >= 18 && age <= 24) {
            System.out.println(" Нужно ходить в университет \n");
        } else {
            System.out.println(" Надо ходить на работу\n ");
        }


        System.out.println(" Задача №5 ");
        if (age <= 5) {

            System.out.println(" Нельзя кататься на аттракционе  \n");
        } else if (age > 5 && age <= 14) {
            System.out.println(" можно  кататься только в сопровождении взрослого \n ");
        } else {
            System.out.println("  можно кататься без сопровождения взрослого \n ");
        }


        System.out.println(" задача №6 ");
        int capacity = 102;
        if (capacity <= 60) {
            System.out.println(" В вагоне есть сидячие места \n");
        } else if (capacity > 60 && capacity <= 102) {
            System.out.println(" В вагоне есть стоячие места \n");
        } else {
            System.out.println(" В вагоне мест нет \n");
        }

        System.out.println(" Задача № 7  ");
        int one = 9665;
        int two = 8068;
        int three = 7885;
        if (one >= two && one >= three) {
            System.out.println(" Самое большое число \n " + one);
        } else if (two >= one && two >= three) {
            System.out.println(" Самое большое число \n " + two);
        } else {
            System.out.println(" Самое большое число \n" + three);
        }


    }
}

