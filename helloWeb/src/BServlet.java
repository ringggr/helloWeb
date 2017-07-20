import javax.servlet.*;
import java.io.IOException;

/**
 * Created by lanouhn on 17/7/20.
 */
public class BServlet extends GenericServlet {

    //如果，要让BServlet刚被创建时进行某些不可告人的工作，那么也需要在init(ServletConfig)这个生命周期中写代码


//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//    }


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
