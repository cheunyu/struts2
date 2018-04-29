package valuestack;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:cheunyu
 * @date:2018/4/29 20:24
 */
public class HelloAction implements Action {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String execute() throws Exception {
        ValueStack stack = ActionContext.getContext().getValueStack();
        Map<String, Object> context = new HashMap<>();
        context.put("key1", new String("This is key1"));
        context.put("key2", new String("this is key2"));
        stack.push(context);

        System.out.println("Size of the valueStack: " + stack.size());
        return this.SUCCESS;
    }
}
