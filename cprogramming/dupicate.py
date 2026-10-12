arr = [2, 4, 2, 5, 4, 2]

for i in range (len(arr)):
    
    count = 0

    for j in range (len(arr)):
        if arr[i] == arr[j]:
            count+=1

    print(arr[i], ":", count)


