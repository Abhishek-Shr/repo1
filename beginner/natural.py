n = int(input())
if n >= 0:
    su = 0
    for x in range(0,n+1):
        su+=x
    print(su) 
else:
    print('Invalid Input')
