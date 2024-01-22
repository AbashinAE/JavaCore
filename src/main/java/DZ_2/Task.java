package DZ_2;

public class Task {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("task 1:");
        System.out.println(returnEvent(new int[] { 2, 1, 2, 3, 4 }));
        System.out.println(returnEvent(new int[] { 2, 2, 0 }));
        System.out.println(returnEvent(new int[] { 1, 3, 5 }));
        System.out.println();
        System.out.println("task 2:");
        System.out.println(difMaxMin(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println();
        System.out.println("task 3:");
        System.out.println(findElementNul(new int [] { 2, 0, 0, 3, 4 }));
    }
/*
1. Написать метод, возвращающий количество чётных элементов массива.
countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
*/
    public static int returnEvent(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0)
                count++;
        }
        return count;
    }
/*
2. Написать функцию, возвращающую разницу между самым большим
и самым маленьким элементами переданного не пустого массива.
 */
    public static int difMaxMin(int[] array) {
        if (array.length == 0)
            return -1;
        int Min = array[0];
        int Max = array[0];
        for (int i : array) {
            if (i < Min) {
                Min = i;
            } else if (i > Max) {
                Max = i;
            }
        }
        return Max - Min;
    }
/*
3. Написать функцию, возвращающую истину, если в переданном массиве
есть два соседних элемента, с нулевым значением.
 */
    public static boolean findElementNul(int [] array) {
        int element = -1;
        for(int i:array) {
            if(element == 0 && i == 0) return true;
            element = i;
        }
        return false;
    }
}
