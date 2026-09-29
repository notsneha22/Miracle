''' n to 1'''

n = int(input("Enter a num:"))
for i in range(n,0,-1):
    print(i, end=",")

# method 2

n = int(input("Enter a num: "))
for i in range(n, 0, -1):
    if i == 1:
        print(i)        
    else:
        print(i, end=",")
