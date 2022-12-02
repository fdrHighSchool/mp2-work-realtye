class Main {
  public static void main(String[] args) {
    System.out.println("FIZZBUZZ GENERATOR!");
    
    for (int i = 1; i < 101; i++) {
      System.out.println(fizzBuzz(i));
    } // end for loop
  } // end main method

  public static String fizzBuzz(int i) {
    if (i % 15 == 0) {
        return "FizzBuzz";
      }
      else if (i % 3 == 0) {
        return "Fizz";
      }
      else if (i % 5 == 0) {
        return "Buzz";
      }
      else {
        return "" + i;
      }
  }
} // end class
