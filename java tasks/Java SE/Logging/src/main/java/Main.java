import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {100, 12, 31, 5, 4, 3, 2, 1};

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

//        int[] array = {10, 2, 10, 3, 1, 2, 5};
//        System.out.println(Arrays.toString(array));
//        for (int left = 0; left < array.length; left++) {
//            // Вытаскиваем значение элемента
//            int value = array[left];
//            // Перемещаемся по элементам, которые перед вытащенным элементом
//            int i = left - 1;
//            for (; i >= 0; i--) {
//                // Если вытащили значение меньшее — передвигаем больший элемент дальше
//                if (value < array[i]) {
//                    array[i + 1] = array[i];
//                } else {
//                    // Если вытащенный элемент больше — останавливаемся
//                    break;
//                }
//            }
//            // В освободившееся место вставляем вытащенное значение
//            array[i + 1] = value;
//        }
//        System.out.println(Arrays.toString(array));


