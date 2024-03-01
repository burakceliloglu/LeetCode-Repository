int	*twoSum(int *nums, int numsSize, int target, int *returnSize)
{
	int			i;
	int			j;
	static int	array[2];

	i = 0;
	while (i < numsSize)
	{
		j = i + 1;
		while (j <numsSize)
		{
			if (nums[i] + nums[j] == target)
			{
				array[0] = i;
				array[1] = j;
				*returnSize = 2;
				return (array);
			}
			j++;    
		}
		i++;
	}
	return (0);
}
