package com.cg.exceptionhandling;

public class NestedTryCatch {

	public static void check() {
		String str = "NTS";
		int slength = str.length();
		System.out.println("string length: "+ slength);
		String anOtherString= null;
		int y = 6;
		try {
			//inner try
			try {
			System.out.println(str.charAt(y));
		}
		catch(StringIndexOutOfBoundsException ex){
			System.out.println("Index is out of bound :-"+ ex.getMessage());
			
		}
		System.out.println("another string :" + anOtherString.length());
	}
		catch(NullPointerException npe) {
			System.out.println("exception is thrown again:-" + npe.getMessage());
		}
	}
}


