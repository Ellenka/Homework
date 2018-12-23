package academy.mate.homework2;

import java.time.Month;
import java.util.Arrays;

public class TaskOne {
  public void monthArrayCreated() {
    int[] arr = new int [12];
    for (int i = 0; i<arr.length; i++) {
      //arr[i] = Month.of(i+1).length(false);
      arr[i] = Month.of(i+1).minLength();
    }
    System.out.println(Arrays.toString(arr));
  }    

}
