package ActionInterfaceExample;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author:cheunyu
 * @date:2018/4/29 0:15
 */
public class HelloWorldAction implements Action {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String execute() throws Exception {
        System.out.println(this.getClass().getName() + " execute方法");
        if ("SECRET".equals(name)) {
            return this.SUCCESS;
        }else {
            return this.ERROR;
        }
    }
}