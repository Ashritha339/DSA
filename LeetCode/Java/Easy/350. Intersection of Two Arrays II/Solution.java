class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        ArrayList<Integer> al=new ArrayList<>();
        int k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                al.add(k,nums1[i]);
                i++;
                j++;
                k++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }

        int[] arr=new int[al.size()];
        int l=0;

        for(int x:al){
            arr[l]=x;
            l++;
        }

        return arr;
    }
}