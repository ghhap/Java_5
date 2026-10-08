package calculator;

/*
1. Клас - це шаблон за яким створюються об'єкти
   Об'єкт - це конкретний екземпляр класу

2. Атрибути класу - це змінні які зберігають дані об'єкта
   Методи класу - це дії які може виконувати об'єкт
   Метод викликається через ім'я об'єкта, наприклад: object.calculate();

3. Методи get використовуються для отримання значення атрибуту
   Методи set використовуються для зміни значення атрибуту
   Типізований метод повертає значення певного типу, наприклад double
   Метод void нічого не повертає

4. Конструктор - це спеціальний метод, який викликається при створенні об'єкта
   Він використовується для початкової ініціалізації атрибутів

5. Перевантаження методів - це створення кількох методів
   з однаковою назвою, але різними параметрами

6. Статичний атрибут або метод належить класу, а не окремому об'єкту
   Статичний метод можна викликати через ім'я класу

7. Пакет у Java використовується для об'єднання класів у групи
   Це допомагає організувати структуру програми
*/

public class ExpressionCalculator {

    private double a;
    private double x;
    private double y;
    private double c;

    public ExpressionCalculator() {
        a = 2;
        x = 1;
        y = 1.5;
        c = 0.5;
    }

    public ExpressionCalculator(double a, double x, double y, double c) {
        this.a = a;
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calculate() {

        double denominator =
                Math.pow(Math.sin(x + y), 3)
                + Math.abs(x - y);

        if (denominator == 0) {
            System.out.println("Помилка. Знаменник дорівнює нулю.");
            return 0;
        }

        double P =
                (Math.pow(a, 5)
                + Math.pow(Math.sin(y - c), 4))
                / denominator;

        return P;
    }

    public static double calculateStatic(double a, double x,
                                         double y, double c) {

        double denominator =
                Math.pow(Math.sin(x + y), 3)
                + Math.abs(x - y);

        if (denominator == 0) {
            System.out.println("Помилка. Знаменник дорівнює нулю.");
            return 0;
        }

        double P =
                (Math.pow(a, 5)
                + Math.pow(Math.sin(y - c), 4))
                / denominator;

        return P;
    }
}