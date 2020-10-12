// class Node<T> {

// private T data;
// private Node<T> left;
// private Node<T> right;

// public Node() {
// }

// public Node(T value) {
// this.data = value;
// }

// public T getData() {
// return data;
// }

// public void setData(T data) {
// this.data = data;
// }

// public Node<T> getLeft() {
// return left;
// }

// public void setLeft(Node<T> left) {
// this.left = left;
// }

// public Node<T> getRight() {
// return right;
// }

// public void setRight(Node<T> right) {
// this.right = right;
// }
// }

// public class BinaryTreeI<T> extends Node {

// private Node<T> rootNode;

// public Node<T> getRootNode() {
// return rootNode;
// }

// public void setRootNode(Node<T> rootNode) {
// this.rootNode = rootNode;
// }

// public static void traverseInOrder(Node node) {

// if (node.getLeft() != null) {
// traverseInOrder(node.getLeft());
// }

// System.out.print(node.getData() + " ");

// if (node.getRight() != null) {
// traverseInOrder(node.getRight());
// }
// }

// public static void traversePreOrder(Node node) {

// System.out.print(node.getData() + " ");

// if (node.getLeft() != null) {
// traversePreOrder(node.getLeft());
// }

// if (node.getRight() != null) {
// traversePreOrder(node.getRight());
// }
// }

// public static void traversePostOrder(Node node) {

// if (node.getLeft() != null) {
// traversePostOrder(node.getLeft());
// }

// if (node.getRight() != null) {
// traversePostOrder(node.getRight());
// }

// System.out.print(node.getData() + " ");
// }

// public static void main(String[] args) {
// BinaryTree<Integer> binaryTree = new BinaryTree<>();
// Node<Integer> rootNode = new Node<>(1);
// binaryTree.setRootNode(rootNode);
// binaryTree.getRootNode().setLeft(new Node<>(2));
// binaryTree.getRootNode().setRight(new Node<>(3));
// binaryTree.getRootNode().getLeft().setLeft(new Node<>(4));
// binaryTree.getRootNode().getLeft().setRight(new Node<>(5));

// binaryTree.getRootNode().getRight().setLeft(new Node<>(6));
// binaryTree.getRootNode().getRight().setRight(new Node<>(7));
// System.out.println("Pre order traversing:");
// BinaryTree.traversePreOrder(binaryTree.getRootNode());
// System.out.println();

// System.out.println("In order traversing:");
// BinaryTree.traverseInOrder(binaryTree.getRootNode());
// System.out.println();

// System.out.println("Post order traversing:");
// BinaryTree.traversePostOrder(binaryTree.getRootNode());
// System.out.println();
// }
// }
