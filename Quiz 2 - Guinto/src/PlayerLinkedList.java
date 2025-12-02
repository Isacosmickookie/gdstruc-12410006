public class PlayerLinkedList {
    private PlayerNode head;
    private int size;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;

        size++;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.println("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public PlayerNode removeFront() {
        PlayerNode removedNode = head;
        head = head.getNextPlayer();
        size--;
        removedNode.setNextPlayer(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean contains(Player player) {
        PlayerNode current = head;

        while (current != null) {
            if (player.equals(current.getPlayer())) {
                return true;
            }
            current = current.getNextPlayer();
        }
        return false;
    }

    public int indexOf(Player player) {
        PlayerNode current = head;

        int index = 0;

        while (current != null) {
            if (player.equals(current.getPlayer())) {
                return index;
            }
            current = current.getNextPlayer();
            index++;
        }
        return -1;
    }
}
