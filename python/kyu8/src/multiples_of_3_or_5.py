def sumof3or5(n):
    return sum(i for i in range(n) if i % 3 == 0 or i % 5 == 0)
