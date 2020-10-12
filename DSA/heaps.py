class MaxHeap:
    def __init__(self, items=[]):
        super().__init__()
        self.heap = [0]
        for item in items:
            self.heap.append(item)
            self.__floatup(len(self.heap) - 1)

    def push(self, item):
        self.heap.append(item)
        self.__floatup(len(self.heap) - 1)

    def peek(self):
        if self.heap[1]:
            return self.heap[1]
        else:
            return False

    def pop(self):   # TODO pops the root of the heap
        if len(self.heap) < 2:
            max = False
        elif len(self.heap) == 2:
            max = self.heap.pop()
        else:
            self.__swap(1, len(self.heap)-1)
            max = self.heap.pop()
            self.__bubbleDown(1)
        return max

    def __swap(self, i, j):  # TODO swap the elements in index i and j
        self.heap[i], self.heap[j] = self.heap[j], self.heap[i]

    def __floatup(self, index):
        parent = index // 2

        if index < 2:
            return
        elif self.heap[index] > self.heap[parent]:
            self.__swap(index, parent)
            self.__floatup(parent)

    def __bubbleDown(self, index):
        left = 2*index
        right = 2*index + 1

        largest = index

        if len(self.heap) > left and self.heap[largest] < self.heap[left]:
            largest = left
        if len(self.heap) > right and self.heap[largest] < self.heap[right]:
            largest = right

        if largest != index:
            self.__swap(index, largest)
            self.__bubbleDown(largest)

    def __str__(self):
        return str(self.heap)


m = MaxHeap([95, 3, 21])
print(m)
m.push(100)
m.push(10)
print(m)
print(m.pop())
print(m.peek())
print(m)
