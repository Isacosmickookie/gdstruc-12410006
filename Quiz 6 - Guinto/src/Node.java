public class Node {
    private int data;
    private Node rightChild;
    private Node leftChild;

    public void insert(int value)
    {
        if(value == data)
        {
            return;
        }
        if(value < data)
        {
            if (leftChild== null)
            {
                leftChild = new Node(value);
            }
            else
            {
                leftChild.insert(value);
            }
        }
        else
        {
            if (rightChild== null)
            {
                rightChild = new Node(value);
            }
            else
            {
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder()
    {
        if (leftChild != null)
        {
            leftChild.traverseInOrder();
        }
        System.out.println("Data: " + data);

        if (rightChild != null)
        {
            rightChild.traverseInOrder();
        }
    }

    public void traverseInOrderDescending()
    {
        if (rightChild != null)
        {
            rightChild.traverseInOrderDescending();
        }
        System.out.println("Data: " + data);

        if (leftChild != null)
        {
            leftChild.traverseInOrderDescending();
        }
    }

    public Node getMin() {
        Node min = this;
        while (min.leftChild != null)
        {
            min = min.leftChild;
        }
        return min;
    }

    public Node getMax()
    {
        Node max = this;
        while (max.rightChild != null)
        {
            max = max.rightChild;
        }
        return max;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    public Node get(int value)
    {
        if (value == data)
        {
            return this;
        }
        if(value < data)
        {
            if (leftChild != null)
            {
                return leftChild.get(value);
            }
        }
        else
        {
            if (rightChild != null)
            {
                return leftChild.get(value);
            }
        }
        return null;
    }

    public Node(int _data)
    {
        this.data = _data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
