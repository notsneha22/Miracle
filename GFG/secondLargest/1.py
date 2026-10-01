arr = [1,2,3,4,5,6]

largest = arr[0]
sec_largest = arr[0]

for num in arr:
    if num > largest:
        sec_largest = largest
        largest = num

    elif num > sec_largest and num != largest:
        sec_largest = num

print("second largest:", sec_largest) 