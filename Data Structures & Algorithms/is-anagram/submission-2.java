class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>map1=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        char[]ch=s.toCharArray();
        char[]ch1=t.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }
            else{
                map.put(ch[i],1);
            }
        }
        for(int j=0;j<ch1.length;j++){
            if(map1.containsKey(ch1[j])){
                map1.put(ch1[j],map1.get(ch1[j])+1);
            }
            else{
                map1.put(ch1[j],1);
            }
        }
        if(map.equals(map1)){
            return true;
    }
    return false;
    }
}
