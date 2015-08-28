import java.lang.reflect.Method;


public class InvokeTester {
	public int add(int param1 ,int param2) {
		return param1 + param2;
	}
	
	public String echo(String mesg) {
		return "echo" + mesg;
	}
	
	public static void main(String[] argvs) throws Exception {
		Class clz = InvokeTester.class;
		Object invokObject = clz.newInstance();
		Method addMethod = clz.getMethod("add", new Class[]{ int.class,int.class});
		Object result = addMethod.invoke(invokObject, new Object[]{new Integer(100),new Integer(100)});
		System.out.println(result);
	}
}
