public static boolean wordBreak(String key) {
       int len = key.length();


       if(len == 0) {
           return true;
       }


       for(int i=1; i<=len; i++) {
           if( search(key.substring(0, i)) &&
               wordBreak(key.substring(i)) ) {
                   return true;
               }
       }


       return false;
   }

