package example;



public class Variable {
	int varType;
	final static int MAX_NO = 5; //����� �빮�� ���°� ������ fInal ���� �� �ٲ۴�
	 static int MAX_NO1 = 10; //Ŭ���� ����

	 public static void main(String[] args){
		 System.out.println(MAX_NO);
		 System.out.println(MAX_NO1);
		 MAX_NO1 = 101;
		 System.out.println(MAX_NO1);
	 }
	public final void showInfo(){
		System.out.println(varType);
	}	 
}

 class Animal{
	public void breathe(){
		System.out.println("���� ������");
	}
}

class person extends Animal{
	public void breathe(){
		System.out.println("��� ������");
	}
	 public static void main(String[] args){
		 person obj = new person();
		 obj.breathe();
				 
	 }
}




class sum {
	public int sum(int A, int B){
		int c;
		c = A + B;
		return c;
	}
}

class student extends sum  {
	 public static void main(String[] args){
		 student st = new student();
		 int Q;
		 Q = st.sum(15, 155);
		 System.out.println(Q);
	 }
}