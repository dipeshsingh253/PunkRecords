def print_something_ntimes(n):
    if n == 0 :
        return
    print_something_ntimes(n-1)
    print("Something")


def print_name_ntimes(name,n):
    if n == 0:
        return
    print_name_ntimes(name,n-1)
    print(name)

def print_one_to_n(n):
    if n == 0:
        return
    print_one_to_n(n-1)
    print(n)

def print_n_to_one(n):
    if n == 0:
        return
    print(n)
    print_n_to_one(n-1)

def sum_first_n_numbers(n):
    if n == 0 :
        return 0
    return n + sum_first_n_numbers(n-1)

def factorial(n):
    if n == 0:
        return 1
    return n * factorial(n-1)

def reverse_array(arr,start,end):
    if start >= end:
        return

    temp = arr[start]
    arr[start] = arr[end]
    arr[end] = temp

    reverse_array(arr,start+1,end-1)

def is_palindrome(string):
    if len(string) <= 1:
        return True
    
    if string[0] == string[-1]:
        return is_palindrome(string[1:-1])
    else:
        return False
    
def fibonacci(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    
    return fibonacci(n-1) + fibonacci(n-2)


print_something_ntimes(5)
print_name_ntimes("Charu",5)
print_one_to_n(5)
print_n_to_one(5)
print(sum_first_n_numbers(5))
print(factorial(5))
arr = [1,2,3,4,5]
reverse_array(arr,0,len(arr)-1)
print(arr)
print(is_palindrome("madam"))
print(fibonacci(2))