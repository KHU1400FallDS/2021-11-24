package sort;

public class InsertionSort extends Sort {
    public InsertionSort() {
        super("Insertion Sort");
    }

    @Override
    public void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numbers[j] < numbers[j - 1])
                    swap(numbers, j, j - 1);
                else
                    break;
            }
        }
    }
}
