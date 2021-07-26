package Chapter08;

//import org.apache.commons.codec.binary.Base64;

public class Base64Test {
	
	public static void main(String[] args) {
		
		String text = "some string테스트";
		
		/* base64 encoding */
//		byte[] encoded = Base64.encodedBase64(text.getBytes());
		
		/* base64 decoding */
//		byte[] decoded = Base64.decodeBase64(encoded);
		System.out.println("인코딩 전 : " + text);
//		System.out.println("인코딩 text : " + new String(encoded));
//		System.out.println("디코딩 text : " + new String(decoded));
	}
}
