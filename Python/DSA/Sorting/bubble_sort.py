# Here swapped variable can be used to make bubble_sort more efficient.

def bubble_sort(arr):
    size = len(arr)
    for i in range(size-1):
        # swapped = False
        for j in range(size-1-i):
            if arr[j] > arr[j+1]:
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
                # swapped = True
        # if not swapped:
        #     break
arr = [4,5,24,5,43,12,43,2,52,17]

bubble_sort(arr)
print(arr)





