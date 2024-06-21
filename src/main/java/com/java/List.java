package com.java;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

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

  protected <R> List<R> map(Function<T, R> function) {
    Node current = head;
    List<R> result = new List<>();

    while (current != null) {
      result.insert(function.apply(current.data));
      current = current.next;
    }

    return result;
  }

  protected List<T> filter(Function<T, Boolean> function) {
    Node current = head;
    List<T> result = new List<>();

    while (current != null) {
      if (function.apply(current.data)) {
        result.insert(current.data);
      }
      current = current.next;
    }
    return result;
  }

  protected<R> R reduce(R initialValue, BiFunction<R, T, R> function) {
    Node current = head;
    R result = initialValue;
    while (current != null) {
      result = function.apply(result, current.data);
      current = current.next;
    }
    return result;
  }

  private class Node {
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
