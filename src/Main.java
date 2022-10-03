import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



        System.out.println("_____________________________________________________________");
        System.out.println("Введите год сборки телефона");
        Scanner y =new Scanner (System.in);
        int clientDeviceYear = y.nextInt();

        System.out.println("Выберете операционную систему 1- IOS, 2 - Android");
        Scanner in =new Scanner (System.in);
        int os = in.nextInt();
        if (os==1)
        {
            if (clientDeviceYear >=2015)
                System.out.println("Ваше устройство IOS будет работать корректно");
            else System.out.println("Рекомендуем установить на IOS облегченную версию приложения.");
        }
else if(os==2)
        {
            if (clientDeviceYear <2015)
                System.out.println("Ваше устройство Android мозможно будет работать некоректно");
            else System.out.println("Рекомендуем установить облегченную версию приложения.");
        }


        System.out.println("_____________________________________________________________");
        System.out.println("Введите год для определения высокосный он или нет");
        Scanner lp =new Scanner (System.in);
        int leapYears = lp.nextInt();

        // float definitionsYears=leapYears%4;

        System.out.println(leapYears);
        if (leapYears%4==0 || leapYears%100==0 || leapYears%400==0)
            System.out.println("Високосный");
        else System.out.println("Не Високосный");

        System.out.println("_____________________________________________________________");
        System.out.println("Введите расстояние до места ");
        Scanner dis =new Scanner (System.in);
        int deliveryDistance = dis.nextInt();

if (deliveryDistance<=20)
    System.out.println("Доставка занимает сутки");
else if (deliveryDistance<=60)
    System.out.println("Доставка занимает двое суток");
else if (deliveryDistance<=100)
    System.out.println("Доставка занимает трое суток");

        System.out.println("_____________________________________________________________");
        System.out.println("Введите нужный Вам номер месяца ");
        Scanner month =new Scanner (System.in);
        int monthNumber = month.nextInt();

        switch (monthNumber)
        {
            case 1:
                System.out.println("Зимний месяц");
                break;
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
                System.out.println("Весенний месяц");
                break;

            case 4:
                System.out.println("Весенний месяц");
                break;
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
                System.out.println("Летний месяц");
                break;
            case 7:
                System.out.println("Летний месяц");
                break;
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
                System.out.println("Осенний месяц");
                break;
            case 10:
                System.out.println("Осенний месяц");
                break;
            case 11:
                System.out.println("Осенний месяц");
                break;
            case 12:
                System.out.println("Зимний месяц");
                break;

        }

    }
}