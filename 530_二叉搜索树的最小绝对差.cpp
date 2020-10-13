class Solution {
public:
    int last;
    int dif;
    int getMinimumDifference(TreeNode* root) {
        last = -1;dif = -1;
        frontGet(root);
        return dif;
    }
    //ÖÐÐò±éÀú
    void frontGet(TreeNode* root){
        if(root->left != NULL) frontGet(root->left);
        if(last == -1) last = root->val;
        else {
            if(dif == -1) {
                dif = abs(root->val - last);
                printf("%d\n",dif);
            }
            else {
                //printf("%d  %d\n",(abs(root->val - last)),dif);
                dif = min(abs(root->val - last),dif);
            }
            last = root->val;
        }
        if(root->right != NULL) frontGet(root->right);
    }
};
