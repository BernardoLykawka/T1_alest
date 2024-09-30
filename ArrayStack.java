
/**
 * (2 Pontos) Uma classe ArrayStack, contendo uma implementação completa de uma
 * estrutura do tipo Pilha que utilize apenas arrays. A sua implementação NÃO DEVE utilizar
 * ListArrays.
 * a. O tamanho inicial padrão do array deve ser 8.
 * b. A implementação deve garantir que o usuário possa utilizar a estrutura tendo mais
 * do que 8 elementos (sem que seja necessário que o usuário gerencie isso).
 */

public class ArrayStack implements StackTAD {

private int[] array;
private int top;
private int count;
private int tam;


    public ArrayStack() {
        tam = 8;
        array = new int[8];
        count = 0;
        top = -1;
    }


    @Override
    public void push(int element) {
        if (count == tam) {
            setCapacity(tam * 2);
        }


        array[count] = element;
        top = count;
        count++;
    }

    @Override
    public int pop() {
        int anterior = top;
        array[top] = 0;
        top = top - 1;
        count --;
        return anterior;
    }

    @Override
    public int size(){
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count==0;
    }

    @Override
    public void clear() {
        count = 0;
        tam = 8;
        array = new int[8];
        top = -1;
    }

    @Override
    public int top() {
        try {
            return array[top];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A pilha está vazia");
        }
        return -1;
    }

    private void setCapacity(int capacity) {
        int[] newArray = new int[capacity];

        for(int i = 0; i < tam; i++){
            newArray[i] = array[i];
        }

        array = newArray;
        tam = array.length;
    }

    public String toString() {

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
