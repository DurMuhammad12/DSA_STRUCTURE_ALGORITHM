public class DeleteElementfromarray {

    public static void main(String arga[]) {
        int[] arr = {10,20,30,40,50};
        int Elementposition = 2;

        for(int i = Elementposition; i < arr.length-1; i++ ) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        System.out.println(" After deletion");
        for(int i = Elementposition; i <= arr.length; i++) {
            System.out.println(" Element at index" + i + arr[i]);

        }
    }    
}