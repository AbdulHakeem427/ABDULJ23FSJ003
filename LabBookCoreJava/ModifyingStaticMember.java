package LabBookCoreJava;

public class ModifyingStaticMember {
	public static void main(String[] args) {
		Lab17b obj=new Lab17b();
		obj.modifyStaticMember();
	}
	private	static int staticValue=30;
	
	public void modifyStaticMember() {
		System.out.println("Before modifing "+staticValue);
		staticValue=35;//static values can be modifies 
		System.out.println("After Modifying static member  :"+staticValue);
	}
}
