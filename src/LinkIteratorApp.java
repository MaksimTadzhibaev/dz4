public class LinkIteratorApp <E> {
    public static void main(String[] args) {
        LinkedList <Integer> list = new SimpleLinkedListImpl <>();

        list.insertFirst(1);
        list.insertFirst(3);
        list.insertFirst(5);

        System.out.println("-----------");
        list.display();
        System.out.println("-----------");
        IteratorList<Integer> iter = (IteratorList<Integer>) list.iterator();
        iter.reset();
        iter.insertAfter(4);
        list.display();
        System.out.println("-----------");
        iter.next();
        iter.insertAfter(2);
        list.display();
        System.out.println("-----------");
        iter.remove();
        list.display();
        System.out.println("-----------");
        iter.insertBefore(2);
        list.display();
        System.out.println("-----------");
        iterAll(list);
    }

    private static void iterAll(LinkedList<Integer> list) {
        for (Integer value : list) {
            System.out.print(value);
        }
    }


}