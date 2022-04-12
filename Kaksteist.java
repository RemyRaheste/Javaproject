public class Kaksteist {
    public static void main(String[] args) {
        int n = 5;
        // a)
        for (int i=0;i<=n;i++){
            if (i % 2 == 1){
                for (int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println("");

            }

        }
        for (int i=n-1;i>0;i--){
            if (i % 2 == 1){
                for (int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }

        }

        System.out.println("");
        // b)
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println("");

        }

        System.out.println("");
        // c)
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");

        }

        System.out.println("");
        // d)
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");

        }


    }
}