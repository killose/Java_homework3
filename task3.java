import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

public class task3 {
    public static void main(String[] args) {
        ArrayList randomArray = getArray(10);
        System.out.println("Рандомно созданный список: " + randomArray);

        ArrayList arrayNotAverage = deleteEvenNumbers(randomArray);
        System.out.println("Итоговый список после удаления чётных значений: " + arrayNotAverage);

        getAverageValue(arrayNotAverage);
        getMax(arrayNotAverage);
        getMin(arrayNotAverage);
    }

    public static ArrayList getArray(int limitElem) {
        ArrayList <Integer> list = new ArrayList<>();

        for (int i = 0; i < limitElem; i++) {
            Random randomNumber = new Random();
            int x = randomNumber.nextInt(50);
            list.add(x);
        }
        return list;
    }

    public static ArrayList deleteEvenNumbers(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            int even = list.get(i) % 2;
            if (even == 0) {
                // System.out.println("Чётное число удалённое из списка: " + list.get(i));
                list.remove(i);
            }
        }
        return list;
    }

    public static void getMin(ArrayList<Integer> list) {
        int min = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) min = list.get(i);
        }
        System.out.println("Минимальное число в списке: " + min);
    }

    public static void getMax(ArrayList<Integer> list) {
        int max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) max = list.get(i);
        }
        System.out.println("Максимальное число в списке: " + max);
    }

    public static void getAverageValue(ArrayList<Integer> list) {
        int sum = 0;
        
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        int average = sum / list.size();
        System.out.println("Среднее арифметическое значение из списка: " + average);
    }
}
