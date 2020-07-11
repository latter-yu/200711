import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 读取 url 中参数内容（a, b)
        // 相加
        String a = req.getParameter("a");
        String b = req.getParameter("b");
        // 字符串转整数
        int aI = Integer.parseInt(a);
        int bI = Integer.parseInt(b);
        int result = aI + bI;
        resp.getWriter().write(String.format("<h1>result = %d</h1>", result));
        // 生成字符串值
    }
}
