import calculator.ExpressionCalculator;
public class Main {
 public static void main(String[] args) {
 ExpressionCalculator object1 =
 new ExpressionCalculator();
 System.out.println("Об'єкт 1:");
 System.out.println("a = " + object1.getA());
 System.out.println("x = " + object1.getX());
 System.out.println("y = " + object1.getY());
 System.out.println("c = " + object1.getC());
 double result1 = object1.calculate();
 System.out.println("Результат нестатичного методу:");
 System.out.println("P = " + result1);
 System.out.println();
 ExpressionCalculator object2 =
 new ExpressionCalculator(2, 3, 1.5, 0.5);
 System.out.println("Об'єкт 2:");
 System.out.println("a = " + object2.getA());
 System.out.println("x = " + object2.getX());
 System.out.println("y = " + object2.getY());
 System.out.println("c = " + object2.getC());
 double result2 = object2.calculate();
 System.out.println("Результат нестатичного методу:");
 System.out.println("P = " + result2);
 System.out.println();
 double result3 =
 ExpressionCalculator.calculateStatic(
 2, 3, 1.5, 0.5
 );
 System.out.println("Результат статичного методу:");
 System.out.println("P = " + result3);
 object1.setX(5);
 System.out.println();
 System.out.println("Після зміни x через setX:");
 System.out.println("x = " + object1.getX());
 System.out.println("P = " + object1.calculate());
 }
}