package com.java.classwork.les9;

import com.java.common.ConsoleUtils;

import javax.print.DocFlavor;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int counter;
        int num;
        int item;
        int[] array;
        int first;
        int last;
        int min = 1;
        int max = 10000;

        //считывание чисел, введенных пользователем

        System.out.println("Введите количество элементов массива: ");
        num = ConsoleUtils.getNumber();

        // Создаем массив введенного пользователем размера
        array = new int[num];

        System.out.println("Введите " + num + " чисел");

        //Заполняем массив, вводя элементы в консоль
        ConsoleUtils.generateNumbersArray(array,min,max);

        // сортируем элементы массива, так как для бинарного поиска
        // элементы массива должны быть отсортированными
        Arrays.sort(array);

        System.out.println("Введите элемент для бинарного поиска: ");
        item = ConsoleUtils.getNumber();
        first = 0;
        last = num - 1;

        // метод принимает начальный и последний индекс, а также число для поиска
        binarySearch(array, first, last, item);
    }

    // бинарный поиск
    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;    // для подсчета количества сравнений

        // для начала найдем индекс среднего элемента массива
        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                    " сравнений");
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + comparisonCount + " сравнений");
        }
    }

}
