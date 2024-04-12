package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {

        if (sideLength != 0) {
            for (int i = 0; i < sideLength/2; i++)
            {
                for (int j = 0; j < sideLength/2; j++) System.out.print(" ");
                System.out.print(8);
                for (int j = 0; j < sideLength/2; j++) System.out.print(" ");

                System.out.println("");
            }
            for (int i = 0; i < sideLength;i++ ) System.out.print(8);
            System.out.println();
            for (int i = 0; i < sideLength/2; i++)
            {
                for (int j = 0; j < sideLength/2; j++) System.out.print(" ");
                System.out.print(8);
                for (int j = 0; j < sideLength/2; j++) System.out.print(" ");

                System.out.println("");
            }
        }



    }
}
