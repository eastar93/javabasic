package Chapter05;

class Product {
	private String name; // 멤버변수 선언
	private int price;
	
	public Product(String name, int price) { // 생성자
		this.name = name;
		this.price = price;
	}
	public boolean equals(Object obj) { // equals 메서드 재정의
		boolean result = false;
		if((obj != null) && (obj instanceof Product)) {
			Product p = (Product) obj;
			if((name.equals(p.name)) && (price == p.price)) {
				result = true;
			}
		}
		return result;
	}
	public int hashCode() { // 해시코드 메서드 재정의
		return ( (name.hashCode()) 
						^ (new Integer(price).hashCode())); 		
	}
	public String toString() { // toString 메서드 재정의
		return name;
	}
}

