package com.java;

public class SinglyLinkedList<T> {
  private class Node {
    Node next;
    T data;
  }

  private Node head;
  public boolean isEmpty() {
    return head == null;
  }
}
