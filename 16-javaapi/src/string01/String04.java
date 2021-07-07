package string01;

public class String04 {
	
	public static void main(String[] args) {
		//length()는 문자열의 길이를 알 수 있습니다.
		//점수로 몇 글자인지 알려줍니다.
		String name = "김수한무 거북이와 두루미 삼천갑자 동박삭 치치카포 사리사라센타";
		System.out.println(name.length());
		
		//replace는 찾아바꾸기 입니다.
		//.replace("찾을단어", "바꿀단어"); 순으로 입력합니다.
		String report = "안녕하세요. 리포트 보고자는 김영수, 김영수 입니다.";
		report = report.replace("김영수", "신동규");
		System.out.println(report);
		
	}
}
