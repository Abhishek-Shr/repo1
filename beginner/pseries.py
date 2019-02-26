import math
i,l = list(map(int,input().split()))
def prime(t):
    f = 0
    for x in range(2,int(math.sqrt(t))+1):
        if t%x==0:
            f = 1
            break
    if f == 0:
        print(t,end = ' ')        

for t in range(i+1,l):
    prime(t)
