import java.util.*;
public class Main {



    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5};
        int maxCarryWeight = 5;          // Максимальный вес, который можно нести за одну поездку
        int maxTrips = 10;               // Максимальное количество поездок

        int totalWeight = 0;             // Общий вес, который будет перевезён
        int i = weights.length - 1;      // Начинаем с самого большого веса

        // Подсчёт веса, который можно перенести за одну поездку
        while (i >= 0 && maxCarryWeight > 0) {
            if (weights[i] <= maxCarryWeight) {
                totalWeight += weights[i]; // Добавляем вес в общий вес
                maxCarryWeight -= weights[i]; // Уменьшаем оставшийся вес
            } else {
                i--; // Переход к следующему меньшему весу
            }
        }

        // Общий вес, перевезённый за все поездки
        totalWeight *= maxTrips;
        System.out.println(totalWeight); // Выводим результат
    }
}


