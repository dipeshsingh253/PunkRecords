def count_frequency(arr):
    frequency_map = {}

    for num in arr:
        if num in frequency_map:
            frequency_map[num] +=1
        else:
            frequency_map[num] = 1
    
    return frequency_map


def max_frequency_elements(arr):
    frequency_map = count_frequency(arr)
    max_frequency = max(frequency_map.values())

    high_freq_elements = [key for key, value in frequency_map.items() if value == max_frequency]

    return high_freq_elements


arr = [1,3,5,7,4,6,3,4,5,4,6,8,6,5,3,5,3,5,4,7,4]
print(count_frequency(arr))
print(max_frequency_elements(arr))