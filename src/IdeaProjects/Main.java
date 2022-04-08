package IdeaProjects;

public class Main {

    public static void main(String[] args) {

        //1,2
        int[] massiv = new int[]{1, 2, 3};
        for (int i = 0; i < massiv.length - 1; i++) {
            System.out.print(massiv[i] + ",");
        }
        System.out.print(massiv[massiv.length - 1]);
        System.out.println();
//
        double[] massivOne = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < massivOne.length - 1; i++) ; {
                   System.out.print(massivOne[i] + ",");
        }
        System.out.print(massivOne[massivOne.length - 1]);

///
        int[] massivThree = {4, 8, 15, 16, 23, 42};
        for (int i = 0; i < massivThree - 1; i++) ;
        {
            System.out.print(massivThree[i] + ",");
        }
        System.out.print(massivThree[massivThree.length - 1]);

    }
}