
public class App {

    private Utils u = new Utils();

    public void chamarFila() {
        ArrayQueue queue = new ArrayQueue();

        //FILA
        queue.enqueue(9);
        queue.enqueue(3);           //colocando alguns elementos para depois limpar
        queue.enqueue(5);

        System.out.println(queue);

        System.out.println("limpando fila: ");
        queue.clear();
        System.out.println(queue);

        queue.enqueue(9);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);       //adicionando 8 elementos
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(18);

        System.out.println("Printando fila: ");
        System.out.println(queue);

        System.out.println("A Head é: " + queue.head());

        System.out.println("Colocando mais elementos na fila: ");
        queue.enqueue(6);
        queue.enqueue(4);       //colocando mais elementos para duplicar array
        queue.enqueue(2);
        queue.enqueue(1);

        System.out.println(queue);

        System.out.println("Tamanho da fila: " + queue.size());

        System.out.println("Tirando elementos: ");
        System.out.println("Removendo: " + queue.dequeue());
        System.out.println("Removendo: " + queue.dequeue());       //tirando os 4 primeiros elementos da fila
        System.out.println("Removendo: " + queue.dequeue());
        System.out.println("Removendo: " + queue.dequeue());

        System.out.println(queue);
        System.out.println("A Head é: " + queue.head());
        System.out.println("Tamanho da fila: " + queue.size());

        queue.enqueue(44);
        queue.enqueue(57);               //colocando elementos no final
        queue.enqueue(200);
        queue.enqueue(98);
        System.out.println(queue);

        queue.enqueue(333);
        queue.enqueue(777);             //colocando no final, antes do head, array circular
        queue.enqueue(888);

        System.out.println(queue);

        queue.clear();


        queue.enqueue(9);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);

        System.out.println(queue);

        System.out.println("Removendo: " + queue.dequeue());
        System.out.println("Removendo: " + queue.dequeue());

        System.out.println(queue);

        queue.enqueue(111);
        queue.enqueue(222);
        queue.enqueue(333);
        queue.enqueue(444);
        queue.enqueue(555);
        System.out.println(queue);
    }

    public void chamarPilha() {
        //PILHA
        ArrayStack stack = new ArrayStack();
        System.out.println("\n--------------------------------------\nCriando uma fila: ");

        stack.push(9);
        stack.push(3);
        stack.push(5);
        System.out.println("Tamanho da fila: " + stack.size());

        System.out.println(stack);
        System.out.println("Top da pilha: " + stack.top());

        System.out.println("Tirando da fila: " + stack.pop());
        System.out.println(stack);

        System.out.println("Limpando a pilha: ");
        stack.clear();
        System.out.println(stack);

        System.out.println("Top da pilha: " + stack.top());
        System.out.println("Tamanho da fila: " + stack.size());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);

        System.out.println(stack);
        System.out.println("Top da pilha: " + stack.top());
        System.out.println("Tamanho da fila: " + stack.size());
    }

    public void chamarFilaEncadeada() {
        LinkedQueue lqueue = new LinkedQueue();

        System.out.println("\n-----------------------\nAdicionando na fila encadeada: ");
        lqueue.enqueue(9);
        lqueue.enqueue(3);
        lqueue.enqueue(5);
        lqueue.enqueue(7);
        System.out.println("Head: " + lqueue.head());
        System.out.println("Tamanho: " + lqueue.size());
        System.out.println(lqueue);

        System.out.println("Removendo: " + lqueue.dequeue());
        System.out.println("Removendo: " + lqueue.dequeue());
        System.out.println(lqueue);
        System.out.println("Head: " + lqueue.head());
        System.out.println("Tamanho: " + lqueue.size());

        lqueue.clear();
        System.out.println(lqueue);

        lqueue.enqueue(111);
        lqueue.enqueue(222);
        lqueue.enqueue(333);
        lqueue.enqueue(444);
        System.out.println(lqueue);
        System.out.println("Head: " + lqueue.head());
        System.out.println("Tamanho: " + lqueue.size());

        System.out.println("Removendo: " + lqueue.dequeue());
        System.out.println("Removendo: " + lqueue.dequeue());
        System.out.println(lqueue);
        System.out.println("Head: " + lqueue.head());
        System.out.println("Tamanho: " + lqueue.size());



        System.out.println("Fila revertida: " + u.reverseQueue(lqueue));
        System.out.println("Fila normal: " + lqueue);
        System.out.println("Fila para Pilha: " + u.queueToStack(lqueue));



    }

    public void chamarPilhaEncadeada() {
        //PILHA ENCADEADA
        LinkedStack lstack = new LinkedStack();

        System.out.println("\n-----------------------\nAdicionando na pilha encadeada: ");
        lstack.push(9);
        lstack.push(3);
        lstack.push(5);
        lstack.push(7);
        lstack.push(4);
        lstack.push(2);

        System.out.println(lstack);
        System.out.println("Top da pilha encadeada: " + lstack.top());

        System.out.println("Tirando da pilha encadeada: " + lstack.top());
        lstack.pop();
        System.out.println(lstack);
        System.out.println("Top da pilha encadeada: " + lstack.top());

        System.out.println("Limpando a pilha encadeada: ");
        lstack.clear();
        System.out.println("Top da pilha encadeada: " + lstack.top());
        System.out.println(lstack);

        System.out.println("Adicionando na pilha encadeada: ");
        lstack.push(9);
        lstack.push(3);
        lstack.push(5);
        System.out.println("Top da pilha encadeada: " + lstack.top());
        System.out.println(lstack);

        System.out.println("Pilha revertida: "+ u.reverseStack(lstack));
        System.out.println("Pilha normal: "+ lstack);
        System.out.println("Pilha para fila: " + u.stackToQueue(lstack));

    }
}
