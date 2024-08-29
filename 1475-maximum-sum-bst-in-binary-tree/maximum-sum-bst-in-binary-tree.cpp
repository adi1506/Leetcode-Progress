/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Info {
    public:
        int minVal;
        int maxVal;
        int sum;
        bool isBST;
};

class Solution {
public:

    int minCal(int a, int b, int c){
        int minVal = min(a, min(b, c));
        return minVal;
    }

    int maxCal(int a, int b, int c){
        int maxVal = max(a, max(b, c));
        return maxVal;
    }

    Info solve(TreeNode* root, int &sum){
        //base case
        if(root == NULL){
            Info temp;
            temp.minVal = INT_MAX;
            temp.maxVal = INT_MIN;
            temp.sum = 0;
            temp.isBST = true;
            sum = max(sum, temp.sum);
            return temp;
        }

        //LRN
        Info leftAns = solve(root->left, sum);
        Info rightAns = solve(root->right, sum);

        //N
        Info currentAns;
        currentAns.minVal = minCal(leftAns.minVal, rightAns.minVal, root->val);
        currentAns.maxVal = maxCal(leftAns.maxVal, rightAns.maxVal, root->val);
        currentAns.sum = leftAns.sum + rightAns.sum + root->val;
        currentAns.isBST = (root->val > leftAns.maxVal && root->val < rightAns.minVal && leftAns.isBST && rightAns.isBST);

        if(currentAns.isBST){
            sum = max(sum, currentAns.sum);
        }
        return currentAns;
    }

    int maxSumBST(TreeNode* root) {
        int sum = 0;
        Info temp = solve(root, sum);
        return sum;
    }
};