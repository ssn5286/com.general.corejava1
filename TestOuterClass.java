package com.general.corejava;

public class TestOuterClass {

	class Inner {
		void msg() {
			System.out.println("Hi from  - " + this.getClass());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Non-static member inner class
		//*Modified to validate 02/11/2023
		TestOuterClass o = new TestOuterClass();
		TestOuterClass.Inner i = o.new Inner();
		i.msg();
		// Non-static abstract anonymous inner class
		PersonX p1 = new PersonX() {
			void eat() {
				System.out.println("Name of the object - " + this.getClass().getName());
			}
		};
		p1.eat();
		// Non-static interface anonymous inner class
		PersonY p2 = new PersonY() {

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("Eats sambhar, rasam and curd ");

			}
		};

		p2.eat();
		//
		LocalInnerClass lIC = new LocalInnerClass();
		lIC.display();
		// Static inner class
		StaticInnerClassExample.StaticInner sICE = new StaticInnerClassExample.StaticInner();
		sICE.display();
		StaticInnerClassExample.StaticInner.staticDisplay();
		// Nested Interface
		Test1NestedInterface t1NI = new Test1NestedInterface();
		t1NI.msg();
		Test2NestedInterface t2NI = new Test2NestedInterface();
		t2NI.msg1();

	}

}

abstract class PersonX {
	abstract void eat();

}

interface PersonY {
	void eat();

}

class LocalInnerClass {
	int i = 30;

	void display() {
		class InnerClass {
			void msg() {
				System.out.println("This message is from Inner class");
			}
		}
		InnerClass iC = new InnerClass();
		iC.msg();
	}

}

class StaticInnerClassExample {

	static int data = 30;

	static class StaticInner {

		void display() {
			System.out.println("Data = " + data);

		}

		static void staticDisplay() {
			System.out.println("Static Data = " + data);
		}

	}

}

interface OuterInterface {
	void show();

	interface InnerInterface {
		void msg();
	}
}

class Test1NestedInterface implements OuterInterface.InnerInterface {

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("This message is from Test1NestedInterface InnerInterface message class");

	}

}

class OuterClass {
	public void show() {
		System.out.println("This is from OuterClass show method");
	}

	interface OuterClassInnerInterface {
		void msg1();
	}
}

class Test2NestedInterface implements OuterClass.OuterClassInnerInterface {

	@Override
	public void msg1() {
		// TODO Auto-generated method stub
		System.out.println("This is from Test2NestedInterface OuterClass OuterClassInnerInterface message1");

	}

}