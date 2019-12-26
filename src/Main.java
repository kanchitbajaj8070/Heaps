public class Main {
    public static void main(String[] args) {
        BinaryHeap heap= new BinaryHeap();
        heap.insert(5);
        heap.insert(10);

        heap.insert(11);
        heap.insert(3);
        heap.insert(1);
        System.out.println(heap.remove());
        System.out.println(heap.remove());
    }
}
