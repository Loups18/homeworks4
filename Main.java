public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
       int clientOS = 1;
    int iOS = 0;
    int android = 1;
    int clientDeviceYear = 2004;
    if (clientOS == 1){
        System.out.println("Установите версию приложения для Android по ссылке");
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");}
        if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if (clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }
        int ears = 2024;
        if (ears % 4 == 0 && ears % 100 != 0 || ears % 400 == 0) {
            System.out.println( ears + " год является високосным");}
        else  {
            System.out.println( ears + " год не является високосным");
        }
        int deliveryDistance = 95;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней 1");}
        else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней 2");}
        else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней 3");}
        else if (deliveryDistance > 100) {
            System.out.println(" доставки нет");
        }
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }



    }
}