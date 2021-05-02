import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Lesleey
 * @date 2020/12/9-5:15
 * @function
 */
public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		ApplicationContext applicationContet = new ClassPathXmlApplicationContext("applicationContext.xml");
		User bean = applicationContet.getBean(User.class);
		System.out.println(bean.name);
	}
}
