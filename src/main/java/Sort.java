public class Sort {
    public static void thanosSort(int start, int end, int[] arr) {
        if (end - start < 1)
            return;

        int j = start - 1, k = end + 1, sum = 0;
        int[] result = new int[arr.length];
        double avg = 0;

        for (int i = start; i <= end; i++) {
            sum = sum + arr[i];
            avg = (double) sum / (end - start + 1);
        }

        for (int i = start; i <= end; i++)
            if (arr[i] <= avg) {
                j++;
                result[j] = arr[i];
            } else {
                k--;
                result[k] = arr[i];
            }

        for (int i = start; i <= end; i++)
            arr[i] = result[i];

        if (j == start - 1 || k == end + 1)
            return;

        if (j >= start)
            thanosSort(start, j, arr);
        if (k <= end)
            thanosSort(k, end, arr);
    }
}