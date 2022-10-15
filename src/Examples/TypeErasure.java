package Examples;

public class TypeErasure {

    public class Node<T> {
        public T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }
        // ...
    }

    // TypeErasure : Removes all the Generic type code in byte code and adds casting if required/nessary.
    public class Node {

        private Object data;
        private Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return data;
        }
        // ...
    }
}
