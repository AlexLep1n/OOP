package view;

import java.util.Scanner;

import model.AttendanceService;

public class AttendanceView {
    AttendanceService attendanceService;

    public AttendanceView(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    public void getValue() {
        System.out.println("\nВыберите необходимое действие:\n");
        System.out.println("1 - Распечатать всех студентов и посещаемость каждого в процентах.");
        System.out.println("2 - Распечатать студентов, отсортировав их по убыванию посещаемости.");
        System.out.println("3 - Распечатать студентов с посещаемостью ниже 25%.\n");
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boolean flag = false;
        while (!flag) {
            switch (value) {
                case 1:
                    System.out.println("Список студентов с посещаемостью в процентах:\n");
                    attendanceService.setPercentTGroup();
                    break;
                case 2:
                    System.out.println("Список студентов отсортированный по убыванию:\n");
                    attendanceService.sort();
                    break;
                case 3:
                    System.out.println("Список студентов с посещаемостью ниже 25%:\n");
                    attendanceService.lessThan25Per();
                    break;
            }

            getValue();
        }
        scanner.close();
    }

}
