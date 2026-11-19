class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary = new StringBuilder();

        // convert into 8bit binary
        for(int i=0;i<s.length();i++){
            String temp = Integer.toBinaryString(s.charAt(i));

            // add 0's
            while(temp.length()<8){
                temp = "0"+temp;
            }

            binary.append(temp);
        }

        int i=0;
        int j=binary.length()-1;
        while(i<j){ // palindrome checkk
            if(binary.charAt(i) != binary.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}