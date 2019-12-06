package b2_MangVaPhuongThuc.TH;

public class TimGiaTriNhoNhatTrongmang {
    public static int minValue(int []array){

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 65, 49,54,2,54,8,7,6,4,2,6,5,6,2,3,1,6,5,65,98,45,78,2,65,4};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

}
