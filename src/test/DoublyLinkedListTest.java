
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

  @Test
  void longestSequence1() {
    DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(3);
    assertEquals(2, list.longestSequence());
  }

  @Test
  void longestSequence2() {
    DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    assertEquals(1, list.longestSequence());
  }
  @Test
  void longestSequence3() {
    DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    assertEquals(0, list.longestSequence());
  }
  @Test
  void longestSequence4() {
    DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(4);
    list.add(3);
    list.add(3);
    list.add(3);
    list.add(4);
    assertEquals(3, list.longestSequence());
  }
  @Test
  void longestSequence5() {
    DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(3);
    list.add(3);
    list.add(3);
    list.add(3);
    assertEquals(4, list.longestSequence());
  }
  @Test
  void longestSequence6() {
    DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    list.add(3);
    list.add(3);
    list.add(3);
    list.add(3);
    assertEquals(4, list.longestSequence());
  }
}