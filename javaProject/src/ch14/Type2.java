package ch14;

public class Type2 {
	private Object value;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue(32.55);
		System.out.println(t.getValue());
		t.setValue("33ㅇ3");
		System.out.println(t.getValue());
		//이처럼 Object로 모든걸 처리하게 되면 내부적으로 형변환 등의 처리가 많아지게 된다.
	}

}
