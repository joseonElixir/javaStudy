package day18;
import java. io.*;

public class ExceptTest5 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("몇개의 데이터를 입력하겠습니까");
			int num = Integer.parseInt(br.readLine());
			int arr[]= new int[num];
			for(int i=0;i<arr.length;i++) {
				System.out.print("데이터"+(i+1)+"값 : ");
				arr[i]= Integer.parseInt(br.readLine());
			}
			System.out.println("출력하고싶은 값은 몇번째에 있나요?");
			int result = Integer.parseInt(br.readLine())-1;
			System.out.println("선택한 값은 : "+arr[result]);
		}catch (NumberFormatException e) {
			System.out.println("숫자를 입력하시오");
			//e1.printStackTrace();
		}catch(NegativeArraySizeException e) {
			System.out.println("양수를 입력하시오");
			//e3.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("할당된 공간을 선택하시오");
			//e2.printStackTrace();
		}catch(IOException e) {
			System.out.println("IOException");
		}catch(Exception e) {
			System.out.println("아 몰루?");
		}
		finally {
			try {
				br.close();
				System.out.println("메모리가 반환되었다");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("끝!");	
		
	}
	
}
