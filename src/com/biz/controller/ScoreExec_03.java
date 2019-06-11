package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_03 {

	public static void main(String[] args) {

		// ScoreVO 클래스를 이용해서 10개의 배열을 생성하고
		// 번호는 순서대로 설정하고
		// 이름은 입력자지 않고
		// kor, eng, math 점수를 각각 난수로 생성해서 저장
		//        단 점수는 51~100까지
		// 입력(저장된)값을 콘솔에서 확인하고
		// 총점과 평균 계산해 봅시다.
		
		ScoreVO[] sVOs=new ScoreVO[10];
		Random rnd=new Random();
		
		for(int i=0;i<sVOs.length;i++) {
			int j= 0;
			j=rnd.nextInt(50)+51;
			sVOs[i]=new ScoreVO();
			sVOs[i].setNumber(""+(i+1));
			sVOs[i].setName("");
			sVOs[i].setKor(j);
			j=rnd.nextInt(50)+51;
			sVOs[i].setEng(j);
			j=rnd.nextInt(50)+51;
			sVOs[i].setMath(j);
			int intToral=sVOs[i].getKor();
			intToral+=sVOs[i].getEng();
			intToral+=sVOs[i].getMath();
			sVOs[i].setTotal(intToral);
			sVOs[i].setAverage(intToral/3);
		}
		for(int i=0;i<sVOs.length;i++ ) {
			System.out.println(sVOs[i].toString());
		}
		
	}

}
