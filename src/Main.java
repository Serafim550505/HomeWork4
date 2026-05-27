package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(" домашнее задание № 4 ");

        System.out.println(" Задача № 1  ");
        int year = 17;
        if (year >= 18) {
            System.out.printf("человеку 18 или больше лет");
        }
        if (year < 18) {
            System.out.printf("возраст совершеннолетия еще не наступил,нужно немного подождать  ");
        }


        System.out.printf("Задача №2 ");
        int temperature = 5;
        if (temperature < 5) {
            System.out.printf("На улице холодно, нужно надеть шапку");
        } else {
            System.out.printf("Сегодня тепло, можно идти без шапки");
        }


        System.out.printf(" Задача №3  ");

        int speed = 80;
        if (speed > 60) {
            System.out.printf("скорость превышена");
        } else {
            System.out.printf("превышения скорости нет");
        }


        System.out.printf("  Задача № 4 ");

        int age = 20;
        if (age > 2 && age <= 6) {
            System.out.printf("нужно ходить в детский сад  ");
        } else if (age >= 7 && age <= 17) {
            System.out.printf(" нужно ходить в школу ");
        } else if (age >= 18 && age <= 24) {
            System.out.printf(" Нужно ходить в университет ");
        }
        else  {
            System.out.printf(" Надо ходить на работу ");
        }


        System.out.printf(" Задача №5 ");
        if (age <= 5) {
            System.out.printf(" Нельзя кататься на аттракционе  ");
        }
        else if (age > 5 && age <= 14) {
            System.out.printf(" можно  кататься только в сопровождении взрослого  ");
        }
        else  {
            System.out.printf("  можно кататься без сопровождения взрослого  ");
        }


        System.out.println(" задача №6 ");
        int Capacity = 100;
        if (Capacity < 60) {
            System.out.printf(" В вагоне есть сидячие места ");
        } else if (Capacity > 102) {
            System.out.printf(" В вагоне мест нет ");
        } else {
            System.out.printf(" В вагоне есть стоячие места ");
        }

        System.out.printf(" Задача № 7 ");
        int one = 9665;
        int two = 8068;
        int three = 7885;
        if (one >= two && one >= three) {
            System.out.printf(" Самое большое число  " + one);
        } else if (two >= one && two >= three) {
            System.out.printf(" Самое большое число  " + two);
        } else {
            System.out.printf(" Самое большое число " + three);
        }


    }
}

