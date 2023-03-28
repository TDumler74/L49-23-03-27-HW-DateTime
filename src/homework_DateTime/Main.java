package homework_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
Получить и вывести на экран:
-текущую дату
-текущий год, месяц и день
Создать дату , например день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран текущее время
текущее время + 3 часа
Создать дату на неделю позже сегодняшней
Создать дату, которая была на год раньше сегодняшней используя метод minus
Создать дату на год позже сегодняшней используя plus метод
Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
*Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней и поздней датами

 */
public class Main {
    public static void main(String[] args) {
        //  Получить и вывести на экран:
        // -текущую дату
        System.out.println("Local date from 27.03.2023 is : " + LocalDate.now());//Local date from 27.03.2023 is : 2023-03-27

        // Получить и вывести на экран:
        // -текущий год, месяц и день
        System.out.println("Local time is " + LocalTime.now());//Local time is 15:50:02.045131500

        //Создать дату , например день рождения и вывести на экран
        LocalDate birthDay = LocalDate.of(1974, 10, 01);
        System.out.println("My birthday is on " + birthDay);//My birthday is on 1974-10-01


        //   Создать две даты и проверить на равенство
        LocalDate date = LocalDate.parse("2023-03-28");
        LocalDate date1 = LocalDate.of(2023, 03, 27);

        if (date1.equals(date)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        //Получить и вывести на экран текущее время
        System.out.println("The actual time is: " + LocalTime.now());
        //The actual time is: 16:10:25.185148500


        //  текущее время + 3 часа
        System.out.println("In three hours is : " + LocalTime.now().plusHours(3));
        //In three hours is : 19:10:25.185148500


        //   Создать дату на неделю позже сегодняшней
        System.out.println("today is " + LocalDate.now());
        System.out.println("and in one week is: " + LocalDate.now().plusWeeks(1));
        // today is 2023-03-27
        // and in one week is: 2023-04-03

        //Создать дату, которая была на год раньше сегодняшней используя метод minus
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate + " is actuale date " + "and " + LocalDate.now().minus(1,ChronoUnit.YEARS) + " is date from last year ");//
        //2023-03-27 is actuale date and 2022-03-27 is date from last year

        //Создать дату на год позже сегодняшней используя plus метод
        System.out.println("In one year we have " + LocalDate.now().plus(1,ChronoUnit.YEARS));
        //In one year we have 2024-03-27


        //Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
        LocalDate tomorrow = LocalDate.parse("2023-03-27").plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = LocalDate.of(2023, 03, 27).minusDays(1);

        System.out.println("tomorrow is " + tomorrow + ", yesterday was " + yesterday);
        //tomorrow is 2023-03-28, yesterday was 2023-03-26

        if (tomorrow.isAfter(localDate) && yesterday.isBefore(localDate)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // true


        //*Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий количество
        // дней между самой ранней и поздней датами
        List<LocalDate> localDates = new ArrayList<>();
        localDates.add(LocalDate.now());
        localDates.add(LocalDate.now().minusYears(1));
        localDates.add(LocalDate.now().minusDays(10));
        localDates.add(LocalDate.parse("2020-02-20"));
        localDates.add(LocalDate.of(2021, 12, 20));

        System.out.println(localDates);
        //[2023-03-27, 2022-03-27, 2023-03-17, 2020-02-20, 2022-12-20]

        Collections.sort(localDates);
        System.out.println(localDates);
        //[2020-02-20, 2021-12-20, 2022-03-27, 2023-03-17, 2023-03-27]

        LocalDate countDays = null;
        for (int i = 0; i < localDates.size(); i++) {


        }System.out.println(countDays);







    }




}
