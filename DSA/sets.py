# SETS
# => store non-duplicate items
# => very fast access vs list
# => math set operations(union and intersection)
# => sets are unordered

# construction

x = {3, 5, 3, 5}
y = set()
list1 = [2, 3, 4, 5, 3]
z = set(list1)
print(x)
print(y)
print(z)

# functions
x.add('ak')
print(x)

x.remove(3)
print(x)
# pops randomly as sets are unordered
x.pop()
print(x)

y.clear()
print(y)

print('ak' in x)

# maths functions
x = {1, 2, 3, 4, 5}
y = {1, 2, 4, 5, 6}

print(x & y)
print(x | y)
print(x ^ y)
print(x >= y)
print(x <= y)
print(x - y)
