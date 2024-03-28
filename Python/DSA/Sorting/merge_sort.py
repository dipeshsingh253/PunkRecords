def merge_sort(arr,l,r):
    if l < r:
        m = l + (r-l)//2
        merge_sort(arr,l,m)
        merge_sort(arr,m+1,r)
        merge(arr,l,m,r)


def merge(arr,l,m,r):
    n1 = m-l+1
    n2 = r-m

    left = [0]*n1
    right = [0]*n2
    
    for i in range(n1):
        left[i] = arr[l+i]
    
    for i in range(n2):
        right[i] = arr[m+1+i]
    
    i=0
    j=0
    k=l

    while i < n1 and j<n2:
        if left[i] <= right[j]:
            arr[k] = left[i]
            i+=1
        else:
            arr[k] = right[j]
            j+=1
        k+=1
    
    while i < n1:
        arr[k] = left[i]
        i+=1
        k+=1
    
    while j < n2:
        arr[k] = right[j]
        j+=1
        k+=1
    


arr = [6, 5, 3, 1, 8, 7, 2, 4]
merge_sort(arr,0,len(arr)-1)
print(arr)