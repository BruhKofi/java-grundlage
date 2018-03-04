public class Sample {
    public static void main (String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int[] perm = new int[n];

        for(int j = 0; j < n; j++)
        perm[j] = j;

        for (int i = 0; i < m; i++){
            int r = i + (int)(Math.random() * (n-1));
            int t = perm[r];
            perm[i] = t;
        }

        for (int i = 0; i < m; i++)
            System.out.print(perm[i] + " ");
        System.out.println();

    }
}
