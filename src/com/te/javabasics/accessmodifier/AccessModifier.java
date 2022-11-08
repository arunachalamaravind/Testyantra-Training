package com.te.javabasics.accessmodifier;

import java.lang.reflect.Array;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier accessModifier = new AccessModifier();
		accessModifier.arunDefault();
		accessModifier.arunPrivate();
		accessModifier.arunProtected();
		accessModifier.arunPublic();
		Array array = new Array();
	}

	public void arunPublic() {
		System.out.println("public access modifier");
	}

	private void arunPrivate() {
		System.out.println("private access modifier");
	}

	void arunDefault() {
		System.out.println("Default access modifier ");
	}

	protected void arunProtected() {
		System.out.println("protected access modifier");
	}
}
