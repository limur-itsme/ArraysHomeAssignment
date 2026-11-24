public class HWTask2 {
    static void main(String[] args) {
        int[] a = {5, 5, 5, 5, 5, 4};
        int theLargest = 0;
        int theSecondLargest = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > theLargest){
                theSecondLargest = theLargest;
                theLargest = a[i];
            }
            if(i == a.length-1 && a[i] < theLargest){
                theSecondLargest = a[i];
            }

        }
        if(theSecondLargest == 0){
            System.out.println(theLargest);
            System.out.println("No second largest distinct number.");
        }
        else {
            System.out.println(theLargest);
            System.out.println(theSecondLargest);
        }
    }
}
