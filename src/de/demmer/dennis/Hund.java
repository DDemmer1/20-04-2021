package de.demmer.dennis;

public class Hund {
	
	private int alter;
	
	private String name;

	public Hund(int alter, String name) {
		super();
		this.alter = alter;
		this.name = name;
	}
	
	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		if(alter < 0) {
			this.alter = 0;
		} else {
			this.alter = alter;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
