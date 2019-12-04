package core.basesyntax;

import java.util.ArrayList;

public class FindNumbers {

    /**
     * <p>Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.</p>
     *
     * <p>Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.</p>
     *
     * <p>Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 96, 18, 26 и 0.</p>
     */
    public int[] getAllNumbers(String text) {

        ArrayList<Integer> multiInt = new ArrayList<Integer>();
        for (Integer i = -14; i <= 147; i++) {
            if (text.indexOf(i) >= 0) {
                multiInt.add(i * 2);
            }
        }
        int[] returnedMultiInt = new int[multiInt.size()];
        for (int i = 0; i < multiInt.size(); i++) {
            returnedMultiInt[i] = multiInt.get(i);
        }
        return returnedMultiInt;
    }
}
