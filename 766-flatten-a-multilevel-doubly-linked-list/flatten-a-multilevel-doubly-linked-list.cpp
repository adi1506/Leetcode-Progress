/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* prev;
    Node* next;
    Node* child;
};
*/

class Solution {
public:

    Node* solve(Node* &head){
        if(head == NULL) return NULL;
        Node* it = head;
        Node* tail = head;

        while(it != NULL){
            if(it->child){
                Node* childTail = solve(it->child); 
                Node* temp = it->next;
                it->next = it->child;
                it->child->prev = it;
                childTail-> next = temp;
                if(temp) temp->prev = childTail;
                it->child = NULL;
            }
            tail = it;
            it=it->next;
        }
        return tail;

    }

    Node* flatten(Node* head) {
        solve(head);
        return head;
    }
};