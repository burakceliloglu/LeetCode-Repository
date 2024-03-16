class Solution {
	public int	removeElement(int[] nums, int val) {
		int	i;
		int	k;

		i = 0;
		k = 0;
		while (i < nums.length)
		{
			if (nums[i] != val)
				nums[k++] = nums[i];
			i++;
		}
		return (k);
	}
}