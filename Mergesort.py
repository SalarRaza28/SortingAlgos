def MergeSort(arr:list,left:int,right:int):
    if left>=right:
        return 
    mid=left+(right-left)//2
    MergeSort(arr,left,mid)
    MergeSort(arr,mid+1,right)
    merge(arr,left,mid,right)
def merge(arr,left,mid,right):
    n1=low-high
    
    
MergeSort([6,3,9,5,2,8],0,5)