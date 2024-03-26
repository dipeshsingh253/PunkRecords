def count_digits(num):
    if num == 0 :
        return 1
    
    count = 0
    while num > 0:
        num//=10
        count+=1

    return count

def reverse_number(num):
    reverse = 0

    while num != 0:
        reverse = reverse * 10 + num%10
        num //=10

    return reverse


# This is the easiest way to do it, but not the most efficient, here you have to check 
# every digit, but you can also do it by checking only for digits before and after the 
# middle element.
def check_palindrome(num):
    rev_num = reverse_number(num)   
    return rev_num == num


# I will try not to make this too complicated but to simplify this just remeber this algo is based 
# on Euclidean Algorithm for GCD. and there are 3 rules in it.
# 1. If a == 0 then gcd(a,b) will be b
# 2. If b == 0 then gcd(a,b) will be a
# 3. If we write a in pq+r form, where p == b, then it will look something like this :
#           a = b*q + r, so gcd(a,b) == gcd(b,r) here r = a%b.                
def gcd(a,b):
    if b == 0 :
        return a
    return gcd(b,a%b)


# Armstrong number is a number where the orginal num == sum of digits power to the number of digits in original num
def is_armstrong_number(num):
    original_num = num
    num_of_digits = len(str(num))
    sum = 0
    while num > 0:
        digit = num%10
        sum += digit ** num_of_digits
        num //= 10
    
    return original_num == sum

def is_prime(num):
    if num < 2 :
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False

    return True


print(count_digits(253))
print(reverse_number(123))
print(check_palindrome(1621))
print(is_armstrong_number(153))
print(is_prime(8))