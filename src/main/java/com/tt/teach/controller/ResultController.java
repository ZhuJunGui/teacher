package com.tt.teach.controller;

import com.tt.teach.pojo.Result;
import com.tt.teach.service.ResultService;
import com.tt.teach.service.StudentService;
import com.tt.teach.utils.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @作者：zhujungui
 * @时间：2018/12/20 11:23
 * @描述：成绩控制器
 */
@Controller
@RequestMapping("/res")
public class ResultController {
    @Resource
    private ResultService resultService;

    @RequestMapping("/result")
    public String result() {
        return "/result/result";
    }

    @GetMapping("/getResultList")
    @ResponseBody
    public Object getResultList() {
        List<Result> list=resultService.getResultList();
        return list;
    }

    @RequestMapping(value = "/deleteResult/{resultNo}",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteResult(@PathVariable Integer resultNo) {
        int result =resultService.deleteResult(resultNo);
        if (result>0){
            return JsonResult.ok("删除成功！",result);
        }
        return JsonResult.no("删除失败！",result);
    }
}
