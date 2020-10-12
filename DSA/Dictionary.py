# constructors of dictionary
myDict = dict([('Name', 'Amrit'), ('age', 24)])
d1 = {'one': 1, 'two': 2, 'three': 3}
d2 = dict(one=1, two=2, three=3)
print(myDict)
print(d1)
print(d2)
print()

# add and update element in a list
d2['four'] = 4
d2['three'] = 33
print(d2)

# delete an element, all elements or whole list
del(d2['three'])
d1.clear()
del[myDict]
print(d1)
print(d2)
# print(myDict)

# keys and values and items retrival
print(d2.keys())
print(d2.values())
print(d2.items())

# iteration

for k in d2.keys():
    print(k, d2[k])

for v in d2.values():
    print(v)  # key cant be accessed using value

for key, value in d2.items():
    print("%s : %s"q % (key, value))

# checking if present
print(('one', 1) in d2.items())
