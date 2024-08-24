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
class Solution {
public:

    int getMax(TreeNode* root){
        if(root == NULL){
            return -1;
        }
        while(root->right != NULL){
            root = root->right;
        }
        return root->val;
    }

    TreeNode* deleteNode(TreeNode* root, int key) {
        if(root == NULL){
            return NULL;
        }

        if(root-> val == key){
            //match
            //4 cases
            //Case 1 : No child
            if(root->left == NULL && root->right == NULL){
                delete root;
                return NULL;
            }
            //Case 2: only left child
            else if(root->left != NULL && root->right == NULL){
                TreeNode* leftChild = root->left;
                root->left = NULL;
                delete root;
                return leftChild;
            }
            //Case 3: only right child
            else if(root->left == NULL && root->right != NULL){
                TreeNode* rightChild = root->right;
                root->right = NULL;
                delete root;
                return rightChild;
            }
            //Case 4: both child
            else if(root->left != NULL && root->right != NULL){
                //find just chota element of root
                int maxVal = getMax(root->left);
                //replace the root val with maxVal
                root->val = maxVal;
                //delete the maxVal node
                root->left = deleteNode(root->left, maxVal);
                return root;
            }
        }
        else{
            //not match
            //left jao ya right jao
            if(key < root->val){
                root->left = deleteNode(root->left, key);
            }
            else{
                root-> right = deleteNode(root->right, key);
            }
        }

        return root;
    }
};