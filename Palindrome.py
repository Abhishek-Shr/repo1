n= int(input())
b=n
if n <1001 and n>-1:
    rev=0
    while n!=0:
        rem=n%10
        rev=rev*10+rem
        n=n//10
    if rev == b:
        print ('yes')
    else:
        print ('no')
else:
    print ('Invalid Input')
        
        
