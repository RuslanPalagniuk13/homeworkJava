package seminar1;

/** Задача 3:
 * Реализовать простой калькулятор
 */

import java.util.Scanner;

public class task3 {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Введите первое число: ");
      double firstNum = in.nextDouble();
      System.out.print("Введите оператор: (+, -, *, /): ");
      char Opr = in.next().charAt(0);
      System.out.print("Введите второе число: ");
      double secondNum = in.nextDouble();
      double result; 

      switch(Opr) {
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
      System.out.printf(firstNum + " " + Opr + " " + secondNum + " = " + result);
  }
}

// не получается убрать нули после запятой

