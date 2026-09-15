/**
 * @metadata-start
 * @id 761d50ed-160b-42c0-9704-bba948c29a29
 * @name NonZeroes
 * @description
 *
 * @topic
 * @type Normal
 * @difficulty
 * @pattern
 *
 * @companies
 * @source
 * @url
 *
 * @status Unsolved
 * @approach
 * @attempts 0
 * @confidence Low
 * @review
 *
 * @time-complexity
 * @space-complexity
 *
 * @limitations
 * @edge-cases
  * @metadata-end
 */

package Arrays;

public class NonZeroes {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
        for(int i:nums)        
        {
            System.out.print(i+" ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int indexOfLastNonZero = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[indexOfLastNonZero++] = nums[i];
            }
        }
        for(int i = indexOfLastNonZero ; i < nums.length;i++)
        {
            nums[i] = 0;
        }
    }
}
