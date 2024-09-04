import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Задача 1: Четное или нечетное число
        Условие:
        Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int input = scanner.nextInt();

        if (input%2 == 0)
        {
            System.out.println("Число четное");
        }
        else
        {
            System.out.println("Число нечетное");
        }


        /*Задача 2: Минимальное из трех чисел
        Условие:
        Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.*/
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        if(a < b && a < c)
        {
            System.out.print(a);
        }
        else if(b < c && b < c)
        {
            System.out.print(b);
        }
        else
        {
            System.out.print(c);
        }


        /*Задача 3: Таблица умножения
        Условие:
        Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).*/
        int count = 5;
        for (int i = 1; i <= 10; i++)
        {
            int result = i * count;
            System.out.println(count + " * " + i + " = " + result);
        }


        /*Задача 4: Сумма чисел от 1 до N
        Условие:
        Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.*/
        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++)
        {
            result += i;
        }
        System.out.println(result);


        /*Задача 5: Число Фибоначчи
        Условие:
        Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.*/
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++)
        {
            System.out.print(first + ", ");
            int prom =  second + first;
            first = second;
            second = prom;
        }


        /*Задача 6: Проверка простого числа
        Условие:
        Пользователь вводит целое число. Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).*/
        System.out.print("Введите целое число: ");
        int a = scanner.nextInt();
        if (a <= 1)
        {
            System.out.println("Число не является простым");
        }
        else
        {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(a); i++)
            {
                if (a % i == 0)
                {
                    check = false;
                    break;
                }
            }

            if (check)
            {
                System.out.println("Число простое");
            }
            else
            {
                System.out.println("Число не является простым");
            }
        }


        /*Задача 7: Обратный порядок чисел
        Условие:
        Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.*/
        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();
        for (int i = n; i >= 1; i--)
        {
            System.out.print(i);
            if (i > 1)
            {
                System.out.print(", ");
            }
        }


        /*Задача 8: Сумма четных чисел
        Условие:
        Пользователь вводит два целых числа A и B. Программа должна найти сумму всех четных чисел в диапазоне от A до B (включительно).*/
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++)
        {
            if (i % 2 == 0)
            {
                sum += i;
            }
        }
        System.out.println(sum);


        /*Задача 9: Реверс строки
        Условие:
        Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.*/
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        StringBuilder reversed = new StringBuilder(string);
        reversed.reverse();
        System.out.println(reversed);


        /*Задача 10: Количество цифр в числе
        Условие:
        Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.*/
        System.out.print("Введите целое число: ");
        String a = scanner.nextLine();
        System.out.println(a.length());


        /*Задача 11: Факториал числа
        Условие:
        Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).*/
        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= i;
        }
        System.out.print(result);


        /*Задача 12: Сумма цифр числа
        Условие:
        Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.*/
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0)
        {
            sum += num % 10;
            num /= 10;
        }
        System.out.print(sum);


        /*Задача 13: Палиндром
        Условие:
        Пользователь вводит строку. Программа должна проверить, является ли эта строка палиндромом (читается одинаково слева направо и справа налево).*/
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        StringBuilder reversed = new StringBuilder(string);
        reversed.reverse();
        String reversedString = reversed.toString();
        if(reversedString.equals(string))
        {
            System.out.print("Строка является палиндромом");
        }
        else
        {
            System.out.print("Строка не является палиндромом");
        }


        /*Задача 14: Найти максимальное число в массиве
        Условие:
        Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести максимальное число в массиве.*/
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size-1; i++)
        {
            System.out.print("Введите элемент массива: ");
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(max);


        /*Задача 15: Сумма всех элементов массива
        Условие:
        Пользователь вводит размер массива и его элементы. Программа должна вычислить и вывести сумму всех элементов массива.*/
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size-1; i++)
        {
            System.out.print("Введите элемент массива: ");
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.print(sum);


        /*Задача 16: Количество положительных и отрицательных чисел
        Условие:
        Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.*/
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size-1; i++)
        {
            System.out.print("Введите элемент массива: ");
            arr[i] = scanner.nextInt();
        }
        int countPlus = 0;
        int countMinus = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 0)
            {
                countPlus++;
            }
            else if (arr[i] < 0)
            {
                countMinus++;
            }
        }
        System.out.println("Положительных чисел " + countPlus);
        System.out.println("Отрицательных чисел " + countMinus);


        /*Задача 17: Простые числа в диапазоне
        Условие:
        Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне (включительно).*/
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        boolean isFirst = true;

        for (int i = a; i <= b; i++)
        {
            if (i <= 1)
            {
                continue;
            }
            if (i == 2)
            {
                if (!isFirst)
                {
                    System.out.print(", ");
                }
                System.out.print(i);
                isFirst = false;
                continue;
            }
            if (i % 2 == 0)
            {
                continue;
            }

            boolean isPrime = true;
            for (int j = 3; j <= Math.sqrt(i); j += 2)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
            {
                if (!isFirst)
                {
                    System.out.print(", ");
                }
                System.out.print(i);
                isFirst = false;
            }
        }


        /*Задача 18: Подсчет гласных и согласных в строке
        Условие:
        Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.*/
        List<Character> list = Arrays.asList('а', 'о', 'у', 'ы', 'э', 'е', 'ё', 'и', 'ю', 'я');
        System.out.print("Введите строку: ");
        String input = scanner.nextLine().toLowerCase(); // Преобразуем строку в нижний регистр для удобства
        int countGlas = 0;
        int countSoglas = 0;
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (list.contains(ch))
                countGlas++;
            else
                countSoglas++;
        }
        System.out.println("Гласных букв в строке " + countGlas);
        System.out.print("Согласных букв в строке " + countSoglas);


        /*Задача 19: Перестановка слов в строке
        Условие:
        Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести слова в обратном порядке.*/
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        List<String> words = Arrays.asList(input.split("\\s+"));
        Collections.reverse(words);
        String result = words.stream().collect(Collectors.joining(" "));
        System.out.println("Переставленные слова: " + result);


        /*Задача 20: Число Армстронга
        Условие:
        Пользователь вводит целое число. Программа должна проверить, является ли это число числом Армстронга (сумма цифр в степени, равной количеству цифр, равна самому числу).*/
        System.out.print("Введите целое число: ");
        int a = scanner.nextInt();
        int a2 = a;
        String str = Integer.toString(a);
        int len = str.length();
        int sum = 0;
        while (a2 > 0)
        {
            int digit = a2 % 10;
            sum += Math.pow(digit, len) ;
            a2 /= 10;
        }
        if (sum == a)
        {
            System.out.print("Число является числом Армстронга");
        }
        else
        {
            System.out.print("Число не является числом Армстронга");
        }

    }
}
