public class Runner {

    public static void main(String[] args) {
        int[] a = {2, 52, 17, 49, 30};
        for (int i = 0; i < a.length; i ++) {
            System.out.print(a[i] + ", ");
        }
        int x = DiverseArray.arraySum(a);
        System.out.println();
        System.out.println("Sum of a: " + x);

        int[][] b = {
                {3, 62, 39, 40},
                {1, 48, 50, 28},
                {1, 2, 3, 4},
                {4, 3, 2, 1}
        };

        for (int i = 0; i < b.length; i ++) {
            System.out.println();
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + ", ");
            }
        }
        System.out.println();
        System.out.print("Sums of b: ");

        int[] y = DiverseArray.rowSums(b);
        for (int i = 0; i < y.length; i ++) {
            System.out.print(y[i] + ", ");
        }
        System.out.println();
        System.out.println("Is b diverse?");
        System.out.println(DiverseArray.isDiverse(b));
    }
}
