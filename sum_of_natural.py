N,K = list(map(int,input().split()))
li = list(map(int,input().split()))
if K <= N:
    print(sum(li[:K]))
else:
    print('Invalid Input') 
