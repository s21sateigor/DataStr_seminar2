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
    public void add (T newElement, int position) throws Exception{
        //TODO verify if not full

        if(position < 0 || position > elementCounter){
            throw ( new Exception("Wrong position"));
        }

        //add at the beginning
        if(position == 0){
            MyNode<T> newNode = new MyNode<T>(newElement);
            first.setPrevious(newNode);
            newNode.setNext(first);
            first = newNode;
            elementCounter++;
        }

        //add at the ending

        else if(position == elementCounter){
            add(newElement);
        }

        //add in the middle

        else {
            MyNode tempNode = first;
            for(int i = 0; i < position - 1; i++){
                tempNode = tempNode.getNext();
            }

            MyNode tempNode2 = tempNode.getNext();
            MyNode<T> newNode = new MyNode<T>(newElement);

            tempNode.setNext(newNode);
            newNode.setPrevious(tempNode);

            tempNode2.setPrevious(newNode);
            newNode.setNext(tempNode2);

            elementCounter++;
        }
    }

    public void print(){
        MyNode tempNode = first;
        while(tempNode != null){
            System.out.print(tempNode.getElement() + " ");
            tempNode = tempNode.getNext();
        }
        System.out.println();
    }

    public void remove(int position){
        //TODO verify if list is empty
        //TODO verify if position is wrong

        //remove from the beginning

        if(position == 0){
            first = first.getNext();
            first.setPrevious(null);
            elementCounter--;
        }

        //remove from the end
        else if (position == elementCounter - 1){
            last = last.getPrevious();
            last.setNext(null);
            elementCounter--;
        }

        //remove from the middle
        else {
            MyNode tempNode = first;
            for(int i = 0; i < position; i++){
                tempNode = tempNode.getNext();
            }

            MyNode tempNodePrevious = tempNode.getPrevious();
            MyNode tempNodeNext = tempNode.getNext();
            tempNodePrevious.setNext(tempNodeNext);
            tempNodeNext.setPrevious(tempNodePrevious);
            elementCounter--;

        }

    }

}
