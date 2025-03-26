package ro.ulbs.paradigme.lab3.util;

import java.util.*;
public class PasswordMaker extends StringRandomizer {
	private static final int MAGIC_NUMBER = 5 + (int)(Math.random() * 6);
	private final String password;
	private final String magicString=new String(new StringRandomizer(20).randString);
	private static PasswordMaker instance;
	public static int getInstanceCount;

	private PasswordMaker(String name){
		super(MAGIC_NUMBER);
		char[] auxMagicString = new char[10];
		int rand;
		for(int i=0;i<10;i++){
			rand = (int)(Math.random() * 20);
			auxMagicString[i] = magicString.charAt(rand);
		}
		password = new String(super.randString) + new String(auxMagicString) + String.valueOf(name.length()) + (int)(Math.random() * 51);
	}

	public static PasswordMaker getInstance(String name){
		getInstanceCount++;
		if(instance == null){
			instance = new PasswordMaker(name);
		}
		return instance;
	}

	public String getPassword(){
		return password;
	}
}
