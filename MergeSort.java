import java.util.Arrays;
class MergeSort{
    public static void MergeSort(int[] arr, int left, int right){
        if (left>=right) return;//base case
        int mid =left+(right-left)/2;
        MergeSort(arr, left, mid);
        MergeSort(arr, mid+1, right);
        merge(arr,left,mid,right);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int n1= mid-low+1;
        int n2= high-mid;
        int[] left= new int[n1];
        int[] right= new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=low;
        while (i<n1 && j<n2){
        if (left[i]<=right[j]){
            arr[k]=left[i];
            i++;
        }else{
            arr[k]=right[j];
            j++;
        }
        k++;
        }
        while (i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }

    }
    public static void main(String [] Args){
        int[] arr={5,3,4,1,2};
        MergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}