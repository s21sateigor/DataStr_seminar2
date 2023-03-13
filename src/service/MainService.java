package service;

import dataStr.MyLinkedList;

public class MainService
{
    public static void main(String[] args) {
        try {

            MyLinkedList<String> stringList = new MyLinkedList<>();
            System.out.println("Add");
            stringList.add("Igors");
            stringList.add("Jānis");
            stringList.print();
            stringList.add("Jana", 0);
            stringList.print();
            stringList.add("Līga", 2);
            stringList.print();
            System.out.println("---------------");
            System.out.println("Remove");
            stringList.remove(0);
            stringList.print();
            stringList.remove(1);
            stringList.print();
            stringList.remove(1);
            stringList.print();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
