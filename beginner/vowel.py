n = input('')
li = ['a','e','i','o','u','A','E','I','O','U']
if n.isalpha():
    if n in li:
        print('Vowel')
    else:
        print('Consonent')
else:
    print('invalid')
