
public class Exam14_2 {
	public static void main(String[] args) {
		Anonymous ano = new Anonymous();
		ano.field.run();
		ano.method1();
		ano.method2(new Vehicle() { 

			@Override
			public void run() {
				System.out.println("Ʈ��");
			}
		});
	}
}