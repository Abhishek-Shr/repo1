i,l = list(map(int,input().split()))
f = 0
for x in range(i+1,l):
    rev = 0 
    b = x
    while x!=0:
        rem = x%10
        rev = rev+rem**3
        x = x//10    
    if rev == b:
        print(b,end = ' ')
