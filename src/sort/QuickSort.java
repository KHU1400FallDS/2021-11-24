package sort;

public class QuickSort extends Sort {
    public QuickSort() {
        super("Quick Sort");
    }

    @Override
    public void sort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
    }

    private void quickSort(int[] numbers, int down, int up) {
        if (numbers.length <= 1 || down > up)
            return;

        var key = numbers[down];
        var keyIndex = down;
        var top = up;

        while (down < up) {
            while (numbers[down] <= key)
                down++;

            while (numbers[up] >= key)
                up--;

            if (down < up)
                swap(numbers, down, up);
        }

        swap(numbers, keyIndex, up);

        quickSort(numbers, keyIndex, up - 1);
        quickSort(numbers, up + 1, top);
    }
}
