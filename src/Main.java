

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int clientIos = 0;
        if (clientIos == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
    }

    public static void task2() {
        int clientIOs = 0;
        int clientYear = 2021;
        if (clientIOs == 0) {
            if (clientYear < 2015) {

                System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
            } else {
                System.out.println("Установите  версию приложения для IOS по ссылке ");
            }
        } else {

            if (clientYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке ");

            } else {
                System.out.println("Установите версию приложения для Android по ссылке ");
            }
        }
    }


    public static void task3() {
        // задача 3

        int year = 2019;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }


    public static void task4() {

        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++; }

        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println(deliveryDistance + "Потребуется дней");

    }


    public static void task5() {

        int monthNumber = 12;
        switch (monthNumber)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println(" Error");


        }}}