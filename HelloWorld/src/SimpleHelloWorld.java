/**
 * 在命令行输出语句hello world
 * @author rale
 */
public class SimpleHelloWorld {

	/**
	 * 将打印的操作封装到方法中隐藏起来
	 */
	public static void printHelloWorld(){
		
		System.out.println("hello world!");
		
		//可以有多种实现，具体的实现对外不可见
		//System.out.print("hello ");
		//System.out.println("world");
	}
	
	/**
	 * 可以直接运行main方法来查看输出结果
	 * @param args
	 */
	public static  void main(String[] args){
		//直接调用打印语句
		System.out.println("hello world!");
		
		//调用打印hello world的方法，外部无需知道具体的内部实现
		
		printHelloWorld();
	}
}
