package com.supersecure.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class REPL {
	
	public static void main(String[] args) {
		
		new REPL().start();
	}

	public void start() {
		
		String input = null;
		BufferedReader bf = null;
		System.out.println("Welcome!");
		for(;;){
			try {
				bf = new BufferedReader(new InputStreamReader(System.in));
				input = bf.readLine();
				if("exit".equals(input)) {
					break;
				}
				String result = new Manager().manage(input);
				System.out.println(result);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Bye!");
	}

	
	
}
