#include<iostream>
#include<stdio.h>
#include<cstdio>
#include <map>
#include <vector>
#include <algorithm>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(NULL) {}
    ListNode(int x) : val(x), next(NULL) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : left(NULL),right(NULL){}
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};
class Solution {
public:
    //交换相邻两个节点
    ListNode* swapPairs(ListNode* head) {
        ListNode* temp;
        ListNode* ans = head,*p;
        ListNode pre;
        pre.next = head;
        p = &pre;
        if(head != NULL&&head->next != NULL) ans = head->next;
        while(head != NULL){
            temp = head->next;
            if(temp == NULL) break;
            head->next = temp->next;
            printf("%d\n",head->next == NULL);
            p->next = temp;
            temp->next = head;
            p = head;
            head = head->next;
        }
        return ans;
    }
};
int main(){
    ListNode l1,l2,l3,l4;
    l1.val = 1;l2.val = 2;l3.val = 3,l4.val = 4;
    l1.next = &l2;l2.next = &l3;//l3.next = &l4;
    Solution s;
    ListNode* head = s.swapPairs(&l1);
    cout<<head->val<<" ";
    cout<<head->next->val<<" ";
    cout<<head->next->next->val<<endl;
    return 0;
}
