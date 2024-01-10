package com.SwitchCase;

public class Jerusalem {
	public static void main(String args[]) {
        int i = 1, j = 0;
        switch (i) {
            case 2 :
                j += 6;
            case 4 :
                j += 1;
            default :/*there is no break statement,the program get to the defalut statement
                        and add j=2 and then goto case 0 and add j=2+4=6*/
             j += 2;
            case 0 :
                j += 4;
        }
        System.out.println("j = " + j);
    }


}
