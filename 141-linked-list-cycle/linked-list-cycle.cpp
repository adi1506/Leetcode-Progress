/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        unordered_map<ListNode*, bool> mapping;
        ListNode* temp = head;

        while(temp != NULL){
            if(mapping[temp] == true){
                return true;
            }
            else{
                mapping[temp] = true;
            }
            temp = temp->next;
        }
        return false;
    }
};