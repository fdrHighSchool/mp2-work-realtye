class Main {
  public static void main(String[] args) {
    System.out.println(divBy3(181));
    System.out.println(divBy3(35));
    System.out.println(divBy3(0));
    System.out.println(divBy3(57));
    System.out.println(divBy3(21));
  }
  public static boolean divBy3 (int number) {
    int addition = 0;
    String numint = Integer.toString(number); // convert to string
    for (int i = 0; i < numint.length(); i++) { // loop number check for string length
      char check = numint.charAt(i);
      addition += check; // adds all digits
    }
    return addition % 3 == 0; // returns true or false (true = divisible, false = not divisible)
  }
}
