package sort;

public class BubbleSort extends Sort {
    public BubbleSort() {
        super("Bubble Sort");
    }

    @Override
    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            var isSwapped = false;

            for (int j = 0; j < (numbers.length - 1) - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                    isSwapped = true;
                }
            }

            if (!isSwapped)
                break;
        }
    }
}
