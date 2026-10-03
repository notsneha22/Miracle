arr = [0,2,6,0,9,7]
result = []
res = []

for num in arr:
    if num != 0:
        result.append(num)
    else:
        res.append(num)

r = result + res
print(r)