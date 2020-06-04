
public class Anonymous {
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("자전거");
		}
	};

	void method1() {
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차");
			}
		};
		localVar.run();
	}

	void method2(Vehicle v) {
		v.run();
	}
}