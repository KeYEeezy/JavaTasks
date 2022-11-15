package com.javaTasks.jb;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringsLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {

        Node node = new Node(); // создали новый объект
        node.value = value; // присвоили значение его переменной
        // и дальше что то непонятное, я добавил объект - first.next = node; last.prev = node;
        //node.prev = first; node.next = last;
        // мы имеем две заглушки внутри которых ссылки на новую ноду и новую ноду у которой ссылки на заглушки.
        // а что ниже я вообще не понимаю:(
        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
