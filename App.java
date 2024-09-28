public class App{
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
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
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());        //tirando os 4 primeiros elementos da fila
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


        System.out.println(queue);
        System.out.println("A Head é: "+queue.head());
        System.out.println("Tamanho da fila: " + queue.size());

        queue.enqueue(44);
        queue.enqueue(57);               //colocando elementos no final
        queue.enqueue(200);
        queue.enqueue(98);
        System.out.println(queue);


        queue.enqueue(333);
        queue.enqueue(777);             //colocando no final, antes do head, array circular
        queue.enqueue(888);             //ARRUMAR

    }
}
