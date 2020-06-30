package com.wopro.arrays;

public class Ex8 {
	public static void main(String[] args) {
		int a[]= {10,3,5,7,24,35,67};
		int s=0,six=-1,sev=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==6)
				six=i;
			if(a[i]==7)
				sev=i;
		}
		if(sev==-1)
			sev=-1;
		for(int i=0;i<a.length;i++) {
			if(six!=-1&&i>=six&&i<=sev)
				continue;
			s=s+a[i];
		}
		System.out.println(s);
	}

}
