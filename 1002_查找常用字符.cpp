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
    //用第一个字符串的字符限制之后要匹配的字符
    vector<string> commonChars(vector<string>& A) {
        int len = A.size();
        int lenEach = A[0].size();
        int vis[26],temp[26];
        for(int i = 0;i < 26;i++){
            vis[i] = 0;
            temp[i] = 0;
        }
        //标记第一个字符串的字符
        for(int i = 0;i < lenEach;i++){
            vis[A[0][i] - 'a']++;
            temp[A[0][i] - 'a']++;
        }
        //遍历之后的字符串
        for(int i = 1;i < len;i++){
            lenEach = A[i].size();
            //遍历每个字符串的字符
            for(int j = 0;j < lenEach;j++){
                //如果之前的字符串没有这个字符，跳到下一个
                if(temp[A[i][j] - 'a'] == 0)continue;
                else{
                    //否则自减
                    temp[A[i][j] - 'a']--;
                }
            }
            //查看当前字符串与之前匹配的个数，更新标记数组
            for(int j = 0;j < 26;j++){
                vis[j] -= temp[j];
                temp[j] = vis[j];
            }
        }
        //构建vector
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
