/**
 * 计算从1~N个整数的和，分别采用数学思维和计算机思维进行解题
 * @author rale
 *
 */
public class AdditionFromOneToN {

	/**
	 * 通过循环依次将值加入结果的寄存器中
	 * @param n
	 * @return 1-n所有数字的和
	 */
	public static int methodOne(int n){
		if(n<=0) throw new RuntimeException("n cannot be less than zero");
		int result = 0;
		for(int i = 1 ; i<=n ; i++){
			result += i;
		}
		return result;
	}
	
	/**
	 * 直接使用数学公式进行解答
	 * @param n
	 * @return 1-n所有数字的和
	 */
	public static int methodTwo(int n){
		if(n<=0) throw new RuntimeException("n cannot be less than zero");
		return ( 1 + n ) * n / 2;
	}
	
	/**
	 * 可以直接运行main方法来查看输出结果
	 * @param args
	 */
	public static void main(String[] args){

		System.out.println("通过计算机思维得出的计算结果为：" + methodOne(1));
		System.out.println("通过数学思维得出的计算结果为："+methodTwo(1));
		
	}
}
