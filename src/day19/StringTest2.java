package day19;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "hello";
		
		String arr[] = {"a","b","c"};
		
		System.out.println("str = "+str.toString());
		System.out.println(arr);
		//�츮�� toString�� �Ƚᵵ �ڵ����� ����.
		//����Ŭ���������� ��������, ���Ŭ���������� �������� ��µȴ�.
		
		
		System.out.println(str.concat(" java"));
	
		System.out.println(str.substring(2,4)); //���ϴ� ������ ������ ����ϴ� substring ���.
		
		StringBuffer sb = new StringBuffer("hello java"); //StringBuffer Ŭ����. ���ڿ��� ������ �����ϴ� ���.
		System.out.println(sb.toString() );
		sb.append(" jsp"); //������ �̾���� �� �ִ�.
		System.out.println(sb); 
		sb.insert(6, "hi!!");//���ϴ� ��ġ�� ���ϴ� ������ ���� �� �ִ�.
		System.out.println(sb);
		sb.delete(10, 14);//���ϴ� ������ ������ ���� �� �ִ�.
		System.out.println(sb);
		//���ڿ��� ����. ���ϴ� �������� ��� ���ڿ��� ������ �� �ִ�.
		
		
		
		
		
		
	}
	
}
