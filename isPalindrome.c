bool	isPalindrome(int x)
{
	long	reverse;
	int		original;
	int		digit;

	if (x < 0)
		return (false);
	reverse = 0;
	original = x;
	while (x != 0)
	{
		digit = x % 10;
		reverse = reverse * 10 + digit;
		x /= 10;
	}
	return (original == reverse);
} 
