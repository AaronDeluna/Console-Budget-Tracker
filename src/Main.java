import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] listOfExpenses = new String[31];

        System.out.println("Вас приведствует финансовое приложение!");
        int counter = 0;

        String a = "1. Добавить операцию",
                b = "2. Просмотреть операции",
                c = "3. Удалить операцию",
                d = "4. Подсчет суммы доходов и расходов",
                e = "5. Анализ бюджета за период",
                f = "6. Выйти из программы";

        boolean programWork = true;
        while (programWork){
            System.out.printf("Выберите действие: \n%s \n%s \n%s \n%s \n%s \n%s \n", a, b, c, d, e, f);

            int usersInputCommand = scanner.nextInt();

            if (usersInputCommand >= 1 && usersInputCommand <= 6){
                switch (usersInputCommand){
                    case 1 -> addPayment(listOfExpenses, scanner, counter);
                    case 2 -> viewTransactions(listOfExpenses, scanner);
                    case 3 -> deleteOperation(listOfExpenses, scanner);
                    case 4 -> calculatingIncomeAndExpenses(listOfExpenses, scanner);
                    case 5 -> budgetAnalysisThePeriod(listOfExpenses, scanner);
                    case 6 -> programWork = false;
                }
            }else {
                System.out.println("Вы не верно ввели команду, поробуйте еще раз!");
            }
        }
        System.out.println("Вы завершили работу программы, всего доброго!");
    }


    public static void addPayment(String[] array, Scanner scanner, int counter){

    }

    public static void viewTransactions(String[] array, Scanner scanner){

    }

    public static void deleteOperation(String[] array, Scanner scanner){

    }

    public static void calculatingIncomeAndExpenses(String[] array, Scanner scanner){

    }

    public static void budgetAnalysisThePeriod(String[] array, Scanner scanner){

    }
}