class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        deque<int> dq;
        vector<int> ans;

        //Process 1st window
        for(int i = 0; i<k; i++){
            int element = nums[i];
            //keep popping from queue until you find an element larger than nums[i] in the queue
            while(!dq.empty() && element > nums[dq.back()]){
                dq.pop_back();
            }

            //kuch bhi ho jaye , element ke index ko push toh karna hi hai
            dq.push_back(i);
        }

        //push ans for the 1st window
        int index = dq.front();
        int element = nums[index];
        ans.push_back(element);

        //processing rest of the windows
        for(int i = k; i<nums.size(); i++){
            //removal
            while(!dq.empty() && dq.front() < i-k+1){
                dq.pop_front();
            }

            //addition
            int element = nums[i];
            while(!dq.empty() && element > nums[dq.back()]){
                dq.pop_back();
            }
            dq.push_back(i);

            //store
            int index = dq.front();
            int ansElement = nums[index];
            ans.push_back(ansElement);
        }
        return ans;
    }
    
};