class Main {
  public static void main(String[] args) {
    
    System.out.println(countHi("abc hi ho"));
    System.out.println(countHi("ABChi hi"));
    System.out.println(countHi("hi hi"));
    System.out.println(firstHalf("WooHoo"));
    System.out.println(firstHalf("HelloThere"));
    System.out.println(firstHalf("abcdef"));
    
    System.out.println(conCat("abc","cat"));
    System.out.println(conCat("dog","cat"));
    System.out.println(withoutString("Hello there","llo"));
    System.out.println(withoutString("Hello there","e"));
    System.out.println(makeSarcastic("Hello there"));
  }// end of main method
  public static int countHi(String str) {
    int count=0;
    
    for (int i=0; i<= str.length() - 2;i++) {
      if (str.substring(i, i+2).equals("hi")) {
        count++;
      }// closing if statement
      
    }// closing for loop
    return count;
  }//closing countHi
  public static String firstHalf(String str) {
    String part= str.substring(0,str.length()/2);
    return part;
  }
  public static String conCat(String str1, String str2) {
    String word="";
    if ((str1.substring(str1.length()-1)).equals(str2.substring(0, 1))) {
      return word+=str1+str2.substring(1);
