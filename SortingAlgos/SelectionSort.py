def SelectionSort(arr:list):
    n=len(arr)
    for i in range(n-1):
        minIdx=i
        for j in range(i+1,n):
            if arr[j]<arr[minIdx]:
                minIdx=j
        arr[i],arr[minIdx]=arr[minIdx],arr[i]
    return arr
print(SelectionSort([64,25,12,22,11]))