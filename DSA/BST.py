#                          BST operations
# . Insert
# . find
# . delete
# . get_size
# . traversals

# Insert
# . start at root
# . Always insert as a leaf

# Find
# . start at root
# . return the data if found else return False

# Delete
#   => 3 possiblities ../1/ leaf node ../2/ single child ../3/ double child

#   ../1/
#   . just delete the leaf node

#   ../2/
#   . promote the child node in the target node's position

#   ../3/
#   . promote highest node of left subtree or lowest node of right subtree
#     in the target node's position

# Get_size
# . returns no of nodes
# . size = 1 + size(left subtree) + size(right subtree)

# preorder traversal
# . visit root before visiting the root subtree

# inorder traversal
# . visit root between visiting the root subtree

# Advantage of BST
# . Insert , delete , find in O(logn)
# . In a balanced BST with 10,000,000 nodes takes 30 comparisons
class Tree:
    def __init__(self, data, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right

    def insert(self, data):
        if self.data == data:
            return False  # duplicate value
        elif self.data > data:
            if self.left is not None:
                return self.left.insert(data)
            else:
                self.left = Tree(data)
                return True
        else:
            if self.right is not None:
                return self.right.insert(data)
            else:
                self.right = Tree(data)
                return True

    def find(self, data):
        if self.data == data:
            return str(data) + " exists"
        elif self.data > data:
            if self.left is None:
                return str(data) + " doesnot exist"
            else:
                return self.left.find(data)
        else:
            if self.right is None:
                return str(data) + " doesnot exist"
            else:
                return self.right.find(data)

    def get_size(self):
        if self.left is not None and self.right is not None:
            return 1 + self.left.get_size() + self.right.get_size()
        elif self.left:
            return 1 + self.left.get_size()
        elif self.right:
            return 1 + self.right.get_size()
        else:
            return 1

    def preorder(self):
        if self is not None:
            print(self.data, end=',')
            if self.left is not None:
                self.left.preorder()
            if self.right:
                self.right.preorder()

    def inorder(self):
        if self is not None:
            if self.left is not None:
                self.left.inorder()
            print(self.data, end=',')
            if self.right is not None:
                self.right.inorder()


# test code
tree = Tree(7)
tree.insert(9)
for i in [15, 204, 44, 654, 54, 43, 5, 4, 4545, 54, 5, 4, 443, 453, 43, 43, 64, 65, 1, 4, 6, 8, 14]:
    tree.insert(i)

for i in range(20):
    print(tree.find(i), end=' ,,, ')

print('\n', "size : ", tree.get_size())

tree.preorder()
print()
tree.inorder()
print()
