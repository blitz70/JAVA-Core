package kr.co.iamtek.java2.exception;

import java.io.IOException;

//예외 처리 : 강제인 경우

class E {
	void exception1(){	//unchecked exception
		throw new ArithmeticException();
	};
	
	void exception2() throws IOException{	//Checked exception
		throw new IOException();
	}
	void exception3(){
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.lang.RuntimeException		//
	java.lang.ArithmeticException	//unchecked
	
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.io.IOException				//checked
	*/




}
