package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height!=0 && height %2 !=0)
        {
            for (int i = 0; i < height/2+1;i++)
            {
                for(int j = 0; j < i; j++) System.out.print(" ");
                System.out.print(8);
                for(int j = 0; j <height-(i+1)*2; j++ ) System.out.print("8");
                if(i!=height/2 ) System.out.print(8);
                for(int j = 0; j < i; j++) System.out.print(" ");
                System.out.println("");

            }
            for (int i = height/2; i > 0;i--)
            {
                for(int j = height/2-1; j >(height/2- i); j--) System.out.print(" ");
                System.out.print(8);
                for(int j = 0; j <height - 2*i; j++ ) System.out.print("8");
                System.out.print(8);
                for(int j = height/2-1; j >(height/2- i); j--) System.out.print(" ");
                System.out.println("");
            }
        }
        else if (height !=0 && height%2==0)
        {
            for (int i = 0; i < height/2;i++)
            {
                for(int j = 0; j < i; j++) System.out.print(" ");
                for(int j = 0; j < height-(i)*2; j++ ) System.out.print("8");
                for(int j = 0; j < i; j++) System.out.print(" ");
                System.out.println("");
            }

            for (int i = height/2-1; i >= 0;i--)
            {

                for(int j = height/2; j >(height/2- i); j--) System.out.print(" ");
                for(int j = 0; j <height-2*i ; j++ ) System.out.print("8");
                for(int j = height/2; j >(height/2- i); j--) System.out.print(" ");
                System.out.println("");
            }
        }
    }

}
