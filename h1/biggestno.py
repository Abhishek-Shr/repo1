n = int(input())
li = list(map(int,input().split()))
if n <100001 and n > 0 :
    # if li == [0]*len(li):
    if all([v == 0 for v in li]):
        print('0')                
    else:
        s = ''.join(map(str,sorted(li,reverse = True)))
        print(s)
