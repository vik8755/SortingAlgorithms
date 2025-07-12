public class BubbleSort {
    public static Integer[] sort(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // We need to optimise the sort if already is sorted
            // then we need to break the inner loop.
            boolean didSwapHappen=false;
            for (int j = 0; j < arr.length-1-i; j++) {
                 if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                     didSwapHappen=true;
                 }
            }
            if (!didSwapHappen) break;
        }
        return arr;
    }
}
