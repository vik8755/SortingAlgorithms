public class QuickSort {
    public static void sort(Integer[] arr,int low, int high) {
        if(low==high) return;
        if (low < high) {

            int partitionIndex = findPartitionIndex(arr, low, high);
            sort(arr, low, partitionIndex - 1);
            sort(arr, partitionIndex + 1, high);
        }
    }

    public static int findPartitionIndex(Integer[] arr,int low, int high){
        int pivot=arr[low];
        int left=low;
        int right=high;
        while (left<right){
            while (arr[left]<=pivot&& left<high){
                left++;
            }
            while (arr[right]>pivot&& right>=low){
                right--;
            }
            if(left<right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        arr[low]=arr[right];
        arr[right]=pivot;
return right;

    }
}
