def selection_sort(arr):
    size = len(arr)

    for i in range(size-1):
        min_idx = i
        for j in range(i+1,size):
            if arr[min_idx] > arr[j]:
                min_idx = j

         # Swap elements
        arr[i], arr[min_idx] = arr[min_idx], arr[i]

""" Tradional swapping
    temp = arr[i]
    arr[i] = arr[min_idx]
    arr[min_idx] = temp
"""


arr = [4,5,24,5,43,12,43,2,52,17]

selection_sort(arr)
print(arr)