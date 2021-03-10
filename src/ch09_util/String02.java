package ch09_util;

import java.io.UnsupportedEncodingException;

//예) 네트워크로  문자열을 전송하거나, 문자열을 암호화할 때  문자열을 바이트 배열로 변환한다
//getBytes() : String을 byte배열로 변환 =>예)  byte[]  bytes ="문자열".getBytes();
//getBytes(Charset charset) : String을 byte배열로 변환 =>예)  byte[]  bytes ="문자열".getBytes(Charset charset);


/*참고
 * 어떤 charset으로 인코딩하느냐에 따라서  바이트배열의 크기가 달라진다
 * EUC-KR은  알파벳은 1byte, 한글은 2byte로 변환
 * UTF-8 은  알파벳은 1byte, 한글은 3byte로 변환
 * 
 * 참고 
 * 컴퓨터는 문자를 인식할 수 없기 때문에 숫자로 변환되어 저장됩니다. 
 * 변환해주기 위해서는 기준이 있어야하는데 이것을 문자 코드라고 하며
 * 대표적으로 ASCII코드 또는 유니코드가 있습니다.
 *
 * 인코딩 :문자 코드를 기준으로 문자를 코드로 변환하는 것을 문자 인코딩(encoding)
 * 디코딩 :코드를 문자로 변환하는 것을 문자 디코딩(decoding)

 * 
 * 참고	문자 인코딩(character encoding)이란?
 *  -인코딩
 * 	-사용자가 입력한 문자나 기호들을 컴퓨터가 이용할 수 있는 신호로 만드는 것을 말한다. 
 *   넓은 의미의 컴퓨터는 이러한 신호를 입력받고 처리하는 기계를 뜻하며, 
 *   신호 처리 시스템을 통해 이렇게 처리된 정보를 사용자가 이해할 수 있게 된다.
 *   이 신호를 입력하는 인코딩과 문자를 해독하는 디코딩하기 위해선 
 *   	미리 정해진 기준을 바탕으로 입력과 해독이 처리되어야 하는데, 
 * 		이를 문자열 세트 또는 문자셋라고 한다. 
 * 	 초기 보급형 컴퓨터의 문자열 세트는 아스키나 EBCDIC이 표준이었으나, 
 *   	이러한 문자열 세트는 세계 곳곳에 인터넷이 보급되며 표현해야 할 문자가 증가하면서 
 *   	이러한 문자셋들을 표준화하기 위해 많은 대체 방식이 개발되었다. 
 * 		표준 문자셋을 개발하는 것에 대한 논의가 이어졌고, 후에는 유니코드가 등장하게 되었다.
 * 
 * 참고 유니코드란?
 * 	유니코드(Unicode)는 전 세계의 모든 문자를 
 *      컴퓨터에서 일관되게 표현하고 다룰 수 있도록 설계된 산업 표준
 * 
 * 참고  UTF-8?
 *  Universal Coded Character Set + Transformation Format – 8-bit 의 약자. 
 * 	유니코드를 위한 가변 길이 문자 인코딩 방식 중 하나.
 *  UTF-8 인코딩은 유니코드 한 문자를 나타내기 위해 1바이트에서 4바이트까지를 사용.
 *      
 * 참고  EUC-KR란?
 * 	8비트 문자 인코딩.
 *  대표적인 한글 완성형 인코딩이기 때문에 보통 완성형이라고 불린다.
 */
public class String02 {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[]  bytes1 = str.getBytes();
		System.out.println("bytes1.length="+bytes1.length);//15
		String str1 = new String(bytes1);  //new String(byte[] bytes);
		System.out.println("bytes1->String str1으로 변환="+str1);  //안녕하세요
		System.out.println("-----------------");
		
		//Unhandled exception type UnsupportedEncodingException
		try {
			//EUC-KR을 이용해서 인코딩
			byte[] bytes2 = str.getBytes("EUC-KR");//getBytes(Charset charset)
			System.out.println("bytes2.length="+bytes2.length);//10
			
			//EUC-KR을 이용해서 디코딩
			String str2 = new String(bytes2,"EUC-KR");//new String(byte[] bytes, Charset charset)
			System.out.println("bytes2->String str2으로 변환="+str2);//안녕하세요
			System.out.println("------------------");
			
			//UTF-8을 이용해서 인코딩
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length="+bytes3.length);//15
			
			//UTF-8을 이용해서 디코딩
			String str3 = new String(bytes3,"UTF-8");
			System.out.println("bytes3->String str3으로 변환="+str3);//안녕하세요
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		
		
	}

}







