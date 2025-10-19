import java.util.Arrays;
class QuickSort{
    public static void QuickSort(int[] arr, int left, int right){
        if(left>=right) return;
        int pivotIndex=partition(arr, left, right);
        QuickSort(arr,left,pivotIndex-1);
        QuickSort(arr,pivotIndex+1,right);
    }
    public static int partition(int[] arr, int low, int high){
        int pivot= arr[high];
        int i=low-1;
        for(int j=low; j<high; j++){
        if (arr[j] < pivot){
            i++;
            swap(arr,i,j);
        }
    }
        swap(arr,i+1,high);
        return i+1;
}
    public static void swap(int[] arr,int i,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] Args){
        int[] arr={7,2,1,6,8,5,3,4};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}