package resources.dataStructures.nonlinear;

// Simple Node class for a Binary Search Tree (BST)
public class Node {
    int data; // Node value
    Node left, right; // Left and Right children

    // Node constructor initializes the node with data and null children
    public Node(int data) {
        this.data = data; // Give 
        left = right = null; // Children initially start at null
    }
}