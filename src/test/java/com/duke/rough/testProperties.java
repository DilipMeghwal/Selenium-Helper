package com.duke.rough;

import java.util.HashMap;
import java.util.Map;



public class testProperties {
	public static boolean validate(String username) {
        if(username.length()<6 || username.length()>16){
            return false;
        }else{
            char[] strUsername = username.toCharArray();
            if((strUsername[0]>=65 && strUsername[0]<=90) || (strUsername[0]>=97 && strUsername[0]<=122)){
                if(strUsername[strUsername.length-1] == 45){
                    return false;
                }else{
                    int hyphenCount = 0;
                    for(int i = 0; i<strUsername.length-1; i++){
                        if(strUsername[i] == 45){
                        	hyphenCount = hyphenCount + 1;
                            if(hyphenCount < 2 && ((strUsername[i]>=65 && strUsername[i]<=90) || (strUsername[i]>=97 && strUsername[i]<=122) || (strUsername[i]==45))){
                                return true;
                            }else {
                            	return false;
                            }
                        }
                    }
                }
            }else{
                return false;
            }
        }
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) {
        System.out.println(validate("Mike-Standish")); // Valid username
        System.out.println(validate("Mike Standish")); // Invalid username
    }
}
