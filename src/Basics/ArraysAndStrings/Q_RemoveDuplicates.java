/**
 * @id ebbef0f2-6f7c-493e-b8cb-261077f51ae7
 * @name Q RemoveDuplicates
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
 */

package Arrays;

class Q_RemoveDuplicates
{
	public static void main(String[] args) {
		int arr[] = {1, 2, 2, 2, 3};
		int len = removeDuplicates(arr);	
		for(int i =0 ;i < len; i++)
		{
			System.out.println(arr[i]);
		}
	}
	static int removeDuplicates(int[] arr) {
        int curr_len = 0;
        for(int j = 1; j < arr.length; j++)
        {
            if(arr[curr_len] != arr[j])
            {
                curr_len++;
                arr[curr_len] = arr[j];
            }
        }
        return curr_len+1;
    }
}