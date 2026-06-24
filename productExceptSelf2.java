class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int  leftProduct = 1;
        int rightProduct = 1;
        int product;
        int[] answer = new int[n];

        for(int i = 0; i< n; i++){
            int current = i;
            int left = i-1;
            int right  = i+1;
        
        for(int j = 0; j< left ; j++){
            leftProduct *= nums[j];
        }
        for(int k = right ; k< n; k++){
            rightProduct += nums[k];
        }
        product = leftProduct * rightProduct;
        answer[current] = product;
    }
    return answer;
    }

}
