n = int(input())
li = list(map(int,input().split()))
if n <100001 and n > 0 :    
    s = ' '.join(map(str,sorted(li,reverse = True)))
    print(s)
