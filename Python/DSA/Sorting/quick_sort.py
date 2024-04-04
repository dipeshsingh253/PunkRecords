def partition(arr, l, r):
    piv = arr[r]
    start = l - 1

    for i in range(l, r):
        if arr[i] < piv:
            start += 1
            arr[i], arr[start] = arr[start], arr[i]

    arr[start + 1], arr[r] = arr[r], arr[start + 1]
    return start + 1

def quick_sort(arr, l, r):
    if l < r:
        piv = partition(arr, l, r)
        quick_sort(arr, l, piv - 1)
        quick_sort(arr, piv + 1, r)
    
    return arr

# Example usage:
arr = [10, 7, 8, 9, 1, 5]
sorted_arr = quick_sort(arr, 0, len(arr) - 1)
print("Sorted array:", sorted_arr)
