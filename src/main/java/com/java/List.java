package com.java;

import java.util.Objects;

public class List<T> {

  public boolean isEquals(List<T> list) {
    Node currentHead = head;
    Node givenHead = list.head;

    if (size != givenHead.getSize()) {
      return false;
    }

    return checkIfListsAreEqual(currentHead, givenHead);
  }

  private boolean checkIfListsAreEqual(Node currentHead, Node givenHead) {
    while (currentHead != null) {
      if (!Objects.equals(currentHead.data, givenHead.data)) {
        return false;
      }
      currentHead = currentHead.next;
      givenHead = givenHead.next;
    }
    return true;
  }

  public int getSize() {
    return size;
  }

  protected Node getHead() {
    return head;
  }

  protected class Node {
    Node next;
    T data;

    public int getSize() {
      return size;
    }
  }

  private Node head;
  private Node tail;
  int size = 0;

  public boolean isEmpty() {
    return head == null;
  }

  public void insert(T data) {
    Node newNode = new Node();
    newNode.data = data;

    if (this.isEmpty()) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = tail.next;
    }
    size++;
  }
}
