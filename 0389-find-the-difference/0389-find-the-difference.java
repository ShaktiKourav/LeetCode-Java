// class Solution {
//     public char findTheDifference(String s, String t) {
//         char ans = '\0';
//         int i=0,j=0;
//         while(i < s.length() && j < t.length()){
//             if(s.charAt(i) == t.charAt(j)){
//                 i++;
//                 j++;
//             }else{
//                 return t.charAt(j);
//             }
//         }

//         return t.charAt(j);
//     }
// }



class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;

        for (char ch : s.toCharArray()) {
            ans ^= ch;
        }

        for (char ch : t.toCharArray()) {
            ans ^= ch;
        }

        return ans;
    }
}