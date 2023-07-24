package LabBookCoreJava;

public class ModifyingStaticMember {
	public static void main(String[] args) {
		ModifyingStaticMember obj=new ModifyingStaticMember();
		obj.modifyStaticMember();
	}
	private	static int staticValue=30;
	
	public void modifyStaticMember() {
		System.out.println("Before modifing "+staticValue);
		staticValue=35;//static values can be modifies 
		System.out.println("After Modifying static member  :"+staticValue);
	}
}
