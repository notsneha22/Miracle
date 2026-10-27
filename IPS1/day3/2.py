# count prime num.

l = int(input())
r = int(input())

count = 0

for num in range(l, r + 1):
    if num > 1:
        prime = True

        for i in range(2, num):
            if num % i == 0:
                prime = False
                break

        if prime:
            print(num, end=" ")
            count += 1

print("\nCount =", count)