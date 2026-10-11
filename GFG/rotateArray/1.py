arr = [1,2,3,4,5,6]
d = 2

n = len(arr)
d = d % n

temp = arr[:d]
arr = arr[d:] + temp

print(arr)