n = int(input())
if n < 100001 and n > 0:
    li = list(map(int,input().split()))
    l = []
    for x in range(0,len(li)):
        if li.count(li[x]) > 1:
            l.append(li[x])
    if l == []:
        print('unique')
    else:  
        print(sorted(set(l)))  
else:
    print('Invalid Input')      
