class Node:
    def __init__(self, d, n=None, p=None):
        self.data = d
        self.next_node = n
        self.prev_node = p

    def __str__(self):
        return "( %s )" % str(self.data)


class LinkedList:
    def __init__(self, r=None):
        self.root = r
        self.size = 0

    def add(self, d):
        newNode = Node(d, self.root)
        self.root = newNode
        self.size += 1

    def find(self, d):
        this_node = self.root
        while this_node is not None:
            if this_node.data == d:
                return (str(d) + " exists")
            else:
                this_node = this_node.next_node
        return str(d) + " doesnt exist"

    def remove(self, d):
        this_node = self.root
        prev_node = None

        while this_node is not None:
            if this_node.data == d:
                if prev_node is not None:
                    prev_node.next_node = this_node.next_node
                else:
                    self.root = this_node.next_node
                self.size -= 1
                return True
            else:
                prev_node = this_node
                this_node = this_node.next_node
        return False

    def print_list(self):
        this_node = self.root
        while this_node is not None:
            print(this_node, end='=>')
            this_node = this_node.next_node
        print('None')


myList = LinkedList()
myList.add(5)
myList.add(6)
myList.add(7)
myList.add(3)
myList.print_list()
print("Size : %d" % myList.size)
myList.remove(8)
print(myList.find(00))
print(myList.root)
