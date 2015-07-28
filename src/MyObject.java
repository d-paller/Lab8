
/* Do not change anything in this class */

public class MyObject<E> implements Comparable {

    private E element;
    private int priority;

    public MyObject(E e, int p) {
        element = e;
        priority = p;
    }

    @Override
    public String toString() {
        return (" <"+element.toString()+","+ priority+"> ");
    }

    public int compareTo(Object o) {
        if (priority > ((MyObject) o).priority) {
            return 1;
        } else if (priority < ((MyObject) o).priority) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean equal(Object o){
        return priority == ((MyObject) o).priority;
    }
}
