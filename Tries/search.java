 public static boolean search(String key) { // Time complexity for the code =O(n)
       int level = 0;
       int len = key.length();
       int idx = 0;


       Node curr = root;
       for(; level<len; level++) {
           idx = key.charAt(level)-'a';
           if(curr.children[idx] == null) {
               return false;
           }
           curr = curr.children[idx];
       }
       return curr.eow == true;
   }


   public static void main(String args[]) {
       String words[] = {"the", "a", "there", "their", "any", "thee"};
       for (String word : words) {
           insert(word);
           System.out.println("inserted " + word);
       }


       System.out.println("thee -> " + search("thee"));
       System.out.println("thor -> " + search("thor"));


       System.out.println(startsWith("the"));
       System.out.println(startsWith("thi"));
   }
}


