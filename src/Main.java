public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();

        System.out.println("\n Задача 1");

        /* Условие задачи:
        Бухгалтеры попросили посчитать сумму всех выплат за месяц. Напишите программу, которая решит эту задачу,
        и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
         */

        // Решение:
        int amount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            amount += arr[i];
            System.out.println("Сумма трат за месяц составила " + amount + " рублей");
        }
    }

    public static void task2() {
        int[] arr = generateRandomArray();

        System.out.println("\n Задача 2");

        /* Условие задачи:
        Также бухгалтерия попросила найти минимальную и максимальную трату за день.Напишите программу, которая решит эту
        задачу, и выведите в консоль результат в формате: «Минимальная сумма трат за день составила … рублей.
        Максимальная сумма трат за день составила … рублей».
         */

        // Решение:
        int minimumSpend = arr[0];
        int maximumSpend = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maximumSpend < arr[i]) {
                maximumSpend = arr[i];
            }
            if (minimumSpend > arr[i]) {
                minimumSpend = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimumSpend + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maximumSpend + " рублей");
    }
    public static void task3() {
        int[] arr = generateRandomArray();

        System.out.println("\n Задача 3");

        /* Условие задачи:
        Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней. Напишите программу,
        которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
        и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
         */

        // Решение:
        float spendingAmount = 0;
        float averageAmount = 0;
        for (int sum : arr) {
            spendingAmount += sum;
        }
        averageAmount = spendingAmount / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");
    }
    public static void task4() {
        int[] arr = generateRandomArray();

        System.out.println("\n Задача 4");

        /* Условие задачи:
        В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в
        обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в
        виде массива символов — char[ ].Напишите код, который в случае такого бага будет выводить фамилии и имена
        сотрудников в корректном виде. В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено: Ivanov Ivan.
        Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву
        циклом и распечатать его элементы в правильном порядке.
         */

        // Решение:
        char[] fullNameReverse = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = fullNameReverse.length - 1; i >= 0; i--) {
            System.out.print(fullNameReverse[i]);
        }
    }
}


