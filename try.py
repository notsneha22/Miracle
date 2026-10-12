arr = [10, 7, 5, 8, 11, 9]

min_price = arr[0]
max_profit = 0

for price in arr:

    if price < min_price:
        min_price = price

    profit = price - min_price

    if profit > max_profit:
        max_profit = profit

print(max_profit)