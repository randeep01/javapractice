class TrieNode{
    static int MAX = 26;
    TrieNode[] children = new TrieNode[MAX];
    boolean isEnd = false;
}

public class Trie{
    TrieNode root=new TrieNode();
    public void add(String str){
        int len = str.length();
        TrieNode pCrawl = root;
        for(int i =0;i<len;i++)
        {
            int idx = str.charAt(i) - 'a';
            if (pCrawl.children[idx] == null){
                pCrawl.children[idx] = new TrieNode();
            }
            pCrawl = pCrawl.children[idx];
        }
        pCrawl.isEnd = true;
    }
    public boolean search(String str){
        int len = str.length();
        TrieNode pCrawl = root;
        for(int i =0;i<len;i++)
        {
            int idx = str.charAt(i) - 'a';
            if (pCrawl.children[idx] == null){
                return false;
            }
            pCrawl = pCrawl.children[idx];
        }
        return (pCrawl!=null && pCrawl.isEnd);
    }
    public String[] prefixsearch(String prefix){
        int i  = 0;
        TrieNode pCrawl = root;
        char[] str = new char [10];
        for(i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i) - 'a';
            if(pCrawl.children[idx] !=null){
                pCrawl = pCrawl.children[idx];
            }
            else{
                return null;
            }
        }
        int strIdx = 0;
        readTrie(pCrawl,str,strIdx);
        return null;
    }
    public void readTrie(TrieNode pCrawl, char[] str, int index)
    {
        if(pCrawl !=null && pCrawl.isEnd)
        {
            System.out.println(str);
        }
        for(int i = 0;i<TrieNode.MAX; i++)
        {
            if(pCrawl.children[i] !=null)
            {
                char val = (char)(i+'a');
                str[index] = val;
                readTrie(pCrawl.children[i], str,index+1);
            }
        }
    }   


    public static void main(String args[])
    {
        Trie tr = new Trie();
        tr.add("randeep");
        tr.add("randeepa");
        tr.add("sandeepa");
        
//        System.out.println(tr.search("randeep"));
//        System.out.println(tr.search("ran"));
        tr.prefixsearch("sa");
    }
}
