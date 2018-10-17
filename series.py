i,l = list(map(int,input().split()))
if i < 100001 and l < 100001:
    if i%2 == 0:
        for x in range(i+1,l,2):
            print(x)
    else:
        for x in range(i+2,l,2):
            print(x)            
else:
    print('Invalid Input') 
