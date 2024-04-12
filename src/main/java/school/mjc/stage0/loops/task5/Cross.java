package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
       /*for (int i = 0; i < sideLength/2+1;i++)
        {
            for(int j = 0; j < i; j++) System.out.print(" ");
            System.out.print(8);
            for(int j = 0; j <sideLength-(i+1)*2; j++ ) System.out.print(" ");
            if(i!=sideLength/2) System.out.print(8);
            //         for (int j = 0; j < i; j++) System.out.print("4");
            System.out.println("");
        }
        for (int i = sideLength/2; i > 0;i--)
        {
            for(int j = sideLength/2-1; j >(sideLength/2- i); j--) System.out.print(" ");
            System.out.print(8);

            for(int j = 0; j <sideLength - 2*i; j++ ) System.out.print(" ");
            System.out.print(8);
            //   for (int j = 0; j < i; j++) System.out.print("4");
            System.out.println("");
        }*/
        if (sideLength != 0) {
            for (int i = 0; i < sideLength/2; i++)
            {
                for (int j = 0; j < sideLength/2; j++) System.out.print(" ");
                System.out.print(8);
                System.out.println("");
            }
            for (int i = 0; i < sideLength;i++ ) System.out.print(8);
            System.out.println();
            for (int i = 0; i < sideLength/2; i++)
            {
                for (int j = 0; j < sideLength/2; j++) System.out.print(" ");
                System.out.print(8);
                System.out.println("");
            }
        }



    }
}
