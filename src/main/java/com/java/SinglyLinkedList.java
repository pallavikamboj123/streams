package com.java;

public class SinglyLinkedList<T> {

  private class Node {
    Node next;
    T data;
  }

  private Node head;
  private Node tail;
  int size = 0;
  public boolean isEmpty() {
    return head == null;
  }
  public int insert(T data) {
    Node newNode = new Node();
    newNode.data = data;

    if(this.isEmpty()) {
      head = newNode;
      tail = newNode;
    }
    else {
      tail.next = newNode;
      tail = tail.next;
    }
    size++;

    return size;
  }
}
