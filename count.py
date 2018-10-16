n = input()
if n.isnumeric():
    n = int(n)
    c = 0
    while n!=0:
        n = n//10
        c+=1
    print(c)   
else:
    print('Invalid Input')
