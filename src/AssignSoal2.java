public class AssignSoal2 {
    public static void main(String[] args) {
        //init
        int total, i, j, k;

        int[][] numbers = {{1, 3, 4}, {2}, {3, 7, 10}};
        //assign --> jumlahkan angka di dalam array 2D
        total = 0;
        for (i = 0; i < numbers.length; i++){
            for (j = 0; j < numbers[i].length; j++){
                    total = total + numbers[i][j];
            }
        }
        System.out.println("Total penjumlahan array-1: " + total);

        int[][] numbers2 = {{2, 9}, {0, 3, 10}, {1, 9}};
        total = 0;
        for (i = 0; i < numbers2.length; i++){
            for (j = 0; j < numbers2[i].length; j++){
                total = total + numbers2[i][j];
            }
        }
        System.out.println("Total penjumlahan array-2: " + total);
    }
}
