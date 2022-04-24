package codeup;

import java.util.Scanner;

// 1755 : 확장자 확인하기 
// 파일.확장자의 형태로 입력된다.
// 파일명은 알파벳 대소문자와 숫자로만 구성되고, 입력은 100글자 이하이다.
// 프로그램의 영문 이름을 출력한다. 
// (출력명은 명령프롬프트에 ASSOC를 쳤을 때 나오는 결과에 따른다.)

public class codeup1755 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String file = sc.nextLine();
		int index = file.indexOf('.');
		String extend = file.substring(index);
				
		switch(extend) {
		 	case ".dib" : System.out.println("Paint.Picture"); break;
	        case ".doc" : System.out.println("Word.Document.8"); break;
	        case ".docx" : System.out.println("Word.Document.12"); break;  
	        case ".htm" : System.out.println("htmfile"); break;  
	        case ".html" : System.out.println("htmlfile"); break;  
	        case ".hwp" : System.out.println("Hwp.Document.96"); break;  
	        case ".hwpx" : System.out.println("Hwp.Document.hwpx.96"); break;  
	        case ".hwt" : System.out.println("Hwp.Document.hwt.96"); break;  
	        case ".jpe" :
	        case ".jpg" :
	        case ".jpeg" : System.out.println("jpegfile"); break;
	        case ".ppt" : System.out.println("PowerPoint.Show.8"); break;  
	        case ".pptx" : System.out.println("PowerPoint.Show.12"); break;  
	        case ".pptxml" : System.out.println("powerpointxmlfile"); break;
		}
	}
}
