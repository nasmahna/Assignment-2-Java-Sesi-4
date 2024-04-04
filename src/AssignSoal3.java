public class AssignSoal3 {
    public static void main(String[] args) {
        //init
        int[] numbers1 = {1, 3, 9 , 27, 81}; //out: true
        int[] numbers2 = {2, 4, 8, 16, 32}; //out: true
        int[] numbers3 = {2, 4, 6, 8}; //out: false
        int[] numbers4 = {2, 6, 18, 54}; //out: true
        int[] numbers5 = {1, 2, 3, 4, 7, 9}; //out: false

        //assign --> kondisikan apakah array deret geometri atau bukan
        System.out.println("Array-1, Deret Geometri?: " + CekGeometri(numbers1));
        System.out.println("Array-2, Deret Geometri?: " + CekGeometri(numbers2));
        System.out.println("Array-3, Deret Geometri?: " + CekGeometri(numbers3));
        System.out.println("Array-4, Deret Geometri?: " + CekGeometri(numbers4));
        System.out.println("Array-5, Deret Geometri?: " + CekGeometri(numbers5));
    }
    public static boolean CekGeometri(int[] arr) {
        if (arr.length <= 1) {
            return true; // Array dengan satu elemen atau tidak memiliki elemen dianggap sebagai deret geometri
        }

        int ratio = arr[1] / arr[0]; // Menghitung rasio antara dua elemen pertama

        for (int i = 1; i < arr.length - 1; i++) {
            // Periksa apakah rasio antara setiap dua elemen berturut-turut sama
            if (arr[i + 1] / arr[i] != ratio) {
                return false; // Jika tidak sama, maka bukan deret geometri
            }
        }

        return true; // Jika semua rasio sama, maka merupakan deret geometri
    }
}
