package deprecated.slipp.etc1;

public class JumpGame {

    public void test() {
        int[] a = {2,0,0};
//        int[] a = {3,2,1,0,4};
//        int[] a = {2,3,1,1,4};
        System.out.println(canJump(a));
    }

    public boolean canJump(int[] nums) {

        return re(nums, 0);
    }

    private boolean re(int[] nums, int index) {

        if (index == nums.length - 1) {
            return true;
        }

        int jump = Math.min(index + nums[index], nums.length - 1);

        for (int nextIndex = index + 1 ; nextIndex <= jump; nextIndex++) {
            if (re(nums, nextIndex)) {
                return true;
            }
        }
        return false;
    }
}
