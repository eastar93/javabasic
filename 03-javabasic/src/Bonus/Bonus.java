package Bonus;

public class Bonus {
	
	public static void main(String[] args) {
		
		for(int x=1; x<=16; x++) //x를 1로 시작해서 y값 for문으로 들어간다. if문이 끝나면 돌아와서 1을 증가시킨다.
		{
			for(int y=1; y<=13; y++) //y를 1~12까지 반복해서
			{
				if((4*x)+(5*y)==60) //x값과 y값을 대입시켜서 60이 된다면 아래 출력문 출력/60이 안된다면 다시 x값for문으로 돌아간다
				{
				System.out.printf("x의 해 : %d%n",x);
				System.out.printf("y의 해 : %d%n",y);
				System.out.println("---------");
				}
			}
		}
	}
}
