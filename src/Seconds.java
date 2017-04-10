// Create a function that takes a list as a parameter,
// and returns a new list with every second element from the orignal list
// example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

public class Seconds {
  public static void main(String[] args) {

    int myList[] = {1, 2, 3, 4, 5};
    secondElements(myList);
  }

  public static void secondElements(int numberList[]) {
    System.out.print("[");
    for (int i = 1; i < numberList.length; i += 2) {
      if (i < numberList.length - 2) {
        System.out.print(numberList[i] + ", ");
      } else
        System.out.print(numberList[i]);
    }
    System.out.print("]");
  }
}