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
class Solution {
public:
    //�õ�һ���ַ������ַ�����֮��Ҫƥ����ַ�
    vector<string> commonChars(vector<string>& A) {
        int len = A.size();
        int lenEach = A[0].size();
        int vis[26],temp[26];
        for(int i = 0;i < 26;i++){
            vis[i] = 0;
            temp[i] = 0;
        }
        //��ǵ�һ���ַ������ַ�
        for(int i = 0;i < lenEach;i++){
            vis[A[0][i] - 'a']++;
            temp[A[0][i] - 'a']++;
        }
        //����֮����ַ���
        for(int i = 1;i < len;i++){
            lenEach = A[i].size();
            //����ÿ���ַ������ַ�
            for(int j = 0;j < lenEach;j++){
                //���֮ǰ���ַ���û������ַ���������һ��
                if(temp[A[i][j] - 'a'] == 0)continue;
                else{
                    //�����Լ�
                    temp[A[i][j] - 'a']--;
                }
            }
            //�鿴��ǰ�ַ�����֮ǰƥ��ĸ��������±������
            for(int j = 0;j < 26;j++){
                vis[j] -= temp[j];
                temp[j] = vis[j];
            }
        }
        //����vector
        vector<string> ans;
        for(int i = 0;i < 26;i++){
            while(vis[i] > 0){
                char ch[2];
                ch[0] = 'a' + i;
                ch[1] = '\0';
                string str(ch);
                ans.push_back(str);
                vis[i]--;
            }
        }
        return ans;
    }
};
int main(){

    return 0;
}
