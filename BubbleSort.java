class BubbleSort{
    public static void BubbleSort(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            boolean swap=false;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
                if (!swap) break;
            }
        }

    }
    public static void main(String[] args){
        int[] arr={64,25,12,22,11};
        BubbleSort(arr);
        for (int num:arr){
            System.out.println(num);
        }
    }
}