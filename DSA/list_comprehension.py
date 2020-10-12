
under_10 = [x for x in range(10)]
print(under_10)

square = [x**2 for x in range(10)]
print(square)

get_even = [x for x in range(10) if x % 2 == 0]
print(get_even)

get_multiple = [x*10 for x in range(11)]
print(get_multiple)

s = "This is real job i have 2 maintain 34 times this shouldnt last 8"
nums = [x for x in s if x.isnumeric()]
print('nums : ' + ''.join(nums))

names = ['cosmo', 'pedro', 'Anu', 'Ray']
idx = [k for k, v in enumerate(names) if v == 'Anu']
print(idx[0])

letters = [x for x in 'ABCDEF']
ltrs = [x for x in letters if x != 'F']
print(letters, ltrs)

nums = [5, 4, 35, 4, 34, 43, 44]
new_list = [x if x % 2 == 0 else x*10 for x in nums]
print(new_list)
