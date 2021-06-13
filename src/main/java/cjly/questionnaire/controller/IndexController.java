package cjly.questionnaire.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController extends BaseController {

    @RequestMapping({"","/"})
    public String index (){
        int pn = ServletRequestUtils.getIntParameter(req,"pn",1);
        int size = ServletRequestUtils.getIntParameter(req, "size", 2);
        Page page = new Page(pn,size);
        //1、分页信息 2、Id 3、排序
        IPage results = questionnaireService.paging(page, null, "created");
        req.setAttribute("pageData",results);
        return  "index";
    }

}
