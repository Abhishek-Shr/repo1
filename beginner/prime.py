import math
n = int(input())
f = 0
if n<1001 and n>0 and n!=1:
    for x in range(2,int(math.sqrt(n))+1):
        if n%x==0:
            f = 1
            break
    if f == 1:
        print('no')        
    else:
        print('yes')        
else:
    print('Invalid Input')
