package Ch08GenericTest;

public class GenericTest {
	public static void main(String[] args) {
		
		//K는 Tv로 대체 , M은 String 으로 대체
		Product<Tv, String> product1 = new Product<>();
		
		//Setter 매개값은 반드시 Tv와 String을 제공
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		
		//Getter 리턴값은 Tv와 String이 됨
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//K는 Car고 대체 , M은 String으로 대체
		
		Product<Car, String> product2= new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("스포츠카");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println(product1.getModel());
		System.out.println(product2.getModel());
	}

}
