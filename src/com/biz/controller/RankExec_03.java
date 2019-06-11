package com.biz.controller;

import java.util.Random;

public class RankExec_03 {

	public static void main(String[] args) {

	int[] intNum=new int[10];
	int[] intKor=new int[10];
	int[] intEng=new int[10];
	int[] intMath=new int[10];
	int[] intTotal=new int[10];
		
	Random rnd=new Random();
	for(int i=0; i<intNum.length;i++) {
		intKor[i]=rnd.nextInt(50)+51;
		intEng[i]=rnd.nextInt(50)+51;
		intMath[i]=rnd.nextInt(50)+51;
		intNum[i]=i+1;
		intTotal[i]=intKor[i];
		intTotal[i]+=intEng[i];
	    intTotal[i]+=intMath[i];
	}
	for(int i=0;i<intNum.length;i++) {
		for(int j=i+1;j<intNum.length;j++) {
			if(intTotal[i]>intTotal[j]){
				int _tota=intTotal[i];
				intTotal[i]=intTotal[j];
				intTotal[j]=_tota;
				int _Kor=intKor[i];
				intKor[i]=intKor[j];
				intKor[j]=_Kor;
				int _Eng=intEng[i];
				intEng[i]=intEng[j];
				intEng[j]=_Eng;
				int _Num=intNum[i];
				intNum[i]=intNum[j];
				intNum[j]=_Num;
				int _Math=intMath[i];
				intMath[i]=intMath[j];
				intMath[j]=_Math;
			}
		}
		
	}
	System.out.println("=====================================");
	System.out.println("빅데이터반 성적처리");
	System.out.println("-------------------------------------");
	System.out.println("학번\t국어\t영어\t수학\t총점\t");
	System.out.println("-------------------------------------");
	int index=0;
	for(int num:intNum) {
		System.out.printf("%d\t%d\t%d\t%d\t%d\t \n",num,intKor[index],intEng[index],intMath[index],intTotal[index++]);
		
	}
	System.out.println("=====================================");
	
	}

}
