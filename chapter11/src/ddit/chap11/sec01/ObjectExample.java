package ddit.chap11.sec01;

public class ObjectExample {
	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass("全辨悼", "1234");
		
		ObjectClass obj2 = new ObjectClass("全辨悼", "1235");

		obj1 = obj2;
		
		if (obj1.equals(obj2) && obj1.hashCode() == obj2.hashCode()) {
			System.out.println("悼老 按眉");
		} else {
			System.out.println("促弗 按盲");
		}
		System.out.println("obj1 : " + obj1);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		// 历厘等 林家蔼

//		String st1 = "全辨悼";
//		if(st1.equals("全辨悼")) {
//			System.out.println("悼老 按眉");
//		}else {			
//			System.out.println("促弗 按盲");
//		}
	}
}

class ObjectClass {
	String name;
	String id;

	ObjectClass(String name, String id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ObjectClass) {
			ObjectClass object = (ObjectClass) obj;
			if (name.equals(object.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override
	public String toString() {
		//return getClass().getName()+'@'+Integer.toHexString(hashCode());
		return id +","+name;
	}
}