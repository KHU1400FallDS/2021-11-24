package sort;

public abstract class Sort {
    public String name;

    public Sort(String name) {
        this.name = name;
    }

    public abstract void sort(int[] numbers);

    void swap(int[] numbers , int first , int second ) {
        int temp = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temp;
    }
}
