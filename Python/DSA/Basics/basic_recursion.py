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



print_something_ntimes(5)
print_name_ntimes("Charu",5)
print_one_to_n(5)
print_n_to_one(5)
print(sum_first_n_numbers(5))