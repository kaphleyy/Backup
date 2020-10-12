from collections import deque


class queue:
    def __init__(self):
        super().__init__()
        self.queue = deque()

    def enqueue(self, item):
        self.queue.append(item)

    def dequeue(self):
        if len(self.queue) == 0:
            return None
        else:
            return self.queue.popleft()

    def __str__(self):
        return str(self.queue)


my_queue = queue()
my_queue.enqueue(1)
my_queue.enqueue(2)
my_queue.enqueue(3)
my_queue.enqueue(4)
print(my_queue.dequeue())
print(my_queue)
