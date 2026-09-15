/**
 * @id 92397eb9-e554-42a4-9a31-7cd3deef0cb3
 * @name Q CheckSorting
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

public class Q_CheckSorting {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,5,6,67,1};
		System.out.println(arraySortedOrNot(arr, arr.length));
	}

	public static boolean arraySortedOrNot(int[] arr, int n) {
        boolean check = true;
        for(int i = 0; i < n-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                check = false;
            }
        }
        return check;
    }
}
