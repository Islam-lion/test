package HomeWork.HomeWork1;



public class Task6 {
    public static String createPhoneNumber(int[] array){
        String phoneNumber = null;
        for(int i = 0; i < array.length; i++){
           phoneNumber.concat(String.valueOf(array[i]));
        }
        return phoneNumber;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        String phoneNumber = String.valueOf(arr[3]);
        System.out.println(phoneNumber);
    }
}
