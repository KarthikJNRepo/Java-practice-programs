package New;

import java.util.ArrayList;

public class CircularPrimeTest {
	public static void main(String[] args) {
	for(int num2=100;num2<=999;num2++) {
	int num=num2,counter=1,first=0,second=0,third=0,fourth=0,fifth=0,six=0,seven=0,num1=0;boolean flag=true;
	while(num>0) {int rem=num%10; if(counter==1) {first=rem;}else if (counter==2) {second=rem;}else if (counter==3) {third=rem;} else if (counter==4) {fourth=rem;} else if (counter==5) {fifth=rem;} else if (counter==6) {six=rem;} else {seven=rem;}counter++;num=num/10;}
	if(num2<110) { System.out.println("num2 "+(num2)+" first "+first);
	  System.out.println("num2 "+(num2)+" second "+second);
	  System.out.println("num2 "+(num2)+" third "+third); }
	 
	for(int i=1;i<counter;i++) {num1=0;
	for(int j=1;j<counter;j++) {
		if(i==1) {
			if(j==1) {num1=num1*10+first;}
			else if(j==2) {num1=num1*10+second;}
			else if(j==3) {num1=num1*10+third;}
			else if(j==4) {num1=num1*10+fourth;}
			else if(j==5) {num1=num1*10+fifth;}
			else if(j==6) {num1=num1*10+six;}
			else {num1=num1*10+seven;}
			
			}
		else if(i==2) {
			if(j==1) {num1=num1*10+second;}
			else if(j==2) {num1=num1*10+third;}
			else if(j==3) {num1=num1*10+fourth;}
			else if(j==4) {num1=num1*10+fifth;}
			else if(j==5) {num1=num1*10+six;}
			else if(j==6) {num1=num1*10+seven;}
			else {num1=num1*10+first;}
			}
		else if(i==3) {
			if(j==1) {num1=num1*10+third;}
			else if(j==2) {num1=num1*10+fourth;}
			else if(j==3) {num1=num1*10+fifth;}
			else if(j==4) {num1=num1*10+six;}
			else if(j==5) {num1=num1*10+seven;}
			else if(j==6) {num1=num1*10+first;}
			else {num1=num1*10+second;}
			}
		else if(i==4) {
			if(j==1) {num1=num1*10+fourth;}
			else if(j==2) {num1=num1*10+fifth;}
			else if(j==3) {num1=num1*10+six;}
			else if(j==4) {num1=num1*10+seven;}
			else if(j==5) {num1=num1*10+first;}
			else if(j==6) {num1=num1*10+second;}
			else {num1=num1*10+third;}
			}
		else if(i==5) {
			if(j==1) {num1=num1*10+fifth;}
			else if(j==2) {num1=num1*10+six;}
			else if(j==3) {num1=num1*10+seven;}
			else if(j==4) {num1=num1*10+first;}
			else if(j==5) {num1=num1*10+second;}
			else if(j==6) {num1=num1*10+third;}
			else {num1=num1*10+fourth;}
			}
		else if(i==6) {
			if(j==1) {num1=num1*10+six;}
			else if(j==2) {num1=num1*10+seven;}
			else if(j==3) {num1=num1*10+first;}
			else if(j==4) {num1=num1*10+second;}
			else if(j==5) {num1=num1*10+third;}
			else if(j==6) {num1=num1*10+fourth;}
			else {num1=num1*10+fifth;}
			}
		else if(i==7) {
			if(j==1) {num1=num1*10+seven;}
			else if(j==2) {num1=num1*10+first;}
			else if(j==3) {num1=num1*10+second;}
			else if(j==4) {num1=num1*10+third;}
			else if(j==5) {num1=num1*10+fourth;}
			else if(j==6) {num1=num1*10+fifth;}
			else {num1=num1*10+six;}
			}
		
		
		//if(i==2) {if(j==1) {num1=num1*10+second;}else if(j==2) {num1=num1*10+third;}else {num1=num1*10+first;}}
		//if(i==3) {if(j==1) {num1=num1*10+third;}else if(j==2) {num1=num1*10+first;}else {num1=num1*10+second;}}
	}
	for(int k=2;k<num1/2;k++) {if(num1%k==0) {flag=false;
			/* System.out.println("i "+i+" k "+k+" "+flag+" num1 "+num1); */break;}}} 
	if(flag==true) { System.out.println(num2);}
	}
	}
}
