package com.paulinopjc.nextPrimeNum;

public class Prime {
	
	public int Prime(int n) {
		
		int pNum=0; 
		int mod;
		
		if(n==0) {
			pNum = 1;
		}
		
		else if(n==1) {
			pNum=2;
		}
		
		else {
			for(int i=n+1; i>=n+1; i++) {
				
				int counter = 0;
				for(int j=2; j<=i; j++) {
					
					mod = i%j;
					
					if(mod == 0) {
						counter++;
					}
					
				}
				if(counter<2) {
					pNum = i;
					break;
				}
				
			}
		}
		return pNum;
	}

}
