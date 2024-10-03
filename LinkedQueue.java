import java.util.NoSuchElementException;

/**
 * (2 Pontos) Uma classe LinkedQueue, contendo uma implementação completa de uma
 * estrutura do tipo Fila que utilize como estrutura base alguma das classes de Lista
 * Encadeada que implementamos em aula, ou seja, sua classe deve instanciar um objeto
 * do tipo SinglyLinkedList ou DoublyLinkedList e armazenar os valores nesta estrutura.
 */


public class LinkedQueue implements QueueTAD {

    public class Node {
        int element;
        Node next;

        public Node(int element) {
            this.element = element;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private int count;

    public LinkedQueue() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    @Override
    public void enqueue(int element) {
        Node valor = new Node(element);
        if (head == null) {
            head = valor;
            tail = valor;
            count++;
            return;
        }

        tail.next = valor;
        tail = tail.next;

        count++;
    }

    @Override
    public int dequeue() {

        if(isEmpty()){
            throw new NoSuchElementException();
        }

        int anterior = head.element;

        if (head == tail) {
            head = null;
            tail = null;

            count--;
            return anterior;
        }

        head = head.next;

        count--;
        return anterior;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    @Override
    public int head() {
        return head.element;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("[ ");
        Node n = head;
        while(n != null){
            sb.append(n.element).append(" ");
            n = n.next;
        }

        sb.append(" ]");
        return sb.toString();
    }
}
