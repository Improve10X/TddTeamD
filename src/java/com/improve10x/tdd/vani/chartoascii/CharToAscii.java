package com.improve10x.tdd.vani.chartoascii;

public class CharToAscii {
    public int ctoa(Character letter) {
        int result = 0;
       if (letter == null){
           return 0;
       }
        if (letter.equals(' ')) {
            return 32;
        }
        return result;
    }
}
//        int result = 0;
//        if (letter.equals("SPACE")){
//            return 32;
//        }
//        for (int i = 0; i < letter.length(); i++) {
//            char c = letter.charAt(i);
//            if (c == 'A') {
//                result = 65;
//            } else if (c == 'B') {
//                result = 66;
//            } else if(c == 'C'){
//                result = 67;
//            }else if(c == '['){
//                result = 91;
//            }else if(c == '\u0000'){
//                result = 92;
//            }
//        }
//        return result;
//    }
