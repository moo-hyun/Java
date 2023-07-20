package confirm6;

class ShopService {
	private static ShopService instnce = new ShopService();
	
	public static ShopService getInstnce() {
		return instnce;
	}
	
	private ShopService() {}

	
	
	
}
public class Test6 {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstnce();
		ShopService obj2 = ShopService.getInstnce();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
	}

}
