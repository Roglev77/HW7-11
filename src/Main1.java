public class Main1 {

    public static void printMessage() {
        System.out.println("Я порожній");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMessage(String[] messages) {
        for (String message : messages) {
            System.out.print(message + " ");
        }
        System.out.println();
    }

    public static void printSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Сума елементів масиву: " + sum);
    }

    public static void printMessageAndNumber(String message, int number) {
        System.out.println("Ваше повідомлення - \"" + message + "\", ваше число - " + number);
    }

    public static void main(String[] args) {

        printMessage();

        printMessage("Виведене повідомлення");

        String[] messagesArray = {"Набір", "слів", "в", "рядку"};
        printMessage(messagesArray);

        int[] numbersArray = {1, 2, 3, 4, 5};
        printSum(numbersArray);

        printMessageAndNumber("Слово", 24);
    }
}