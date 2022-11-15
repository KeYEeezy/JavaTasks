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

        Node node = new Node(); //создаю новый объект ноды
        node.value = value; // записываю в нее значение
        // и дальше происходит то чего я не понимаю, выше есть конструктор который присваевает ссылки
        // первая нода знает что следующая это последняя нода, а последняя нода знает что предыдущая это первая.
        // итак допустим....
        // в пустой лист где есть две заглушки я добавляю новый эелемент
        // у загулшек должны поменяться ссылки first.next = node; last.prev = node;
        // но что происходит внизу я не понимаю....
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
