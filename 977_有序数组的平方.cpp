#include<iostream>
#include<stdio.h>
#include<cstdio>
#include <map>
#include <vector>
#include <algorithm>
#include <string>
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
class Node {
public:
    int val;
    Node* left;
    Node* right;
    Node* next;

    Node() : val(0), left(NULL), right(NULL), next(NULL) {}

    Node(int _val) : val(_val), left(NULL), right(NULL), next(NULL) {}

    Node(int _val, Node* _left, Node* _right, Node* _next)
        : val(_val), left(_left), right(_right), next(_next) {}
};
class Solution {
public:
    vector<int> sortedSquares(vector<int>& A) {
        int len = A.size();
        if(len == 0) return A;
        //平方
        for(int i = 0;i < len;i++)
            A[i] = A[i] * A[i];
        //排序
        sort(A.begin(),A.end());
        return A;
    }
};
int main(){
    Node n7(7);Node n6(6);Node n5(5);Node n4(4);
    Node n3(3,&n6,&n7,NULL);
    Node n2(2,&n4,&n5,NULL);
    Node n1(1,&n2,&n3,NULL);
    Solution s;
    Node* ans = s.connect(&n1);
    return 0;
}
