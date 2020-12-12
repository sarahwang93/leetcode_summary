public class Trie {
        public class TrieNode{
            private TrieNode[] links;
            private int R = 26;
            private boolean isEnd;

            public TrieNode(){
                links = new TrieNode[R];
            }

            public boolean containsKey(char ch){
                return links[ch - 'a'] != null;
            }

            public TrieNode get(char ch){
                return links[ch - 'a'];
            }

            public void put(char ch, TrieNode node){
                links[ch - 'a'] = node;
            }

            public void setEnd(){
                isEnd = true;
            }

            public boolean isEnd(){
                return isEnd;
            }
        }

        private TrieNode root;

        /** Initialize your data structure here. */
        public Trie() {
            //init constructure
            root = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode node = root;
            for(int i=0;i<word.length();i++){
                char currCh = word.charAt(i);
                if(!node.containsKey(currCh)){
                    node.put(currCh, new TrieNode());
                }
                node = node.get(currCh);
            }
            node.setEnd();
        }


        public TrieNode searchPrefix(String word) {
            TrieNode node = root;
            for(int i=0;i<word.length();i++){
                char currCh = word.charAt(i);
                if(node.containsKey(currCh)){
                    node = node.get(currCh);
                }else{
                    return null;
                }
            }
            return node;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word){
            TrieNode node = searchPrefix(word);
            return node!=null && node.isEnd();
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        /** call method searchPrefix **/
        public boolean startsWith(String prefix) {
            TrieNode node = searchPrefix(prefix);
            return node!= null;
        }
}
