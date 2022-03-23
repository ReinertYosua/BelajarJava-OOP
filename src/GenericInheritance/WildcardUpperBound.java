package GenericInheritance;

import java.util.List;

class A {}
class B extends A{}
class C extends B{}
class D extends C{}

public class WildcardUpperBound {

	public static void main(String[] args) {
		List<A> a = Arrays.asList(new A());
	    List<B> b = Arrays.asList(new B());
	    List<C> c = Arrays.asList(new C());
	    List<D> d = Arrays.asList(new D());

	    extendsParam(a); // error as A is not assignable to B
	    extendsParam(b);
	    extendsParam(c); 
	    extendsParam(d); // 3 previous ok as they can produce B

	    superParam(a);
	    superParam(b);
	    superParam(c); // 3 previous ok as they can consume C
	    superParam(d); // error as C is not assignable to D

	    extendsSuperParam(a); // error as A is not assignable to B
	    extendsSuperParam(b);
	    extendsSuperParam(c); // 2 previous ok as they can consume C and produce B
	    extendsSuperParam(d); // error as C is not assignable to D

	}
	public static void extendsParam(List<? extends B> blist)
	{
	    B b = blist.get(0);
	    blist.add(new C()); // error
	}

	public static void superParam(List<? super C> clist)
	{
	    B b = clist.get(0); // error
	    clist.add(new C());
	}

	public static void extendsSuperParam(List<???> bclist)
	{
	    B b = bclist.get(0); // ok
	    bclist.add(new C()); // ok
	}
}
