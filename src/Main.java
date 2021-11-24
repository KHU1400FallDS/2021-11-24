import sort.*;

public class Main {
    public static void main(String[] args) {
        var algorithms = new Sort[]{new BubbleSort(), new SelectionSort(), new InsertionSort(), new MergeSort(), new QuickSort()};

        for (var algorithm : algorithms) {
            var lost = new int[]{23, 15, 4, 42, 8, 16};
            algorithm.sort(lost);

            System.out.print(algorithm.name + ": ");
            for (var number : lost)
                System.out.print(number + "\t");
            System.out.println();
        }
    }
}
