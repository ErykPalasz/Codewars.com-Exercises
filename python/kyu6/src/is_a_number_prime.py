# function that takes an integer argument and returns a logical value true or false depending on if the integer is a prime.


from math import isqrt


def is_prime(num):
    # return False if num < 2 else all(num % i != 0 for i in range(2, num)) # way too slow for big numbers

    if num <= 3:
        return num > 1
    if num % 2 == 0 or num % 3 == 0:
        return False
    limit = isqrt(num)
    return not any(num % i == 0 or num % (i + 2) == 0 for i in range(5, limit + 1, 6))
