package com.teachmeskills.lesson12.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задача *:
 * Программа на вход получает произвольный текст. В этом тексте может быть номер
 * документа(один или несколько), емейл и номер телефона. Номер документа в формате:
 * xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
 * может содержать не всю информацию, т.е. например, может не содержать номер
 * телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
 * формате
 * email: teachmeskills@gmail.com
 * document number: 1423-1512-51
 * и т.д
 */

public class Runner {

    public static String TELEPHONE_NUMBER = "(\\+\\([0-9]{2}\\)[0-9]{7})";
    public static String DOCUMENT_NUMBER = "[0-9]{4}[-]{1}[0-9]{4}[-]{1}[0-9]{2}";
    public static String EMAIL = "([0-9a-zA-Z\\.]{6,30}@[a-z]{2,7}\\.[a-z]{2,3})";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String information = scanner.nextLine();

        Pattern pattern = Pattern.compile(TELEPHONE_NUMBER);
        Matcher matcher = pattern.matcher(information);

        if (matcher.find()) {
            System.out.println("Telephone number: " + matcher.group());
        } else {
            System.out.println("Invalid input telephone number");
        }

        pattern = Pattern.compile(DOCUMENT_NUMBER);
        matcher = pattern.matcher(information);

        if (matcher.find()) {
            System.out.println("Document number: " + matcher.group());
        } else {
            System.out.println("Invalid input document number");
        }

        pattern = Pattern.compile(EMAIL);
        matcher = pattern.matcher(information);

        if (matcher.find()) {
            System.out.println("Email: " + matcher.group());
        } else {
            System.out.println("Invalid input email");
        }

    }

}
