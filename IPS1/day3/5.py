# amstrong num

n = int(input("Enter a number: "))

temp = n
digits = len(str(n))
sum = 0

while temp > 0:
    digit = temp % 10
    sum += digit ** digits
    temp = temp // 10

if sum == n:
    print("Armstrong Number")
else:
    print("Not an Armstrong Number")