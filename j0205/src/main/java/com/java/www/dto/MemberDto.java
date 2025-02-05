package com.java.www.dto;

public class MemberDto {
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String gender;
	private String hobby;
	
	public MemberDto() {}
	public MemberDto(String id, String pw, String name, String tel, String gender, String hobby) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.gender = gender;
		this.hobby = hobby;
	}

	//Get Set
	public String getId() {return id;}
	public String getPw() {return pw;}
	public String getName() {return name;}
	public String getTel() {return tel;}
	public String getGender() {return gender;}
	public String getHobby() {return hobby;}
	
	public void setId(String id) {this.id = id;}
	public void setPw(String pw) {this.pw = pw;}
	public void setName(String name) {this.name = name;}
	public void setTel(String tel) {this.tel = tel;}
	public void setGender(String gender) {this.gender = gender;}
	public void setHobby(String hobby) {this.hobby = hobby;}
}//class