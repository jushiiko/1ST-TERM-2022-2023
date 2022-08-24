package DSA.Week3_SortingAlgorithm;

public class sortingAlgorithm {
    // challenge: ascending or descending
    private long units;
    long start, end;
    String sorted = "";

    public String bubbleSort(int arr[], int agree) {
        if (agree == 1) {
            // ascending
            start = System.nanoTime();
            for (int x = 0; x < arr.length; x++) {
                for (int y = 0; y < arr.length - 1; y++) {
                    if (arr[x] < arr[y]) {
                        int temp = arr[x];
                        arr[x] = arr[y];
                        arr[y] = temp;
                    }
                }
                System.out.println(printArray(arr));
            }
            end = System.nanoTime();
        }
        if (agree == 2) {
            start = System.nanoTime();
            for (int x = 0; x < arr.length; x++) {
                for (int y = 0; y < arr.length - 1; y++) {
                    if (arr[x] > arr[y]) {
                        int temp = arr[x];
                        arr[x] = arr[y];
                        arr[y] = temp;
                    }
                }
                System.out.println(printArray(arr));

            }
            end = System.nanoTime();
        }
        units = (end - start);
        sorted = printArray(arr);
        return sorted + "d Time Units " + units;
    }

    public String insertionSort(int num[], int agree) {
        int n = num.length;
        if (agree == 1) {
            start = System.nanoTime();
            for (int outer = 1; outer < n; outer++) {
                int key = num[outer];
                int inner = outer - 1;

                while ((inner > 0) && (num[inner] > key)) {
                    num[inner + 1] = num[inner];
                    inner--;
                }
                num[inner + 1] = key;
                System.out.println(outer);
            }
            end = System.nanoTime();
        }
        if (agree == 2) {
            start = System.nanoTime();
            for (int outer = 1; outer < n; ++outer) {
                int key = num[outer];
                int inner = outer - 1;

                while ((inner >= 0) && (num[inner] < key)) {
                    num[inner + 1] = num[inner];
                    inner--;
                }
                num[inner + 1] = key;
                System.out.println(outer);
            }
            end = System.nanoTime();
        }
        units = (end - start);
        sorted = printArray(num);
        return sorted + "d Time Units " + units;
    }

    public String exchangeSort(int num[], int agree) {
        if (agree == 1) {
            start = System.nanoTime();
            for (int x = 0; x < num.length - 1; x++) {
                for (int y = (x + 1); y < num.length; y++) {
                    if (num[x] > num[y]) {
                        int temp = num[x];
                        num[x] = num[y];
                        num[y] = temp;
                    }
                }
            }
            end = System.nanoTime();
        }
        if (agree == 2) {
            start = System.nanoTime();
            for (int x = 0; x < num.length - 1; x++) {
                for (int y = (x + 1); y < num.length; y++) {
                    if (num[x] < num[y]) {
                        int temp = num[x];
                        num[x] = num[y];
                        num[y] = temp;
                    }
                }
            }
            end = System.nanoTime();
        }
        units = (end - start);
        sorted = printArray(num);
        return sorted + "d Time Units " + units;
    }

    static String printArray(int num[]) {
        int n = num.length;
        String a = "";
        for (int i = 0; i < n; i++) {
            a += num[i] + " ";
        }
        return a;
    }
}