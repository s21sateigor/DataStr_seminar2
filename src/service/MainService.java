package service;

import dataStr.MyLinkedList;

public class MainService
{
    public static void main(String[] args) {
        try {

            MyLinkedList<String> stringList = new MyLinkedList<>();
            stringList.add("Igors");
            stringList.add("Jānis");
            stringList.print();
            stringList.add("Jana", 0);
            stringList.print();
            stringList.add("Līga", 2);
            stringList.print();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
