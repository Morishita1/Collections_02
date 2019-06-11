package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreRankExec_01 {

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
		System.out.println("====================================================");
		
		
		System.out.println("빅데이터반 성적처리");
		System.out.println("----------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		for(ScoreVO vo:sVOs) {
			System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\n",
					vo.getNumber(),
					vo.getKor(),
					vo.getEng(),
					vo.getMath(),
					vo.getTotal(),
					vo.getAverage(),
					vo.getRank()
					);
		}
		System.out.println("====================================================");
		// 총점을 기준으로 내림차순 정렬을 한다.
		
		for(int i=0;i<sVOs.length;i++) {
			// 부등호의 방향 > : 오름차순 정령
			// 부등호의 방향 < : 내림차순 정령
			//for(int j=i+1;j<sVOs.length;j++) {
			for(int j=i+1;j<sVOs.length;j++) {
				if(sVOs[i].getTotal()<sVOs[j].getTotal()) {
					ScoreVO _score=sVOs[i];
					sVOs[i]=sVOs[j];
					sVOs[j]=_score;
					
				}
			}
		}
		// 내림차순 정렬된 상태에서 rank 필드에 석차를 추가
		for(int i=0;i<sVOs.length;i++) {
			sVOs[i].setRank(i+1);
		}
		for(int i=0;i<sVOs.length;i++) {
			for(int j=i+1;j<sVOs.length;j++) {
				if(Integer.valueOf(sVOs[i].getNumber())>Integer.valueOf(sVOs[j].getNumber())) {
					ScoreVO _score=sVOs[i];
					sVOs[i]=sVOs[j];
					sVOs[j]=_score;
					
				}
			}
		}
		
		System.out.println("====================================================");
		
		
		System.out.println("빅데이터반 성적처리");
		System.out.println("----------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		for(ScoreVO vo:sVOs) {
			System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\n",
					vo.getNumber(),
					vo.getKor(),
					vo.getEng(),
					vo.getMath(),
					vo.getTotal(),
					vo.getAverage(),
					vo.getRank()
					);
		}
		System.out.println("====================================================");

		}

}
