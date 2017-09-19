/**
 * 在这里实现视频中一个关于封装的例子
 * 假设需求分别为
 * 1.打印一个*符
 * 2.打印两个*符
 * 3.打印100个*符
 * 4.打印100个*#符
 * 
 * 通过封装和多态，可以最大程度上提高代码的可读性以及代码的可复用性
 * @author rale
 *
 */
public class SimplePrint {
	
	/**
	 * 在终端输出一个字符c
	 * @param character
	 */
	public static void print(char c){
		System.out.print(c);
	}
	
	/**
	 * 在终端输出字符串s
	 * @param s
	 */
	public static void print(String s){
		System.out.print(s);
	}
	
	/**
	 * 在终端输出c字符count次
	 * @param c
	 * @param count
	 */
	public static void print(char c, int count){
		if(count<0) throw new RuntimeException("count cannot be less than 0");
		for(int i = 0 ; i<count ; i++){
			print(c);
		}
	}
	
	/**
	 * 在终端输出s字符串count次
	 * @param s
	 * @param count
	 */
	public static void print(String s, int count){
		if(count<0) throw new RuntimeException("count cannot be less than 0");
		for(int i = 0 ; i<count ; i++){
			print(s);
		}
	}
	
	/**
	 * 换行
	 */
	public static void newLine(){
		System.out.println();
	}
	
	/**
	 * 可以直接运行main方法来查看输出结果
	 * @param args
	 */
	public static void main(String[] args){
		print('*');
		newLine();
		print('*', 2);
		newLine();
		print('*', 100);
		newLine();
		print("*#", 100);
	}
}
