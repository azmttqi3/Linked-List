public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        //insert element
        list.insertAtEnd("Budi");
        list.insertAtBeginning("Andi");
        list.insertAtEnd("Citra");
        list.insertAtEnd("Dewi");

        //Print the list
        System.out.println("Linked List after insertions:");
        list.println(); // Expected: Andi -> Budi -> Citra -> Dewi -> null

        //Insert after a spesific node
        Node NodeBudi = list.getNode("Budi");
        if (nodeBudi != null) {
            list.insertAfter(nodeBudi, "Eka");
        }

        //  Print the list after insertAfter
        System.out.println("\nLinked List after inserting Eka after Budi:");
        list.println() // Expected: Andi -> Budi -> Eka -> Citra -> Dewi -> null

        //Delete a node
        list.deleteNode("Citra");

        //Print the list after detetion
        System.out.println("\nLinked List after deleting Citra:");
        list.println(); // Expected: Andi -> Budi -> Eka -> Dewi -> null

        //Deleting a non-existent node
        list.deleteNode("Fajar");

        // Print the list after trying to delete non-existent node
        System.out.println("\nLinked List after trying yo deletie Fajar:");
        list.println(); // Expected: Andi -> Budi -> Eka -> Dewi -> null
    }
}        
