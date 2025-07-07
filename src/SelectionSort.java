public class SelectionSort {
    public static Integer[] sort(Integer[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i;j<arr.length;j++){
                int min=arr[i];
                int minimumIndex=i;
                if (min>arr[j]) {
                    min=arr[j];
                    minimumIndex=j;
                }
                arr[minimumIndex]=arr[i];
                arr[i]=min;
            }

        }
        return arr;

    }
}
