package Practice_1;

import java.util.Scanner;

public class TaskYuanToRoubles {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;                      // Курс покупки
        
        int yuan;                                                   // Входные, количество юаней
        double roubles;                                             // Выходные, количество рублей из перевода юаней по курсу
        
        Scanner scanner = new Scanner(System.in);                   // Инициализация объекта scanner для ввода данных

        System.out.println("Перевод юаней в рубли");             // Шапка для запуска

        System.out.print("Введите сумму в юанях: ");             // Приглашение ввода данных           
        yuan = scanner.nextInt();                                  // Ввод данных

        roubles = ROUBLES_PER_YUAN * yuan;                         // Конвертация

        System.out.printf(                                          // Вывод результата
            "Сумма в рублях: %.2f%n", 
            roubles
        );

        scanner.close();                                            // Закрытие сканнера, чтобы VScode не жаловался

    }
}