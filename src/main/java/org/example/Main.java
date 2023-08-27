package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        logger.log("Запускаем программу ");
        logger.log("Просим пользователя ввести входные данные для списка ");
        System.out.println("Введите размер списка: ");
        int sizeOfList = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите верхнюю границу для значений: ");
        int maxValue = Integer.parseInt(scanner.nextLine());
        logger.log("Создаём и наполняем список ");
        System.out.println("Вот случайный список: ");


        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < sizeOfList; i++) {
            inputList.add(random.nextInt(maxValue));
        }
        for (Integer integer : inputList) {
            System.out.print(integer + " ");
        }

        logger.log("Просим пользователя ввести входные данные для фильтрации ");
        System.out.println("Введите порог для фильтра:");

        int thrashold = Integer.parseInt(scanner.nextLine());
        Filter filter = new Filter(thrashold);

        logger.log("Запускаем фильтрацию");
        List<Integer> filteredList = filter.filterOut(inputList);

    }
}