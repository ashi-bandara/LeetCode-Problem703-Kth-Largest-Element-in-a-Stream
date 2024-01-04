import java.util.Arrays;

class KthLargest {
    int[] array;
    int k;

    public KthLargest(int k, int[] nums) {
        array = nums;
        this.k = k;
    }

    public int add(int val) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = val;
        array = sortArray(array);
        return array[array.length - k];
    }

    public int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tmp = 0;
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
