import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void sort(Integer[] arr,int left, int right) {
        if(left== right) return ;
        int mid=(left+right)/2;
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr,left,mid,right);


    }

    private static void merge(Integer[] arr, int left, int mid, int right) {
        int rightPointer=mid+1;
        int start = left;
        List<Integer> temp=new ArrayList<>();
        while (left<=mid&&rightPointer<=right){
            if(arr[left]<=arr[rightPointer]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[rightPointer]);
                rightPointer++;
            }
        }
        while (left<=mid) {
            temp.add(arr[left]);
            left++;
        }
        while (rightPointer<=right) {
            temp.add(arr[rightPointer]);
            rightPointer++;
        }
        // Always start writing from left.
        for (int i = 0; i < temp.size(); i++) {
            arr[start + i] = temp.get(i);
        }
    }
}
