package sort;

public class SelectionSort extends Sort {
    public SelectionSort() {
        super("Selection Sort");
    }

    @Override
    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            var maximumNumberIndex = 0;
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[maximumNumberIndex] < numbers[j])
                    maximumNumberIndex = j;
            }

            swap(numbers, maximumNumberIndex, (numbers.length - 1) - i);
        }
    }
}
