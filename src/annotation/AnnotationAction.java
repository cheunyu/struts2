package annotation;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 * @author:cheunyu
 * @date:2018/4/30 22:19
 */

@Results({
        @Result(name = "success", location = "/annotation/annotation.jsp"),
        @Result(name = "input", location = "/index.jsp")
})
public class AnnotationAction extends ActionSupport {
    private String name;
    private int age;

    @RequiredFieldValidator( message = "The name is required" )
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @IntRangeFieldValidator(message = "Age must be in between 28 and 65",
            min = "29", max = "65")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Action(value = "/annotation")
    public String execute() {
        return this.SUCCESS;
    }
}
