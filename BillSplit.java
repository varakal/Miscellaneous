package newjavaproject;

import java.io.*;
import java.util.*;

public class BillSplit {

	public static void main(String[] args) {
	//	int a,b,c,d,e;
	//	Scanner inval=new Scanner(System.in);
	//	System.out.println("Enter the number of items");
	//	Scanner no=new Scanner(System.in);
	//	int num=no.nextInt();
		float anveshbill=0,pratheekbill=0,shreyasbill=0,vinaybill=0,vivekbill=0,finalval=0;
		for(int i=0;i<100;i++)
		{
			float anvesh=0,pratheek=0,shreyas=0,vinay=0,vivek=0,price=0;
			Scanner bill=new Scanner(System.in);
			System.out.println("Enter the price of the article");
			price=bill.nextFloat();
			if(price==1234)						// If 1234 is entered the loop will end
			{
				break;
			}
			finalval=finalval+price;
//			System.out.println("enter the req of Anvesh");
//			anvesh=bill.nextFloat();
			System.out.println("enter the req of Pratheek");
			pratheek=bill.nextFloat();
			System.out.println("enter the req of Shreyas");
			shreyas=bill.nextFloat();
			System.out.println("enter the req of Vinay");
			vinay=bill.nextFloat();
			System.out.println("enter the req of Vivek");
			vivek=bill.nextFloat();
			System.out.println("*********************************");
			float value=price/(pratheek+shreyas+vinay+vivek);
//			if(anvesh==1)
//			{
//				anveshbill+=value;
//			}
			if(pratheek==1)
			{
				pratheekbill+=value;
			}
			if(shreyas==1)
			{
				shreyasbill+=value;
			}
			if(vinay==1)
			{
				vinaybill+=value;
			}
			if(vivek==1)
			{
				vivekbill+=value;
			}
		}
		System.out.println("Enter the TAX/TIP");
		System.out.println("**********************************");
		Scanner taxval=new Scanner(System.in);
		float tax=taxval.nextFloat();
		finalval+=tax;
		tax=tax/4;
	//	anveshbill+=tax;
		pratheekbill+=tax;
		shreyasbill+=tax;
		vinaybill+=tax;
		vivekbill+=tax;
//		anveshbill= (float) (Math.round(anveshbill*100.0)/100.0);
//		pratheekbill= (float) (Math.round(pratheekbill*100.0)/100.0);
//		shreyasbill= (float) (Math.round(shreyasbill*100.0)/100.0);
//		vinaybill= (float) (Math.round(vinaybill*100.0)/100.0);
//		vivekbill= (float) (Math.round(vivekbill*100.0)/100.0);
//		float finalvalcheck=anveshbill+pratheekbill+shreyasbill+vinaybill+vivekbill;
//		if(finalval==finalvalcheck)
//		{
//			System.out.println("THE FINAL BILL IS = "+finalval);
//			System.out.println("+++++++++++++++++++++++++++++");
//		}
//		else
//		{
//			System.out.println("The final bill value should be "+finalval+" but it is "+finalvalcheck);
//			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		}
		System.out.println("THE FINAL BILL IS = "+finalval);
		System.out.println("+++++++++++++++++++++++++++++");
		//System.out.println("ANVESHBILL VALUE IS = "+ anveshbill);
		System.out.println("PRATHEEKBILL VALUE IS = "+ pratheekbill);
		System.out.println("SHREYASBILL VALUE IS = "+ shreyasbill);
		System.out.println("VINAYBILL VALUE IS = "+ vinaybill);
		System.out.println("VIVEKBILL VALUE IS = "+ vivekbill);
	}

}
