package prob3;

public class Prob3 {

	public static void main(String[] args) {
		String str = "모든 프로그램은 Java 언어로 개발 될 수 있습니다.";

		if(str.contains("자바")){
			str.replace("자바", "JAVA");
		}
		System.out.println(str);

	}
}
