# LIST

# construction
x = []
x.append(1)
x.append(2)
print(x)

tuple1 = 1, 2, 3, 4
y = list(tuple1)
print(y)
del(y[1])
print(y)

print(y.pop())
print(len(y))
