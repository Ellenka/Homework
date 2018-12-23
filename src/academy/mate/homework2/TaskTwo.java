package academy.mate.homework2;

public class TaskTwo {
  public void charArrayChecked() {
    char[] array1 = {'p', 'o', 't','o'};
    int count = 0;
    for (int i = 0; i<(array1.length/2); i++) {
      if (array1[i]==array1[array1.length-1-i]) {
        count++;
        if (count == array1.length/2) {
          System.out.println("It's a palindrome!");
        }
        else
          continue;
      } else {
        System.out.println("This word is not a palindrome!");
        break;
      }
    }
    
  }

}
