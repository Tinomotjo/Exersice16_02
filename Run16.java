package Exersice16_1;

/*
  Write a method called max that returns the maximum value in a list of integers.
  If the list is empty, it should throw a NoSuchElementException.
 */

public class Run16 {

public static void main(String[] args)
{
    LinkedIntList list1 = new LinkedIntList();
    list1.add(1);
    list1.add(2);
    list1.add(10);
    list1.add(4);
    list1.add(5);

    System.out.println(list1.max());

}
}