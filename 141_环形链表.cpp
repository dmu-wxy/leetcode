#include<stdio.h>
#include <map>
#include <vector>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(NULL) {}
    ListNode(int x) : val(x), next(NULL) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};
class Solution {
public:
    Solution(){}
    bool hasCycle(ListNode *head) {
        int pos = 0;
        if(head == NULL) return false;
        ListNode *temp = head;
        while(temp != NULL && temp->next != temp){
            temp = head->next;
            head->val = pos++;
            head->next = head;
            head = temp;
        }
        if(temp == NULL) return false;
        else if(temp->next == temp) return true;
    }
};

int main(){
    Solution s;// = new Solution();
    ListNode lis;
    lis.val = 1;
    lis.next = NULL;
    printf("%d",s.hasCycle(&lis));
    return 0;
}
