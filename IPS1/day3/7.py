# a to the pwr b

a = int(input("Enter base: "))
b = int(input("Enter power: "))

result = 1

for i in range(b):
    result = result * a

print(result)