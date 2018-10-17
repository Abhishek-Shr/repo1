n = int(input())
if n < 100001 and n > -1:
    rev = 0 
    b = n
    while n!=0:
        rem = n%10
        rev = rev+rem**3
        n = n//10
    if rev == b:
        print('yes')
    else:
        print('no')
else:
    print('Invalid Input')    
