package Chapter5;

public class Bubble {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int a, b, t;
        int size = 10;

        System.out.print("Initial array: ");
        for(int i=0; i<size; i++) {
            nums[i] = (int) (1000 * Math.random());
            System.out.print("\t" + nums[i]);
        }

        for(a=1; a<size; a++)
            for(b=(size-1); b>=a; b--) {
                if(nums[b-1] > nums[b]) {
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        System.out.print("\nSorted array: ");
        for(int i=0; i<size; i++)
            System.out.print("\t" + nums[i]);
    }
}
