/* Hinweise zu dieser Aufgabe

   Aufgabenuebersicht:
   [10 Punkte] Ergaenzen Sie die aus der Vorlesung bekannte Klasse  DoublyLinkedList<T> um die Methode  longestSequence.
   Die erwartete Funktionalitaet der Methode finden Sie als Kommentar in der Klasse  DoublyLinkedList.
   Bei der Implementierung der geforderten Methode duerfen nur der Konstruktor und die Methoden
   getContent, isEmpty und size und die Klasse Element vorausgesetzt und genutzt werden.

   Weitere Methoden sind im Code enthalten, aber auskommentiert. Diese koennen Sie bei Bedarf zum Testen
   verwenden.

   [5 Punkte] Erklaeren Sie zusaetzlich den Ihrer Implementierung der Methode  longestSequence()
   zugrundeliegenden Algorithmus durch eine kurze textuelle Beschreibung.

*/


public class DoublyLinkedList<T> {
  private Element first, last;
  private int size;

/* Aufgabe:
   Vervollstaendigen Sie die Methode  longestSequence.
   Die Methode  int longestSequence()  soll  die Laenge der laengsten Teilfolge von unmittelbar aufeinander
   folgenden gleichen Inhalten zurueckgeben. Der Vergleich der Inhalte soll mit der Methode  equals
   erfolgen. Fuer eine leere Liste soll der Wert  0  zurueckgegeben werden.
*/

  int longestSequence() {
    // --- bitte hier ergaenzen ---
  }


  /* --- hier bitte Beschreibung ergaenzen ---




   */


  public DoublyLinkedList() {
    first = last = null;
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

/* Hinweis:
   Die folgenden, in der Vorlesung vorgestellten Methoden duerfen
   NICHT bei der Loesung der Aufgabe benutzt werden.
*/

  public void add(T content) {
    Element e = new Element(content);
    if (isEmpty()) {
      first = last = e;
    } else {
      last.connectAsSucc(e);
      last = e;
    }
    size++;
  }

  public void addFirst(T content) {
    Element e = new Element(content);
    if (isEmpty()) {
      first = last = e;
    } else {
      first.connectAsPred(e);
      first = e;
    }
    size++;
  }

  public T getFirst() {
    if (!isEmpty()) {
      return first.getContent();
    } else {
      throw new IllegalStateException();
    }
  }

  public T get(int index) {
    if (index >= 0 && index < size) {
      Element current = first;
      for (int i = 0; i < index; i++) {
        current = current.getSucc();
      }
      return current.getContent();
    } else {
      throw new IllegalStateException();
    }
  }

  public T removeFirst() {
    if (!isEmpty()) {
      T result = first.getContent();
      if (first.hasSucc()) {
        first = first.getSucc();
        first.disconnectPred();
      } else {
        first = last = null;
      }
      size--;
      return result;
    } else {
      throw new IllegalStateException();
    }
  }

  public void showAll() {
    Element current = first;
    while (current != null) {
      System.out.print(current.getContent().toString());
      if (current != last) {
        System.out.print(", ");
      }
      current = current.getSucc();
    }
    System.out.println();
  }


  // Element

  private class Element {
    private T content;
    private Element pred, succ;

    public Element(T c) {
      content = c;
      pred = succ = null;
    }

    public T getContent() {
      return content;
    }

    public void setContent(T c) {
      content = c;
    }

    public boolean hasSucc() {
      return succ != null;
    }

    public Element getSucc() {
      return succ;
    }

    public void disconnectSucc() {
      if (hasSucc()) {
        succ.pred = null;
        succ = null;
      }
    }

    public void connectAsSucc(Element e) {
      disconnectSucc();
      if (e != null) {
        e.disconnectPred();
        e.pred = this;
      }
      succ = e;
    }

    public boolean hasPred() {
      return pred != null;
    }

    public Element getPred() {
      return pred;
    }

    public void disconnectPred() {
      if (hasPred()) {
        pred.succ = null;
        pred = null;

      }
    }

    public void connectAsPred(Element e) {
      disconnectPred();
      if (e != null) {
        e.disconnectSucc();
        e.succ = this;
      }
      pred = e;
    }
  }

}
