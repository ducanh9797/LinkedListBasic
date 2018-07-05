public class LinkListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkList linkList = new MyLinkList(10);
        linkList.add(11, 10);
        linkList.add(12, 11);
        linkList.add(13, 12);

        linkList.add(4, 9);
        linkList.add(4, 9);
        linkList.printList();
    }
}
