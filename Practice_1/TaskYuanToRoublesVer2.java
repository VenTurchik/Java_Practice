package Practice_1;

import java.util.Scanner;

public class TaskYuanToRoublesVer2 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;                      // Курс покупки
        
        int yuan;                                                   // Входные, количество юаней
        double roubles;                                             // Выходные, количество рублей из перевода юаней по курсу
        
        Scanner scanner = new Scanner(System.in);                   // Инициализация объекта scanner для ввода данных

        System.out.println("Перевод юаней в рубли");             // Шапка для запуска

        System.out.print("Введите сумму в юанях: ");             // Приглашение ввода данных           
        yuan = scanner.nextInt();                                  // Ввод данных

        int digit = yuan % 10;                                     // Последняя цифра юаней

        System.out.println("Вы ввели: " + yuan + endingYuan(digit));

        roubles = ROUBLES_PER_YUAN * yuan;                         // Конвертация

        System.out.println("Цена в рублях: " + roubles);

    }
    private static String endingYuan(int digit) {
        if (2 <= digit && digit <= 4) {
            return " китайских юаня";
        }
        else if (0 == digit || 5 <= digit && digit <= 9) {
            return  " китайских юаней";
        }
        else {
            return " китайский юань";
        }
    }
}
