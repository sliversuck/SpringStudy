package domain;

public class Person {
	private Integer id;
	private String name;
	private String address;
	public Person() {
		System.out.println("Person对象被创建");
	}
	
	public Person(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("person三参");
	}
	
	public Person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("person两参");
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
