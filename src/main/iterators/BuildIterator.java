package iterators;
/* Hinweise zu dieser Aufgabe
 *
 * Uebersicht:
 * [10 Punkte] Implementieren Sie eine passende innere Klasse in der Klasse  BuildIterator.
 * Die erwarteten Eigenschaften der Klasse finden Sie als Kommentar in der Klasse  BuildIterator.
 */

import java.util.Iterator;

public class BuildIterator<T> implements Iterable<T> {
  private Iterable<T> part1, part2;

  public BuildIterator(Iterable<T> p1, Iterable<T> p2) {
    part1 = p1;
    part2 = p2;
  }

  public Iterator<T> iterator() {
    return new AllPartsIterator();
  }

  /* Aufgabe:
   * Vervollstaendigen Sie die Klasse  AllPartsIterator  derart,
   * dass der Iterator zuerst jeden der Inhalte  aus  part1  und anschliessend
   * jeden der Inhalte aus  part2  zurueckgibt. Falls keine weiteren Inhalte
   * vorhanden sind, soll  next  den Wert  null  zurueckgeben.
   */


  private class AllPartsIterator implements Iterator<T> {
    @Override
    public boolean hasNext() {
      return false;
    }

    @Override
    public T next() {
      return null;
    }
    //TODO Add implementation here
  }

}

