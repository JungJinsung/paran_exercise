package example;

public class class2 {

	
	int id;
	public class2(int x){this.id = x;}
	public void set(int x){this.id = x;}
	public int get(){return this.id;}
	
	
static void re(char a[]){
	for(int i = 0; i < a.length; i++)
		if(a[i] == ' ')
			a[i] = ',';
	
}
static void pri(char a[]){
	for(int i = 0; i < a.length; i++)
		System.out.print(a[i]);
		System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class2 ob1 = new class2(5);
		class2 ob2 = new class2(4);
		class2 ob3 = new class2(5);
		class2 s;
		ob1.set(7);
		
		System.out.println(ob1.id);
		s = ob2;
		ob1 = ob2;
		System.out.println(ob1.id);
		System.out.println(s.id);
		char c[] = {'T', 'h', 'i', 's', ' ','i', 's',' ', 'a', ' ', 'p', 'e', 'n' };
		pri(c);
		re(c);
		pri(c);
	}

}
