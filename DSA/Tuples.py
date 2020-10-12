# TUPLES
# => immutable
# => but the element objects can be mutable
# => sequence type
# => faster than lists

x = (1, 2, 'xyz', '3')
print(x)

y = 1,
print(y)

z = 1, 2, 3
print(z)

a = (1)  # not recognized  as tuple to make a tuple a comma must be there
print(a)

list1 = [1, 2, 3, 4, 5]
b = tuple(list1)
print(b)

c = ([1, 2, 3, 4], 5, 6)
print(c)
del(c[0][0])
print(c)
