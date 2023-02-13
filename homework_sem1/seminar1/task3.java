package seminar1;

/** Задача 3:
 * Реализовать простой калькулятор
 */

import java.util.Scanner;

public class task3 {

   public static void main(String[] args) {
      
      double firstNum;
      double secondNum;
      double result;
      char opr;
      Scanner reader = new Scanner(System.in);
      System.out.print("Введите первое число: ");
      firstNum = reader.nextDouble();
      System.out.print("Введите второе число: ");
      secondNum = reader.nextDouble();
      System.out.print("Введите оператор: (+, -, *, /): ");
      opr = reader.next().charAt(0);

      switch(opr) {
         case '+': result = firstNum + secondNum;
            break;
         case '-': result = firstNum - secondNum;
            break;
         case '*': result = firstNum * secondNum;
            break;
         case '/': result = firstNum / secondNum;
            break;
         default:  System.out.printf("Неверно! Введите корректный оператор");
            return;
      }
      System.out.println("Полученный результат: ");
      System.out.printf(firstNum + " " + opr + " " + secondNum + " = " + result);
  }
}
    

