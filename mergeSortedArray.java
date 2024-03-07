class Solution
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        ArrayList<Integer> output;
        int i;

        output = new ArrayList<>();
        i = 0;
        while (i < m)
        {
            output.add(nums1[i]);
            i++;
        }
        i = 0;
        while (i < n)
        {
            output.add(nums2[i]);
            i++;
        }
        i = 0;
        while (i < output.size())
        {
            nums1[i] = output.get(i);
            i++;
        }
        Arrays.sort(nums1);
    }
}
