//Place tiles of size 1 X m in a floor of size n X m :

public class CountNumberOfTiles {
    public static int placeTiles (int n, int m) {
        if(n == m){
            return 2;
        }
        if(n < m) {
            return 1;
        }
        //vertically
        int verPlacements = placeTiles(n-m, m);
        // horizontally
        int horPlacements = placeTiles(n-1, m);
        return verPlacements + horPlacements;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
    }
}