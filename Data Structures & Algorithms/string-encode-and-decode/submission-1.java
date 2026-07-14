class Solution {

    public String encode(List<String> strs) {
        StringBuffer st=new StringBuffer();
        for(String word:strs){
            st.append(word.length());
            st.append('#');
            st.append(word);
        }
        return st.toString();
    }

    public List<String> decode(String str) {
        List<String>ans=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            String word=str.substring(j+1,j+1+len);
            ans.add(word);
            i = j + 1 + len;
        }
        return ans;
    }
}
