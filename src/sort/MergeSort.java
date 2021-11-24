package sort;

public class MergeSort extends Sort {
    public MergeSort() {
        super("Merge Sort");
    }

    @Override
    public void sort(int[] numbers) {
        var sortedNumbers = mergeSort(numbers);

        System.arraycopy(sortedNumbers, 0, numbers, 0, numbers.length);
    }

    private int[] mergeSort(int[] numbers) {
        if (numbers.length == 1)
            return numbers;

        var left = mergeSort(splitLeft(numbers));
        var right = mergeSort(splitRight(numbers));

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        var result = new int[left.length + right.length];

        var leftIndex = 0;
        var rightIndex = 0;
        var resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex] = left[leftIndex];
                leftIndex++;
            } else {
                result[resultIndex] = right[rightIndex];
                rightIndex++;
            }

            resultIndex++;
        }

        while (leftIndex < left.length) {
            result[resultIndex] = left[leftIndex];
            leftIndex++;
            resultIndex++;
        }

        while (rightIndex < right.length) {
            result[resultIndex] = right[rightIndex];
            rightIndex++;
            resultIndex++;
        }

        return result;
    }

    private int[] splitLeft(int[] numbers) {
        var half = new int[numbers.length / 2];

        for (int i = 0; i < half.length; i++)
            half[i] = numbers[i];

        return half;
    }

    private int[] splitRight(int[] numbers) {
        var offset = numbers.length % 2;
        var half = new int[numbers.length / 2 + offset];

        for (int i = 0; i < half.length; i++)
            half[i] = numbers[i + half.length - offset];

        return half;
    }
}
