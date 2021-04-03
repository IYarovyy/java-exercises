/* Hinweise zu dieser Aufgabe

   Aufgabenuebersicht:
   [10 Punkte] Ergaenzen Sie die aus der Vorlesung bekannte Klasse  BinarySearchTree<T extends Comparable<T>>
   um die Methode  checkTree. Die erwartete Funktionalitaet der Methode finden Sie als Kommentar in der Klasse
   BinarySearchTree. Bei der Implementierung der geforderten Methode duerfen nur der Konstruktor
   und die Methoden getContent, isEmpty und isLeaf vorausgesetzt und genutzt werden.

   Weitere Methoden sind im Code enthalten, aber auskommentiert. Diese koennen Sie bei Bedarf zum Testen
   verwenden.

   [5 Punkte] Erklaeren Sie zusaetzlich den Ihrer Implementierung der Methode  checkTree()  zugrundeliegenden
   Algorithmus durch eine kurze textuelle Beschreibung.

*/


public class BinarySearchTree<T extends Comparable<T>> {

/* Aufgabe:
   Vervollstaendigen Sie die Methode  checkTree().
   Die Methode  checkTree  soll  die Hoehe des Baums zurueckgeben, falls sich fuer jeden einzelnen
   Knoten die Hoehen seines linken und seines rechten Teilbaums hoechstens um den Wert  2
   unterscheiden. Gibt es mindestens einen Knoten, dessen beide Teilbaeume einen groesseren Unterschied
   aufweisen, soll der Wert  -1  zurueckgegeben werden.

   Ein leerer Baum hat die Hoehe  0, ein Blatt die Hoehe  1.
*/

  public int checkTree() {
    // --- bitte hier eraenzen ---

  }

  /* --- hier bitte Erklaerung ergaenzen ---




   */


  private T content;
  private BinarySearchTree<T> leftChild, rightChild;

  public BinarySearchTree() {
    content = null;
    leftChild = null;
    rightChild = null;
  }

  public T getContent() {
    if (!isEmpty()) {
      return content;
    } else {
      throw new RuntimeException();
    }
  }

  public boolean isEmpty() {
    return content == null;
  }

  public boolean isLeaf() {
    return !isEmpty() && leftChild.isEmpty() && rightChild.isEmpty();
  }




/* Hinweis:
   Die folgenden, in der Vorlesung vorgestellten Methoden duerfen
   NICHT bei der Loesung der Aufgabe benutzt werden.
   */

  public void add( T t )
  {
    if ( isEmpty() )
    {
      content = t;
      leftChild = new BinarySearchTree<T>();
      rightChild = new BinarySearchTree<T>();
    }
    else
    {
      if ( content.compareTo( t ) > 0 )
      {
        leftChild.add( t );
      }
      else if ( content.compareTo( t ) < 0 )
      {
        rightChild.add( t );
      }
    }
  }

  public boolean contains( T t )
  {
    if ( isEmpty() )
    {
      return false;
    }
    else
    {
      if ( content.compareTo( t ) > 0 )
      {
        return leftChild.contains( t );
      }
      else if ( content.compareTo( t ) < 0 )
      {
        return rightChild.contains( t );
      }
      return true;
    }
  }

  public int size()
  {
    if ( isEmpty() )
    {
      return 0;
    }
    else
    {
      return 1 + leftChild.size() + rightChild.size();
    }
  }

  public void show()
  {
    if ( !isEmpty() )
    {
      leftChild.show();
      System.out.println( content );
      rightChild.show();
    }
  }

}