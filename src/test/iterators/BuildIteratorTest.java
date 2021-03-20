package iterators;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class BuildIteratorTest {

  @org.junit.jupiter.api.Test
  void iterator1() {
    ArrayList<Integer> part1 = new ArrayList<>();
    part1.add(1);
    part1.add(2);

    ArrayList<Integer> part2 = new ArrayList<>();
    part2.add(3);
    part2.add(4);

    BuildIterator<Integer> bi = new BuildIterator<>(part1, part2);
    Iterator<Integer> itr = bi.iterator();

    assertTrue(itr.hasNext());
    assertEquals(1, itr.next());
    assertTrue(itr.hasNext());
    assertEquals(2, itr.next());
    assertTrue(itr.hasNext());
    assertEquals(3, itr.next());
    assertTrue(itr.hasNext());
    assertEquals(4, itr.next());
    assertTrue(itr.hasNext());
    assertNull(itr.next());
    assertTrue(itr.hasNext());
    assertNull(itr.next());
  }
}