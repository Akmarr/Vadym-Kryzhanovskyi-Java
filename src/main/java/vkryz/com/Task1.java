package vkryz.com;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
         sayHello();
    }

    public static void sayHello() {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        String say = "Привет";
        int imputNumber;
        while (sc.hasNextInt()) {
            imputNumber = sc.nextInt();
            if (imputNumber >= 7) {
                System.out.println(say);
            }
        }


    }


}
