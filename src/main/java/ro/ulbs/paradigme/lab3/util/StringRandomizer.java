package ro.ulbs.paradigme.lab3.util;

public class StringRandomizer {
	protected char[] randString;

	protected StringRandomizer(int n) {
		randString = new char[n];
		for(int i = 0; i < n; i++){
			int rand = (int)(Math.random() * 52);
			if(rand<26){
				randString[i] = (char)(65+rand);
			}
			else{
				randString[i] = (char)(97+(rand-26));
			}
		}
	}
}
