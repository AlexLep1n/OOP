package view;

import java.util.Scanner;

import model.AttendanceService;

public class AttendanceView {
    AttendanceService model;

    public AttendanceView(AttendanceService model) {
        this.model = model;
    }

    public void print() {
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
                    System.out.println("\nСписок студентов с посещаемостью в процентах:\n");
                    model.setPercentTGroup();
                    break;
                case 2:
                    System.out.println("\nСписок студентов отсортированный по убыванию:\n");
                    model.sort();
                    break;
                case 3:
                    System.out.println("\nСписок студентов с посещаемостью ниже 25%:\n");
                    model.lessThan25Per();
                    break;
            }
            print();
        }
        scanner.close();
    }

}
