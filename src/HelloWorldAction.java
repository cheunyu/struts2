import com.opensymphony.xwork2.Action;

/**
 * @author:cheunyu
 * @date:2018/4/28 23:29
 */
public class HelloWorldAction{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String execute() throws Exception {
        System.out.println("Execute方法调用");
        return "success";
    }
}
