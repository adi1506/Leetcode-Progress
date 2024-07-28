/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if(list1 == NULL){
            return list2;
        }
        if(list2 == NULL){
            return list1;
        }
        
        //pointing to the head of the merged LL
        ListNode* mergedHead = NULL;
        
        //place the lesser node value from both the lists as the head of the merged list
        if(list1->val > list2->val){
            mergedHead = list2;
            list2 = list2 -> next;
        }
        else{
            mergedHead = list1;
            list1 = list1 -> next;
        }

        //create a temp pointer to traverse on the merged LL
        ListNode* temp = mergedHead;

        //compare the nodes at list1 and list2 and add it in the merged LL
        while(list1 != NULL && list2 != NULL){
            if(list1->val > list2->val){
                temp->next = list2;
                list2 = list2->next;
            }
            else{
                temp->next = list1;
                list1 = list1->next;
            }
            temp = temp->next;
        }

        //adding remaining elements of bigger list
        if(list1 != NULL){
            temp->next = list1;
        }
        if(list2 != NULL){
            temp->next = list2;
        }

        return mergedHead;
    }
};