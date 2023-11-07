package com.prathappractice.exceptionhandling;

public class pwc {

	public static void main(String[] args) {

		
		String s="Boy is good";
		
		//desired=BIG
		String desired=" ";
		String words[]=s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			
			
			desired=desired+words[i].charAt(0);
			
		}
		System.out.println(desired);

	}

}
