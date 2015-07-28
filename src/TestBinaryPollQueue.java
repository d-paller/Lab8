
public class TestBinaryPollQueue {

    public static void main(String[] args) {
        BinaryPollQueue q= new BinaryPollQueue();
        q.offer(new MyObject<Character>('c', 2));
        q.offer(new MyObject<Character>('d', 3));
        q.offer(new MyObject<Character>('e', 5));
        q.offer(new MyObject<Character>('f', 1));
        System.out.println("Front Element "+q.peek());
        System.out.println("Removed Highest Priority"+q.priorityPoll());
        System.out.println("Front Element "+q.peek());
        System.out.println("Removed Front"+q.elementPoll());
        System.out.println();
        q.offer(new MyObject<Character>('h', 7));
        q.offer(new MyObject<Character>('j', 4));
        System.out.println("Front Element "+q.peek());
        System.out.println("Removed Front"+q.elementPoll());
        System.out.println("Removed Highest Priority"+q.priorityPoll());
        System.out.println();
    }
}
