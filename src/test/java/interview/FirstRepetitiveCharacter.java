package interview;

import java.util.HashSet;

public class FirstRepetitiveCharacter {
	    public static void main(String[] args) {
	        char[] characters = {'a', 'b', 'c', 'r', 'k', 'j', 'c', 'm', 'a', 'b'};
	        char firstRepetitiveChar = findFirstRepetitiveChar(characters);
	        System.out.println("First repetitive character: " + firstRepetitiveChar);
	    }

	    public static char findFirstRepetitiveChar(char[] characters) {
	        HashSet<Character> set = new HashSet<>();

	        for (char ch : characters) {
	            if (set.contains(ch)) {
	                return ch;
	            }
	            System.out.println(ch);
	            set.add(ch);
	        }

	        // Return null character if no repetitive character is found
	        return '\0';
	    }
	}
