package dataStr;

public class MyLinkedList<T>
{
    private MyNode first = null;
    private MyNode last = null;
    private int elementCounter = 0;

    public void add(T newElement){
        if(elementCounter == 0) {
            MyNode<T> newNode = new MyNode<T>(newElement);
            first = newNode;
            last = newNode;
            elementCounter++;
        } else {
            MyNode<T> newNode = new MyNode<T>(newElement);
            last.setNext(newNode);
            newNode.setPrevious(last);
            last = newNode;
            elementCounter++;
        }
    }

}
