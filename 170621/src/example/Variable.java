package example;



public class Variable {
	int varType;
	final static int MAX_NO = 5; //상수는 대문자 쓰는게 보변적 fInal 값을 못 바꾼다
	 static int MAX_NO1 = 10; //클래스 변수

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
		System.out.println("동물 숨쉬기");
	}
}

class person extends Animal{
	public void breathe(){
		System.out.println("사람 숨쉬기");
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