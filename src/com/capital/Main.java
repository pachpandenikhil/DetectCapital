package com.capital;

public class Main {
	
	public boolean detectCapitalUse(String word) {
		
		if(word.length() <= 1) {
			return true;
		}
		
        boolean valid = false;
        boolean firstCharCapital = Character.isUpperCase(word.charAt(0));
        String substring = word.substring(1);
        
        if(firstCharCapital) {
        	if(isSubstringLowerCase(substring) || isSubstringUpperCase(substring)) {
        		valid = true;
        	}
        }
        else {
        	if(isSubstringLowerCase(substring)) {
        		valid = true;
        	}
        }
        
        return valid;
    }

	private boolean isSubstringLowerCase(String substring) {
		boolean lowerCase = true;
		for (int i = 0; i < substring.length(); i++) {
			if(!Character.isLowerCase(substring.charAt(i))) {
				lowerCase = false;
				break;
			}
		}
		return lowerCase;
	}
	
	private boolean isSubstringUpperCase(String substring) {
		boolean upperCase = true;
		for (int i = 0; i < substring.length(); i++) {
			if(!Character.isUpperCase(substring.charAt(i))) {
				upperCase = false;
				break;
			}
		}
		return upperCase;
	}

	public static void main(String[] args) {
		String word = "FlaG";
		Main obj = new Main();
		System.out.println(obj.detectCapitalUse(word));
	}

}
