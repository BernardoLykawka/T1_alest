import java.util.NoSuchElementException;

/**
 * (2 Pontos) Uma classe LinkedStack, contendo uma implementação completa de uma
 * estrutura do tipo Pilha que utilize como estrutura base alguma das classes de Lista
 * Encadeada que implementamos em aula, ou seja, sua classe deve instanciar um objeto
 * do tipo SinglyLinkedList ou DoublyLinkedList e armazenar os valores nesta estrutura
 */

//next aponta pro elemento inferior na pilha
public class LinkedStack implements StackTAD {
    public class Node {
        int element;
        Node next;

        public Node(int element) {
            this.element = element;
            this.next = null;
        }
    }
    private Node head;
    private int count;

    public LinkedStack() {
        this.head = null;
        this.count = 0;
    }
    @Override
    public void push(int element) {
        Node valor = new Node(element);
        if (this.head == null) {
            this.head = valor;
        }else{
            valor.next = this.head;
            this.head = valor;
        }
        this.count++;
    }

    @Override
    public int pop() {
        if (this.head == null) {
            throw new NoSuchElementException();
        }
        Node valor = this.head;
        head = valor.next;
        this.count--;

        return valor.element;
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
        this.head = null;
        count = 0;
    }

    @Override
    public int top() {
        try{
            return head.element;
        }
        catch(NullPointerException e){
            System.out.println("Pilha vazia!!");
        }
        return 0;
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

