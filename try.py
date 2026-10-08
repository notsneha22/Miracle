n = int(input("Enter:"))

for i in n:
    if i > 0:
        n = i % 10
        n // 10

print(i)