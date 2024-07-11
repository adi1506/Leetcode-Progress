class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> ans;
        permuteNum(nums, 0, ans);
        return ans;
    }

    void permuteNum(vector<int>& nums, int i, vector<vector<int>>& ans){
        
        //base case
        if(i>=nums.size()){
            ans.push_back(nums);
            return;
        }

        //ek case mei handle karunga baki recursion sambhal lega
        for(int j = i; j<nums.size(); j++){
            swap(nums[i], nums[j]);
            permuteNum(nums, i+1, ans);
            swap(nums[i], nums[j]);
        }
    }
};