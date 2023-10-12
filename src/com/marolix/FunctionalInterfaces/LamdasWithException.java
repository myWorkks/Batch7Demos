package com.marolix.FunctionalInterfaces;

interface FI3 {

	String elgibleForVote(int age) throws Exception;

}

public class LamdasWithException {
	public static void main(String[] args) {
		FI3 f = age -> {
			if (age < 18)
				throw new Exception(age + " is not elgible for voting");
			else
				return age + " is elgible for voting";
		};
		try {
			System.out.println(f.elgibleForVote(20));
			System.out.println(f.elgibleForVote(17));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
