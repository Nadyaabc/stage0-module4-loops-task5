package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        if (cathetusLength !=0) {

            for (int i = 0; i < cathetusLength; i++) {
                for (int j = 0; j<=i; j++)
                    System.out.print(8);
                System.out.println();
            }
        }
    }
}
