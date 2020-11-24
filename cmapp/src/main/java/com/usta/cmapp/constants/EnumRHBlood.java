package com.usta.cmapp.constants;

public enum EnumRHBlood {
	ABPOS("AB+","AB POS"),
	ABNEG("AB-","AB NEG"),
	APOS("A+","A POS"),
	ANEG("A-","A NEG"),
	BPOS("B+","B POS"),
	BNEG("B-","B NEG"),
	OPOS("O+","O POS"),
	ONEG("O-","O NEG");
	
	private String id;
	private String desc;
	
	private EnumRHBlood(String id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public String getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

}
