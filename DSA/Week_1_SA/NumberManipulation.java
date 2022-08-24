package DSA.Week_1_SA;

public class NumberManipulation {
    public static double max(double arr[]) {
        double maximum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i]) {
                maximum = arr[i];
            }
        }

        return maximum;
    }

    public static double min(double arr[]) {
        double minimum = max(arr);

        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }

        return minimum;
    }

    public static double maxOdd(double arr[]) {
        double maximum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i] && arr[i] % 2 == 1) {
                maximum = arr[i];
            }
        }

        return maximum;
    }

    public static double minOdd(double arr[]) {
        double minimum = max(arr);

        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i] && arr[i] % 2 == 1) {
                minimum = arr[i];
            }
        }

        return minimum;
    }

    public static double maxEven(double arr[]) {
        double maximum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i] && arr[i] % 2 == 0) {
                maximum = arr[i];
            }
        }

        return maximum;
    }

    public static double minEven(double arr[]) {
        double minimum = max(arr);

        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i] && arr[i] % 2 == 0) {
                minimum = arr[i];
            }
        }

        return minimum;
    }

    public static double[] sort(double arr[]) {
        double hold = 0;

        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length - 1; y++) {
                if (arr[x] < arr[y]) {
                    hold = arr[x];
                    arr[x] = arr[y];
                    arr[y] = hold;
                }
            }
        }

        return arr;
    }
}