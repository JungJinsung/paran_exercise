package example;
//12
public class seng {
	String A;
	String B;
	int C;
	
	public seng(String A, String B, int C){
		this.A = A;
		this.B = B;
		this.C = C;
			
	}
	public seng(String A, int C){
		this(A, " as ", C);
		
	}
	
	public seng(){
		
		System.out.println("�����ڰ� ȣ�� �Ǿ���");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		seng sc = new seng("h","i",26);
		seng as = new seng("h",26);
		seng af = new seng();
		
		sc.A="f";
		System.out.println(sc.A);
		
	}

}
