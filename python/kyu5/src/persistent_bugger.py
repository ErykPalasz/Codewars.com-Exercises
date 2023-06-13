# _counter = 0


# def persistence(n):
#     global _counter
#     if n < 10:
#         result = _counter
#         _counter = 0
#         return result
#     digit_list = [int(i) for i in str(n)]
#     result = 1
#     _counter += 1
#     for digit in digit_list:
#         result *= digit
#     return persistence(result)

# solution without global variable and recursion
import math


def persistence(n):
    if n < 10:
        return 0
    digits = [int(digit) for digit in str(n)]
    product = math.prod(digits)
    return 1 + persistence(product)
