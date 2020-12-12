class TrieNode{
    TrieNode[] links;
    boolean isEnd;
    public TrieNode(){
        links = new TrieNode[26];
        isEnd = false;
    }
}


class WordStructure {

    private TrieNode root;

    /** Initialize your data structure here. */
    public WordStructure() {
        root = new TrieNode();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(node.links[ch-'a'] == null){
                node.links[ch-'a'] = new TrieNode();
            }
            node = node.links[ch - 'a'];
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        TrieNode node = root;
        return searchHelper(word, 0, node);
    }

    public boolean searchHelper(String word, int i, TrieNode temp){
        if(temp == null){
            return false;
        }

        if(i == word.length()){
            return temp.isEnd;
        }

        char ch = word.charAt(i);
        if(ch == '.'){
            for(int k=0;k<26;k++){
                if(searchHelper(word, i+1, temp.links[k])) return true;
            }
        }else{
            if(searchHelper(word, i+1, temp.links[ch - 'a'])) return true;
        }

        return false;

    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */