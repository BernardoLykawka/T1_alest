/**
 * Além do funcionamento básico de Pilhas e Filas, crie uma classe Utils.java e implemente os
 * métodos a seguir:

 * 1. (0.5 Ponto) Método QueueTAD reverseQueue(QueueTAD f). Este método recebe como
 * parâmetro uma fila e retorna uma nova fila, porém com a ordem dos elementos invertida. A
 * fila original deve permanecer inalterada ao final da operação.

 * 2. (0.5 Ponto) Método StackTAD reverseStack(StackTAD p). Este método recebe como
 * parâmetro uma pilha e retorna uma nova pilha, porém com a ordem dos elementos
 * invertida. A pilha original deve permanecer inalterada ao final da operação.

 * 3. (0.5 Ponto) Método StackTAD queueToStack(QueueTAD f), que recebe uma fila como
 * parâmetro e retorna uma nova pilha contendo os mesmos elementos da fila original
 * (porém não os mesmos nodos). A fila original deve permanecer inalterada ao final da
 * operação.

 * 4. (0.5 Ponto) Método QueueTAD stackToQueue(StackTAD p), que recebe uma pilha como
 * parâmetro e retorna uma nova fila contendo os mesmos elementos da pilha original
 * (porém não os mesmos nodos). A pilha original deve permanecer inalterada ao final da
 * operação.
 */


public class Utils {

    public QueueTAD reverseQueue(QueueTAD f) {
        LinkedStack stack = new LinkedStack();
        LinkedQueue aux = new LinkedQueue();

        for(int i = 0; i < f.size(); i++){
            int element = f.dequeue();
            aux.enqueue(element);
            f.enqueue(element);
        }

        while (!aux.isEmpty()) {
            stack.push(aux.dequeue());
        }

        while (!stack.isEmpty()) {
            aux.enqueue(stack.pop());
        }

        return aux;
    }

    public StackTAD reverseStack(StackTAD p) {
        LinkedQueue queue = new LinkedQueue();
        LinkedStack aux = new LinkedStack();

        int size = p.size();

        for (int i = 0; i < size; i++) {
            int element = p.pop();
            queue.enqueue(element);
            aux.push(element);
        }

        while (!aux.isEmpty()) {
            p.push(aux.pop());
        }

        LinkedStack reversed = new LinkedStack();

        while (!queue.isEmpty()) {
            reversed.push(queue.dequeue());
        }

        return reversed;
    }

    public StackTAD queueToStack(QueueTAD f){
        LinkedStack stack = new LinkedStack();
        LinkedStack aux = new LinkedStack();

        int size = f.size();

        for (int i = 0; i < size; i++) {
            int element = f.dequeue();
            aux.push(element);
            f.enqueue(element);
        }

        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }

        return stack;
    }

    public QueueTAD stackToQueue(StackTAD p){
        LinkedQueue queue = new LinkedQueue();
        LinkedStack aux = new LinkedStack();

        int size = p.size();

        for (int i = 0; i < size; i++) {
            int element = p.pop();
            aux.push(element);
            queue.enqueue(element);
        }

        while (!aux.isEmpty()) {
            p.push(aux.pop());
        }

        return queue;
    }
}
