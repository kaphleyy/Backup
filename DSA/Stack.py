class ack:
    def __init__(self):
        self.stack = list()

    def push(self, item):
        self.stack.append(item)

    def peek(self):
        return self.stack[len(self.stack) - 1]

    def pop(self):
        return self.stack.pop()

    def __str__(self):
        return str(self.stack)


my_stack = ack()
my_stack.push(1)
my_stack.push(2)
my_stack.push(3)
my_stack.push(4)
print(my_stack)
print(my_stack.pop())
print(my_stack.peek())
print((str(my_stack)))
print(type(str(my_stack)))
