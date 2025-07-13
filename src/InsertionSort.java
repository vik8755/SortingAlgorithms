public class InsertionSort {
    public static Integer[] sort(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            // For best case i.e. sorted array only outer loop runs.
            while (j>0&& (arr[j]<arr[j-1])){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
            }
        }
        return arr;
    }
}
