class Solution {
	/**
	* 两个指针分别指向两个字符串的遍历
	* 当指向的字符相同时，两个指针都向后移动一位
	* 当指向的字符不同时，如果指向typed的指针所指向的字符与其前一位相同，则为长按键入的，改指针向后移一位
	* 否则，两个字符串不同，返回false
	* 当第一个字符两个字符串就不相同时，也返回false
	*/
    public boolean isLongPressedName(String name, String typed) {
        boolean ans = true;
        int lenX = name.length();
        int lenY = typed.length();
        if((lenX == 0 && lenY != 0) || (lenX != 0 && lenY == 0)) return false;
        int i = 0,j = 0;
        while(i < lenX && j < lenY){
            if(name.charAt(i) == typed.charAt(j)){
                i++;j++;
                continue;
            }else{
                if(j > 0 && typed.charAt(j) == typed.charAt(j - 1)){
                    j++;
                    continue;
                }else{
                    ans = false;
                    break;
                }
            }
        }
        if(ans) {
            if (i < lenX) ans = false;
            else if (j < lenY) {
                while (j < lenY) {
                    if (j > 0 && typed.charAt(j) != typed.charAt(j - 1)) {
                        ans = false;
                        break;
                    }
                    j++;
                }
            }
        }
        return ans;
    }
}