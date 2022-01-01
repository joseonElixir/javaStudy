package day09;

public class Day09_08 {
	
	public static void main(String[] args) {
		//로또 랜덤번호 입력 
		
		int jot[]=new int[6];
		
		for(int i=0;i<jot.length;i++) {
			//1개씩 숫자를 뽑은 후 중복검사를 돌린다는 발상을 못했음.
			//1번째로 뽑히는 숫자는 중복일 확률이 없기 때문에
			//2번째로 뽑히는 숫자를 1번과 비교해서 중복일 경우 리롤
			//이 구간을 통과하면 1번과 2번은 서로 다른 숫자가 됨.
			//3번째로 뽑히는 숫자를 중복검사를 할 때 1번과 2번은 서로 다른 숫자이기 때문에
			//일어날 수 있는 중복의 숫자는 최대 1.
			//즉, 경우의 수는 최대 1번의 중복과 중복없음.
			//이게 반복.
			jot[i]=(int)(Math.random()*45+1);
			for(int j =0;j<i;j++) {
				if(jot[i]==jot[j]) {
					i--;
				}
				
			}
			
		}//부모 for문 끝.
		
		System.out.println("좆같은 번호 6개");
		for(int i=0;i<jot.length;i++) {
			System.out.print(jot[i]+" ");
		}
		
	}

}
