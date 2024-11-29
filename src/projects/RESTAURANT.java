package projects;

import java.util.Scanner;

public class RESTAURANT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, price = 0;

        do {
            System.out.println("Welcome to the Restraurent");
            System.out.println("1 - South Indian\n2 - Chinese\n3 - Italian\n4 - Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("1 - Dosa\n2 - Fried Idli\n3 - Appe");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> {
                            System.out.println("You have ordered Dosa");
                            price += 70;
                        }
                        case 2 -> {
                            System.out.println("You have ordered Fried Idli");
                            price += 80;
                        }
                        case 3 -> {
                            System.out.println("You have ordered Appe");
                            price += 80;
                        }
                    }
                }

                case 2 -> {
                    System.out.println("1 - Veg Manchurian\n2 - Spring Rolls\n 3 - Chowmine");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> {
                            System.out.println("You have ordered Veg Manchurian");
                            price += 90;
                        }
                        case 2 -> {
                            System.out.println("You have ordered Spring Rolls");
                            price += 120;
                        }
                        case 3 -> {
                            System.out.println("You have ordered Chowmine");
                            price += 80;
                        }
                    }
                }

                case 3 -> {
                    System.out.println("1 - Pizza \n2 - Pasta\n 3 - Arancini");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> {
                            System.out.println("You have ordered Pizza");
                            price += 220;
                        }
                        case 2 -> {
                            System.out.println("You have ordered Spring Pasta");
                            price += 150;
                        }
                        case 3 -> {
                            System.out.println("You have ordered Arancini");
                            price += 240;
                        }
                    }
                }

                case 4 -> {
                    System.exit(0);
                }
            }
            System.out.println("Price = " + price);
        } while (true);
    }
}
