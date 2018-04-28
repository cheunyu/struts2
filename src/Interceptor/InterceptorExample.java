package Interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author:cheunyu
 * @date:2018/4/29 0:52
 */
public class InterceptorExample extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println(this.getClass().getName() + "拦截器在Action之前做的事");
        String result = actionInvocation.invoke();  //执行调用action
        System.out.println(this.getClass().getName() + "拦截器在Action之后做的事");
        return result;
    }
}
