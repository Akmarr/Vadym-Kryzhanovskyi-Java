package vkryz.com;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    sayName();
    }

    public static void sayName() {
        System.out.println("Введите имя");
        Scanner sc = new Scanner(System.in);
        String name = "Привет, Вячеслав";
        String inputName;
        while (sc.hasNext()) {
            inputName = sc.next();
            if (inputName.equals("Вячеслав")) {
                System.out.println(name);
            }else {
                System.out.println("Нет такого имени");
            }
        }
    }
}
