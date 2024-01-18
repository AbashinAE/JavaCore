package calc;

/**
 * Создание класса для алгоритма программы
 */
public class Calc {
    /**
     * Создание метода "сложение"
     * @param num1 - первое значение
     * @param num2 - второе значение
     * @return - возврат результата
     */
    public int sum(int num1, int num2){
        return num1 + num2;
    }

    /**
     * Создание метода "вычитание"
     * @param num1 - первое значение
     * @param num2 - второе значение
     * @return - возврат результата
     */
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Создание метода "умножение"
     * @param num1 - первое значение
     * @param num2 - второе значение
     * @return - возврат результата
     */
    public int mult(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Создание метода "деление"
     * @param num1 - первое значение
     * @param num2 - второе значение
     * @return - возврат результата
     */
    public int div(int num1, int num2) {
        return num1 / num2;
    }
}
