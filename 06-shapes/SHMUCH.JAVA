class Shapes {
    public static void main(String[] args) {
        System.out.println("Shapes");
        square(5);
        rectangle(5, 3);
        righttriangle(5);
        triangle(7);
    }
    //end main
    public static void square(int x) {
        for(int row = 1; row <= x; row++) {
            System.out.println("");
            for (int col = 1; col <= x; col++) {
                System.out.print("* ");
            }
            //adds stars to rows
        }
        //creates rows
    }
    //end square
    public static void rectangle(int x, int y) {
        for(int row = 1; row <= x; row++) {
            System.out.println("");
            for (int col = 1; col <= y; col++) {
                System.out.print("* ");
            }
            //adds stars to rows
        }
        //creates rows
    }
    //end rectangle
    public static void righttriangle(int x) {
        for(int row = 1; row <= x; row++) {
            String a = "";
            for (int col = 1; col <= row; col++) {
                a += "* ";
            }
            //adds same amount of stars as row #
            System.out.println(a);
        }
        //creates rows
    }
    //end righttriangle
    public static void triangle(int x) {
        for(int row = 1; row <= x; row++) {
            System.out.println("");
            for (int space = 1; space <= x-row; space++) {
                System.out.print(" ");
            }
            //adds spaces, same # as user input - row #
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //adds stars after space, same # as row #
        }
        //adds rows
    }
    //end triangle
}
