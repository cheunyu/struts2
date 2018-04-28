package ActionSupportExample;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author:cheunyu
 * @date:2018/4/29 0:15
 */
public class HelloWorldAction extends ActionSupport {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() {
        if ("SECRET".equals(name)) {
            return this.SUCCESS;
        }else {
            return this.ERROR;
        }
    }
}
