package com.evergent.coreJAVA.ExceptionHandling;
//user-defined exception InvalidScoreException.
class InvalidScoreException extends RuntimeException{
	public InvalidScoreException(String message) {
		super(message);
	}
}
public class ExceptionDemo12 {
	public static void validScore(int score) throws Exception{
		if(score<0 || score>100) {
			throw new InvalidScoreException("Score should be 0 to 100");
		}
		else {
			System.out.println("Valid Score");
		}
	}
	public static void main(String[] args) {
		try {
			validScore(110);
		}
		catch(Exception e) {
			System.out.println("caught Exception: "+e.getMessage());
			System.out.println(e);
		}
	}
}