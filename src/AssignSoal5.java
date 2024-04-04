public class AssignSoal5 {
    public static void main(String[] args) {
        //init
        int i;
        int[] arrNum = {11, 13, 16, 19, 30, 93, 1, 0, 54};

        //assign --> mencari nilai paling besar dari array tersebut
        int maxNum = arrNum[0];

        for (i = 1; i < arrNum.length ; i++){
            if (arrNum[i] > maxNum){
                maxNum = arrNum[i];
            }
        }
        System.out.println("Angka paling besar dalam array adalah: " + maxNum);
    }
}
