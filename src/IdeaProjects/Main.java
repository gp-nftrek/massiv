package IdeaProjects;

public class Main {

    public static void main(String[] args) {

        //1,2,3
        //  int[] massiv = new int[]{1, 2, 3};
        // for (int i = massiv.length - 1; i>=1; i--) {
         //     System.out.print(massiv[i] + ",");}
        //  System.out.print(massiv [0]);

        //  System.out.println();

           double[] massivOne = new double[]{1.57, 7.654, 9.986};
           for (int i = 0; i<massivOne.length - 1; i++) {
              System.out.print(massivOne[i] + ",");
          }
         System.out.print(massivOne[massivOne.length - 1]);

///
        System.out.println();
        int[] massivThree = {4, 8, 15, 16, 23, 42};
        for (int i = 0; i < massivThree.length; i++) {
            if (massivThree[i] % 2 == 0) {
                System.out.print(massivThree[i]);
            } else {
                System.out.print(++massivThree[i]);
            }
            if (i != massivThree.length - 1) System.out.print(", ");
        }
//4
        System.out.println();


        int[] massiv = new int[]{1, 2, 3};
        for (int i = 0; i < massiv.length; i++) {
            switch (massiv[i] % 2) {
                case 0 -> System.out.print(massiv[i]);
                case 1 -> System.out.print(++massiv[i]);
            }
            if (i != massiv.length - 1) System.out.print(", ");
        }
    }
}


