
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTreeTest {

  @Test
  void checkEmptyTree() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    assertEquals(0, tree.checkTree());
  }

  @Test
  void checkLeaf() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    tree.add(1);
    assertEquals(1, tree.checkTree());
  }

  @Test
  void checkTree1() {
    //      0
    //       \
    //        1
    //         \
    //          2
    //           \
    //            3
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    tree.add(0);
    tree.add(1);
    tree.add(2);
    tree.add(3);
    assertEquals(-1, tree.checkTree());
  }

  @Test
  void checkTree2() {
    //      2
    //     / \
    //    0   3
    //     \
    //      1
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.add(2);
    tree.add(0);
    tree.add(1);
    tree.add(3);
    assertEquals(3, tree.checkTree());
  }

  @Test
  void checkTree3() {

    //              11
    //           /      \
    //          7        21
    //        /   \     /  \
    //       5     9   15  25
    //      /     / \
    //     4     8  10
    //    /
    //   3
    //  /
    // 2

    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.add(11);
    tree.add(7);
    tree.add(21);
    tree.add(9);
    tree.add(5);
    tree.add(15);
    tree.add(25);
    tree.add(4);
    tree.add(6);
    tree.add(8);
    tree.add(10);
    tree.add(3);
    tree.add(2);
    assertEquals(-1, tree.checkTree());
  }
}