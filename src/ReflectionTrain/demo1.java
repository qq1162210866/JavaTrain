package ReflectionTrain;

/**
 * 
 * @author yanyu
 *
 */
public class demo1 
{
	public static void main(String[] args)
	{
		try{
			//通过类的路径来获取Class
			/*
			 * 1 class.forName("类的路径")
			 * 2 类名.Class
			 * 3 实例.getClass
			 */			
 			Class a=Class.forName("ReflectionTrain.Sub");
 			/**
 			 * 1 newInstance: 弱类型。低效率。只能调用无参构造。
 			 * 2 new: 强类型。相对高效。能调用任何public构造。
 			 */
 			Base b=(Base)a.newInstance();
 			//为什么打印的是 Sub？
 			b.f();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
/**
 * 
 * @author yanyu
 *
 */
class Base
{
	public void f()
	{
		System.out.println("Base");
	}
}

/**
 * 
 * @author yanyu
 *
 */
class Sub extends Base
{
	public void f()
	{
		System.out.println("Sub");
	}
	
}
