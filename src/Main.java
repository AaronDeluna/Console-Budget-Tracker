import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] listOfExpenses = new int[31];
        String[] listOfExpensesDate = new String[31];

        System.out.println("Вас приведствует финансовое приложение!");
        int counter = 0;

        String a = "1. Добавить операцию",
                b = "2. Просмотреть операции",
                c = "3. Удалить",
                d = "4. Подсчет суммы доходов и расходов",
                e = "5. Анализ бюджета",
                f = "6. Выйти из программы";

        boolean programWork = true;
        while (programWork){
            System.out.printf("Выберите действие: \n%s \n%s \n%s \n%s \n%s \n%s \n", a, b, c, d, e, f);

            int usersInputCommand = scanner.nextInt();

            if (usersInputCommand >= 1 && usersInputCommand <= 6){
                switch (usersInputCommand){
                    case 1 -> {
                        addPayment(listOfExpenses, listOfExpensesDate, scanner, counter);
                        counter++;
                    }
                    case 2 -> showTransactions(listOfExpenses, listOfExpensesDate, scanner);
                    case 3 -> deleteOperation(listOfExpenses, listOfExpensesDate, scanner);
                    case 4 -> dataAnalyticsMethod(listOfExpenses);
                    case 5 -> analyticThePeriodMethod(listOfExpenses, listOfExpensesDate,scanner);
                    case 6 -> programWork = false;
                }
            }else {
                System.out.println("\nТакой команды нет, попробуйте снова!\n");
            }
        }
        System.out.println("Вы завершили работу программы, всего доброго!");
    }


    public static void addPayment(int[] arrayPayment, String[] arrayDate, Scanner scanner, int counter) {
        System.out.println("Введите сумму: ");
        int sumUserInput = scanner.nextInt();
        System.out.println("Введите дату: дд.мм.чч");
        String datePayment = scanner.next();
        arrayPayment[counter] = sumUserInput;
        arrayDate[counter] = datePayment;
    }

    public static void showTransactions(int[] arrayPayment, String[] arrayDate,Scanner scanner){
        boolean isEmpty = true;
            for (int i = 0; i < arrayPayment.length; i++) {
                if (arrayPayment[i] != 0 && arrayDate[i] != null) {
                    System.out.println((i + 1) + " -" + " " + "Ваш расход:" + " " + arrayPayment[i] + " рублей " + " " + arrayDate[i] + " Дата \n");
                    isEmpty = false;
                }
            }
            if (isEmpty){
                System.out.println("\nСписок трат и доходов пустой!\n");
            }
    }

    public static void deleteOperation(int[] arrayPayment, String[] arrayDate,Scanner scanner){
        String a = "1. Удалить по номеру",
                c = "2. Удалить все траты",
                d = "3. Выйти из удаления";

        boolean deleteRunProgram = true;
        while (deleteRunProgram){
            System.out.printf("Выберите действие, которое хотите сделать: \n%s \n%s \n%s \n", a, c, d);

            int deleteCommand = scanner.nextInt();
            if (deleteCommand >= 1 && deleteCommand <= 3){
                switch (deleteCommand){
                    case 1 -> deleteOfNumberMethod(arrayPayment, arrayDate, scanner);
                    case 2 -> deleteAllItemMethod(arrayPayment, arrayDate, scanner);
                    case 3 -> deleteRunProgram = false;
                }
            }else {
                System.out.println("\nВы ввели не верную команду!\n");
            }
        }
        System.out.println("\nВы вышли из режима удаление!\n");
    }

    public static void deleteOfNumberMethod(int[] arrayPayment, String[] arrayDate,Scanner scanner){
        System.out.println("Вот список котрый доступен: ");
        showTransactions(arrayPayment, arrayDate, scanner);
        System.out.println("Введите номер котрый хотите удалить: ");
        int inputIndex = scanner.nextInt();
        System.out.println("Вы удалили: " + " " + inputIndex + " " +  arrayPayment[inputIndex] + " и " + arrayDate[inputIndex] + " " + "Больше не в вашем списке");
        arrayPayment[inputIndex - 1] = 0;
        arrayDate[inputIndex - 1] = null;
    }

    public static void deleteAllItemMethod(int[] arrayPayment, String[] arrayDate,Scanner scanner){
        for (int i = 0; i < arrayPayment.length; i++) {
            arrayPayment[i] = 0;
            arrayDate[i] = null;
            System.out.println("Список полностью удален!");
        }
    }

    public static void dataAnalyticsMethod(int[] arrayPayment) {
        int summa = 0;
        for (int payment : arrayPayment) {
            summa += payment;
        }
        System.out.println("Сумма всех операций: " + summa + " рублей");
    }

    public static void analyticThePeriodMethod(int[] arrayPayment, String[] arrayDate,Scanner scanner){

    }
}