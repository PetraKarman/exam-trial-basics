// Create a function that takes a list as a parameter,
// and returns a new list with every second element from the orignal list
// example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

  public class Seconds {
  public static void main(String[] args) {

  int myList [] = {1, 2, 3, 4, 5};
  myList.secondElements();
  }

  private static void secondElements(int numberList []){
    for (int i = 0; i < numberList.length; i += 2 ){
      System.out.println(i);
    }
}
