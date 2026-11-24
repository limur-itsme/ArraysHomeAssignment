import java.util.Arrays;

public class HWTask1 {
    static void main(String[] args) {
        int[] a = {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};
        int replacements = 0;
        System.out.println("Original: " + Arrays.toString(a));
        for(int i = 0; i < a.length; i++){
            if(a[i] < 0){
                a[i] = 0;
                replacements++;
            }
        }
        System.out.println("Modified: " + Arrays.toString(a));
        System.out.println("Replacements: " + replacements);
    }
}
