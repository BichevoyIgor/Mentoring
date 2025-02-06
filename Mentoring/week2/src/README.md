**Задание: Реализация класса для работы с векторами в трёхмерном пространстве**

1. Создайте класс Vector3D, который будет представлять трёхмерный вектор с тремя приватными полями:
* x (координата по оси X, тип double)
* y (координата по оси Y, тип double)
* z (координата по оси Z, тип double)
2. Реализуйте конструкторы:
* Конструктор с параметрами, принимающий значения x, y, z.
* Конструктор без параметров, который создает вектор с координатами (0.0, 0.0, 0.0).
3. Создайте обычные методы:
* double getMagnitude(): метод, который возвращает длину (величину) вектора. Формула: sqrt(x² + y² + z²).
* Vector3D add(Vector3D other): метод, который складывает текущий вектор с другим и возвращает новый объект Vector3D в качестве результата.
* Vector3D subtract(Vector3D other): метод, который вычитает другой вектор из текущего и возвращает новый объект Vector3D.
* double dotProduct(Vector3D other): метод, который вычисляет и возвращает скалярное произведение текущего вектора и другого вектора. Формула: x1*x2 + y1*y2 + z1*z2.
4. Создайте статические методы:
* static Vector3D add(Vector3D a, Vector3D b): статический метод, который принимает два вектора и возвращает их сумму без изменения входных параметров.
* static Vector3D subtract(Vector3D a, Vector3D b): статический метод, который принимает два вектора и возвращает их разность без изменения входных параметров.
* static double dotProduct(Vector3D a, Vector3D b): статический метод, который принимает два вектора и возвращает их скалярное произведение.
5. Напишите метод toString(), который возвращает строковое представление вектора в формате "<x, y, z>".

5. Пример использования:


    public static void main(String[] args) {

    Vector3D vector1 = new Vector3D(1.0, 2.0, 3.0);

    Vector3D vector2 = new Vector3D(4.0, -1.0, 2.0);

 

    // Используя обычные методы

    Vector3D sum1 = vector1.add(vector2);

    Vector3D difference1 = vector1.subtract(vector2);

    double dotProduct1 = vector1.dotProduct(vector2);

   

    // Используя статические методы

    Vector3D sum2 = Vector3D.add(vector1, vector2);

    Vector3D difference2 = Vector3D.subtract(vector1, vector2);

    double dotProduct2 = Vector3D.dotProduct(vector1, vector2);

   

    // Вывод результатов

    System.out.println("Magnitude of vector1: " + vector1.getMagnitude());

    System.out.println("Sum1: " + sum1);

    System.out.println("Difference1: " + difference1);

    System.out.println("DotProduct1: " + dotProduct1);

    System.out.println("Sum2: " + sum2);

    System.out.println("Difference2: " + difference2);

    System.out.println("DotProduct2: " + dotProduct2);

}