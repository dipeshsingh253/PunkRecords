def binary_search(arr,target):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = low + (high-low)//2

        if arr[mid] == target:
            return True
        
        if arr[mid] < target:
            low = mid + 1
        else:
            high = mid -1
        
    return False


def binary_search_recursive(arr, target,low,high):
    if low <= high:
        mid = low + (high-low)//2

        if arr[mid] == target:
            return mid
        
        if arr[mid] < target:
            return binary_search_recursive(arr,target,mid+1,high)
        else:
            return binary_search_recursive(arr,target,low,mid-1)
        
    return -1

arr = [ 3, 4, 5, 6, 7, 8, 9 ]
target = 5
print(binary_search(arr,target))
print(binary_search_recursive(arr,target,0,len(arr)-1))