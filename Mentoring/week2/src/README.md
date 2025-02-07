**Задание: Реализация класса для работы с комплексными числами**

1. Создайте класс ComplexNumber, который будет представлять комплексное число с двумя приватными полями:
* real (вещественная часть числа, тип double)
* imaginary (мнимая часть числа, тип double)
2. Реализуйте конструкторы:
* Конструктор с параметрами, принимающий значения вещественной и мнимой частей.
* Конструктор без параметров, который создает комплексное число со значениями 0.0 для обеих частей.
3. Создайте обычные методы:
* double getMagnitude(): метод, который возвращает модуль (величину) комплексного числа. Формула: sqrt(real² + imaginary²).
* ComplexNumber add(ComplexNumber other): метод, который складывает текущее комплексное число с другим и возвращает новый объект ComplexNumber в качестве результата.
* ComplexNumber subtract(ComplexNumber other): метод, который вычитает другое комплексное число из текущего и возвращает новый объект ComplexNumber.
4. Создайте статические методы:
* static ComplexNumber add(ComplexNumber a, ComplexNumber b): статический метод, который принимает два комплексных числа и возвращает их сумму без изменения входных параметров.
* static ComplexNumber subtract(ComplexNumber a, ComplexNumber b): статический метод, который принимает два комплексных числа и возвращает их разность без изменения входных параметров.
5. Напишите метод toString(), который возвращает строковое представление комплексного числа в формате "a + bi", где a — вещественная часть, а b — мнимая часть.

**Пример использования:**

```
public static void main(String[] args) {

    ComplexNumber num1 = new ComplexNumber(3.0, 4.0);

    ComplexNumber num2 = new ComplexNumber(2.0, -1.0);

 

    // Используя обычные методы

    ComplexNumber sum1 = num1.add(num2);

    ComplexNumber difference1 = num1.subtract(num2);

   

    // Используя статические методы

    ComplexNumber sum2 = ComplexNumber.add(num1, num2);

    ComplexNumber difference2 = ComplexNumber.subtract(num1, num2);

   

    // Вывод результатов

    System.out.println("Magnitude of num1: " + num1.getMagnitude());

    System.out.println("Sum1: " + sum1);

    System.out.println("Difference1: " + difference1);

    System.out.println("Sum2: " + sum2);

    System.out.println("Difference2: " + difference2);

}
```