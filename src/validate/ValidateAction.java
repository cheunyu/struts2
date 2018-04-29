package validate;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author:cheunyu
 * @date:2018/4/30 1:12
 */
public class ValidateAction extends ActionSupport {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void validate() {
        if (name == null || name.trim().equals("")) {
            addFieldError("name", "The name is required");
        }
        if (age < 1 || age  > 100) {
            addFieldError("name", "Age must be in between 1 and 100");
        }
    }

    public String execute() {
        return this.SUCCESS;
    }
}
