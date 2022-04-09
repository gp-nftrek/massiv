package IdeaProjects;

public class Main {

    public static void main(String[] args) {

        //1,2,3
        //    int[] massiv = new int[]{1, 2, 3};
        //   for (int i = massiv.length - 1; i>=1; i--) {
        //       System.out.print(massiv[i] + ",");}
        //   System.out.print(massiv [0]);

        //  System.out.println();
//
     //   double[] massivOne = new double[]{1.57, 7.654, 9.986};
     //   for (int i = massivOne.length - 1; i >= 1; i--) {
      //      System.out.print(massivOne[i] + ",");
      //  }
       // System.out.print(massivOne[0]);

///
      //  System.out.println();
     //   int[] massivThree = {4, 8, 15, 16, 23, 42};
     //   for (int i = massivThree.length - 1; i >= 1; i--) {
     //       System.out.print(massivThree[i] + ",");
     //   }
    //    System.out.print(massivThree[0]);
//4
        System.out.println();
int i =0;
        int[] massiv = new int[]{1, 2, 3};
        for (; i < massiv.length; i++) {
            if (massiv[i] % 2 != 0) {
                massiv[i] = massiv[i] + 1 ;
            }

            System.out.print(massiv[i] + ", ");


            System.out.print(massiv[massiv.length - 1] );

        }
    }

}
//massiv[i] = massiv[i] + 1;
//if (i != massiv[massiv.length - 1]) {
    //    System.out.print(massiv[i]+ ", ");
    //    } else {
    //    System.out.print(massiv[i] );
   //     }
