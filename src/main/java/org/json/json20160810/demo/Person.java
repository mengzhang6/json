package org.json.json20160810.demo;

import java.util.List;

public class Person {
	private String name;
	private int age;
	private List<String> major;
	private boolean has_girlfriend;
	private String birthday;
	private Object house;
	private transient String ignore;

	public String getIgnore() {
		return ignore;
	}

	public void setIgnore(String ignore) {
		this.ignore = ignore;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Object getHouse() {
		return house;
	}

	public void setHouse(Object house) {
		this.house = house;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getMajor() {
		return major;
	}

	public void setMajor(List<String> major) {
		this.major = major;
	}

	public boolean isHas_girlfriend() {
		return has_girlfriend;
	}

	public void setHas_girlfriend(boolean has_girlfriend) {
		this.has_girlfriend = has_girlfriend;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", major="
				+ major + ", has_girlfriend=" + has_girlfriend
				+ ", birthday=" + birthday + ", house=" + house + "]";
	}
}