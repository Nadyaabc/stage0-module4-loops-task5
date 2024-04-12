package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int i = 0; i < sideLength;i++) {
            if (i == 0 || i == (sideLength - 1)) {
                for (int j = 0; j < sideLength; j++) {
                    System.out.print(8);
                }
                System.out.println("");
            } else {
                System.out.print(8);
                for (int k = 1; k < sideLength - 1; k++) System.out.print(" ");
                System.out.println(8);
            }
        }
    }
}
