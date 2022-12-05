class Main {
  public static void main(String[] args) {
    System.out.println(letterGrade(89));
  }
  public static String letterGrade(int num){
    String grade = "";
    if( num > 90){
      grade += "A";
    }
    else{
      if( num > 80){
        grade += "B";
      }
      else{
        if(num >70){
          grade += "C";
        }
        else{
          if (num > 60){
            grade += "D";
          }
          else{
            grade += "F";
          }
        }
      }
    }
    return grade;
  }
}
