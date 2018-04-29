package redirect;

import com.opensymphony.xwork2.Action;

/**
 * @author:cheunyu
 * @date:2018/4/29 18:05
 */
public class RedirectExample implements Action {
    @Override
    public String execute() throws Exception {
        return this.SUCCESS;
    }
}
