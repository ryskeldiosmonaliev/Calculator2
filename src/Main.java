
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(" араб [2+2] же  римский  [V+V] цифраларын жазгыла");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int result = 0;
        String[] numbers;
        try {
            numbers = str.split("[+-/*]");
            int c = Integer.parseInt(numbers[0]);
            int d = Integer.parseInt(numbers[1]);
            if (0<=c) {
                if (c<=10){
                    if (d>=0) {
                        if (d <=10){
                            if (str.indexOf('+') > 0) {
                                result = c + d;
                                System.out.println(result);
                            } else if (str.indexOf('-') > 0) {
                                result = c - d;
                                System.out.println(result);
                            } else if (str.indexOf('/') > 0) {
                                if (c < d) {
                                    System.out.println("калкулятор бутун сандар менен иштейт");
                                } else {
                                    result = c / d;
                                }
                                System.out.println(result);
                            } else if (str.indexOf('*') > 0) {
                                result = c * d;
                                System.out.println(result);
                            } else if (true) {
                                System.out.println("андай чечимдер жараксыз");
                            }
                    }}} } else {

            }System.out.println("калкулятор 1 ден 10 го чейин иштейт");
        } catch (NumberFormatException e) {

            numbers = str.split("[+-/*]");
            String stable00 = numbers[0];
            String stable01 = numbers[1];
            int a = romanToNumber(stable00);
            int b = romanToNumber(stable01);
            if (a == -1) {
                throw new Exception();
            }
            if (b == -1) {
                throw new Exception();
            }
            if (str.indexOf('+') > 0) {
                numbers = str.split("[+]");
                result = a + b;
                System.out.println(Roman.toRoman(result));
            } else if (str.indexOf('-') > 0) {
                numbers = str.split("[-]");
                if (a < b) {
                    result = b - a;
                    System.out.println("-" + Roman.toRoman(result));
                } else {
                    result = a - b;
                    System.out.println(Roman.toRoman(result));
                }
            } else if (str.indexOf('/') > 0) {
                numbers = str.split("[/]");
                if (a < b) {
                    System.out.println("Калькулятор бүтүн сандар менен гана иштей алат.");
                } else {
                    result = a / b;
                    System.out.println(Roman.toRoman(result));
                }
            } else if (str.indexOf('*') > 0) {
                numbers = str.split("[*]");
                result = a * b;
                System.out.println(Roman.toRoman(result));
            }
        }
    }


    private static int romanToNumber(String numbers) {
        try {
            if (numbers.equals("I")) {
                return 1;
            } else if (numbers.equals("II")) {
                return 2;
            } else if (numbers.equals("III")) {
                return 3;
            } else if (numbers.equals("IV")) {
                return 4;
            } else if (numbers.equals("V")) {
                return 5;
            } else if (numbers.equals("VI")) {
                return 6;
            } else if (numbers.equals("VII")) {
                return 7;
            } else if (numbers.equals("VIII")) {
                return 8;
            } else if (numbers.equals("IX")) {
                return 9;
            } else if (numbers.equals("X")) {
                return 10;
            }

        } catch (Exception e) {
            System.out.println('A');
        }
        return -1;
    }
}
