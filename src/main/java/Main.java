import java.math.BigDecimal;
import java.sql.Types;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("На сколько человек необходимо разделить счет?");
        Scanner scanner = new Scanner(System.in);
        int PeopleCount;
        while(true){
            if (scanner.hasNextInt()){
                PeopleCount = scanner.nextInt();
                if (PeopleCount > 1) {
                    break;
                } else {
                    System.out.println("Ошибка, введите корректное колличество гостей");
                }
            }
            else {
                scanner.next();
                System.out.println("Ошибка, введите корректное колличество гостей");
            }
        }
        String input;
        Calculator calculator = new Calculator(PeopleCount);
        while(true){
            System.out.println("Введите наименование товара или \"Завершить\": ");
            input = scanner.next();
            if(input.equalsIgnoreCase("Завершить") ){
                break;
            }
            else{
                System.out.print("Введите стоимость товара: ");
                while(true){
                    String userInput = scanner.next();
                    double price = FormatChecker.parseInput(userInput);
                    if(price > 0.0){
                        Product product = new Product(input, price);
                        calculator.addProduct(product);
                        break;
                    }
                    else{
                        System.out.println("Неправильный формат ввода, введите цену еще раз");
                    }
                }
            }

        }
        calculator.printReceipt();
    }
}