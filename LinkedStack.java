import java.util.NoSuchElementException;

/**
 * (2 Pontos) Uma classe LinkedStack, contendo uma implementação completa de uma
 * estrutura do tipo Pilha que utilize como estrutura base alguma das classes de Lista
 * Encadeada que implementamos em aula, ou seja, sua classe deve instanciar um objeto
 * do tipo SinglyLinkedList ou DoublyLinkedList e armazenar os valores nesta estrutura
 */
class Node {
    int element;
    Node next;

    public Node(int element) {
        this.element = element;
        this.next = null;
    }
}
//next aponta pro elemento inferior na pilha
public class LinkedStack implements StackTAD {
    private Node topo;
    private int count;

    public LinkedStack() {
        this.topo = null;
        this.count = 0;
    }
    @Override
    public void push(int element) {
        Node valor = new Node(element);
        if (this.topo == null) {
            this.topo = valor;
        }else{
            valor.next = this.topo;
            this.topo = valor;
        }
        this.count++;
    }

    @Override
    public int pop() {
        if (this.topo == null) {
            throw new NoSuchElementException();
        }
        Node valor = this.topo;
        topo = valor.next;
        this.count--;

        return valor.element;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count==0;
    }

    @Override
    public void clear() {
        this.topo = null;
        count = 0;
    }

    @Override
    public int top() {
        return topo.element;
    }
}
