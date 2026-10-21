'''a school bus has seats number from A to N, nut due a new rule only even number seats can be alloted. help this school to generate the list of available no. of seats'''

n = int(input("Enter the last seat number: "))

for seat in range(2, n + 1, 2):
    print(seat, end=" ")