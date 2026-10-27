# sum of factors

n = int(input("Enter a number: "))

sum_factors = 0

for i in range(1, n + 1):
    if n % i == 0:
        sum_factors += i

print("Sum of factors =", sum_factors)