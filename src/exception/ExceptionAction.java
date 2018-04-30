package exception;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author:cheunyu
 * @date:2018/4/30 22:05
 */
public class ExceptionAction extends ActionSupport {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() {
        String str = null;
        str.substring(0);
        return this.SUCCESS;
    }
}
