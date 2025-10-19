def bubbleSort(arr:list):
    for i in range(len(arr)-1):
        swap=False
        for j in range(i+1,len(arr)):
            if arr[j]<arr[i]:
                arr[i],arr[j]=arr[j],arr[i]
                swap=True
        if not(swap):   
            break
    return arr
print(bubbleSort([64,25,12,22,11]))
        
