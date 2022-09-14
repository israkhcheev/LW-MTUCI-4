package ru.mtuci.rakhcheev.first;

import java.util.Arrays;
import java.util.Scanner;

public class FirstTask {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        FirstTask task = new FirstTask();

        System.out.println("Первое задание ==");
        task.first();
        System.out.println("\nВторое задание ==");
        task.second();
        System.out.println("\nТретье задание ==");
        task.third();
        System.out.println("\nЧетвёртое задание ==");
        task.fourth();
        System.out.println("\nПятое задание ==");
        task.fifth();
        System.out.println("\nШестое задание ==");
        task.sixth();
        System.out.println("\nСедьмое задание ==");
        task.seventh();
        System.out.println("\nВосьмое задание ==");
        task.eighth();
        System.out.println("\nДевятое задание ==");
        task.ninth();
        System.out.println("\nДесятое задание ==");
        task.tenth();

    }

    private void first() {
        // Чтобы в дальнейшем не переводить число в строку для получения её длинны, получим сразу строку.
        String s_number = SCANNER.nextLine().trim();
        long number;

        number = Long.parseLong(s_number);
        System.out.println(String.valueOf(number).charAt(s_number.length() - 1));
    }

    private void second() {
        String s_number = SCANNER.nextLine().trim();
        int result;

        result = 0;
        for (String c : s_number.split("")) result += Short.parseShort(c);

        System.out.println(result);
    }

    private void third() {
        // Про nextInt знаю, но вместе с nextLine работает он криво
        int number = Integer.parseInt(SCANNER.nextLine());

        if (number > 0) number++;
        System.out.println(number);
    }

    private void fourth() {
        int number = Integer.parseInt(SCANNER.nextLine());

        if (number > 0) number++;
        else if (number < 0) number -= 2;
        else number = 10;
        System.out.println(number);
    }

    private void fifth() {
        int[] intArray = {
                Integer.parseInt(SCANNER.nextLine()),
                Integer.parseInt(SCANNER.nextLine()),
                Integer.parseInt(SCANNER.nextLine())
        };
        System.out.println(Arrays.stream(intArray).min().getAsInt());
    }

    private void sixth() {
        int number = Integer.parseInt(SCANNER.nextLine());
        if (number == 0) {
            System.out.println("Нулевое число.");
            return;
        }
        System.out.println((number > 0 ? "Положительное " : "Отрицательное ") +
                (number % 2 == 0 ? "чётное " : "нечётное ") +
                "число."
        );
    }

    private void seventh() {
        String code = SCANNER.nextLine();
        switch (code) {
            case "905" -> System.out.println("Москва. Стоимость разговора 41.5 рублей");
            case "194" -> System.out.println("Ростов. Стоимость разговора 19.8 рублей");
            case "491" -> System.out.println("Краснодар. Стоимость разговора 26.9 рублей");
            case "800" -> System.out.println("Краснодар. Стоимость разговора 50.0 рублей");
            default -> System.out.println("Код города не найден");
        }
    }

    private void eighth() {
        int[] intArray = {1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
        int[] avg = Arrays.stream(intArray).filter(x -> x > 0).toArray();
        System.out.println("Максимальное значение - " + Arrays.stream(intArray).max().getAsInt() +
                "\nСумма положительных чисел " + Arrays.stream(intArray).filter(x -> x > 0).sum() +
                "\nСумма чётных отрицательных чисел " + Arrays.stream(intArray).filter(x -> x < 0 && x % 2 == 0).sum() +
                "\nКоличество положительных элементов" + Arrays.stream(intArray).filter(x -> x > 0).count() +
                "\nСреднее арифметическое отрицательных элементов" + Arrays.stream(avg).sum() / avg.length
        );
    }

    private void ninth() {
        int[] intArray = {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};

        for (int i = 0; i < intArray.length / 2; i++) {
            int cache = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = cache;
        }
        System.out.println(Arrays.toString(intArray));
    }

    private void tenth() {
        int[] intArray = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        int[] resultArray = new int[intArray.length];
        int count = 0;
        int index = 0;
        for(int n : intArray) {
            if(n == 0) count++;
            else {
                resultArray[index] = n;
                index++;
            }
        }
        for(int i = 0; i < count; i++) {
            resultArray[index] = 0;
            index++;
        }
        System.out.println(Arrays.toString(resultArray));
    }


}
