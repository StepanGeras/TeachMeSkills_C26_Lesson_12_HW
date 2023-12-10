package com.teachmeskills.lesson12.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задача 1:
 * Вывести в консоль из строки которую пользователь вводит с клавиатуры все
 * аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
 * только из прописных букв, без чисел
 */

public class Runner {

    public static String NEW_STR = "[a-z]{2,6}";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");

        String str = scanner.nextLine();

        String[] strings = str.split(" ");

        Pattern pattern = Pattern.compile(NEW_STR);

        for (String string: strings) {
            Matcher matcher = pattern.matcher(string);
            if (matcher.find()){
                System.out.println("I found " + matcher.group());
            }
        }

    }

}

