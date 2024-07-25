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

    //method1 - using map
    bool method1(ListNode* &head){
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

    //method2 - using floyyd tortoise algo
    bool method2(ListNode* &head){
        ListNode* fast = head;
        ListNode* slow = head;

        while(fast != NULL){
            fast = fast->next;
            if(fast!= NULL){
                fast = fast -> next;
                slow = slow -> next;
            }
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    bool hasCycle(ListNode *head) {
        // return method1(head);
        return method2(head);
    }
};