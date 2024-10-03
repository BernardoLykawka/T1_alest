/**
 * (2 Pontos) Uma classe ArrayQueue, contendo uma implementação completa de uma
 * estrutura do tipo Fila que utilize apenas arrays. A sua implementação NÃO DEVE utilizar
 * ListArrays.
 *
 * a. (0.5 de 2) O tamanho inicial padrão do array deve ser 8.
 *
 * b. (0.5 de 2) A implementação deve garantir que o usuário possa utilizar a estrutura
 * tendo mais do que 8 elementos (sem que seja necessário que o usuário gerencie
 * isso).
 *
 * c. (1 de 2) A implementação do método dequeue() deve garantir que o custo seja
 * O(1), ou seja, constante. Para isto, o custo do método enqueue() não deve ser
 * alterado (continua também sendo O(1) a menos que precise aumentar o array)
 */



public class ArrayQueue implements QueueTAD{
    private int[] array;
    private int count;
    private int head;
    private int tam;

    public ArrayQueue() {
        tam = 8;
        array = new int[tam];
        count = 0;
        head = 0;
    }

    @Override
    public void enqueue(int element) {
        if(count == tam){
            setCapacity(tam * 2);
        }

        array[(count+head) % tam] = element;
        count++;
    }

    @Override
    public int dequeue() {
        int anterior = array[head];
        array[head] = 0;
        head = (head + 1) % tam;

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
    public void clear(){
        tam = 8;
        array = new int[tam];
        count = 0;
        head = 0;
    }

    @Override
    public int head() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia!");
        }
        return array[head];
    }

    private void setCapacity(int capacity) {
        int[] newArray = new int[capacity];

        for(int i = 0; i < tam; i++){
            newArray[i] = array[i];
        }

        array = newArray;
        tam = array.length;
    }

    @Override
    public String toString(){
        if(count == 0){
            return "A fila está vazia";
        }

        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int i=0; i<array.length; i++){
            str.append(array[i]);
            str.append(" ");
        }
        str.append("]");
        return str.toString();
    }

}
