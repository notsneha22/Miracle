'''check for a prime number'''

'''def prime_num(n):
    if n ==1:
        return False

    for i in range (2,n+1):
        if i==2:
            return False
        else:
            True

print(prime_num(3))'''

'''here'''
        
def prime_n(n):
    if n<=1:
        return False

    for i in range(2,int(n**0.5)+1):
        return True
    return False

print(prime_n(17))