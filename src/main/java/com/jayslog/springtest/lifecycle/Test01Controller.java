package com.jayslog.springtest.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Test01Controller {

    @ResponseBody
    @RequestMapping("/lifecycle/test01/1")
    public String testProject() {
        String html = "" +
                "<html>" +
                "   <head><title>Test01</title></head>" +
                "   <body>" +
                "       <h2>테스트 프로젝트 완성</h2>" +
                "       <h4>해당 프로젝트를 통해서 문제 풀이를 진행합니다.</h4>" +
                "   </body>" +
                "</html>";
        return html;
    }

    @ResponseBody
    @RequestMapping("/lifecycle/test01/2")
    public Map<String, Integer> getScore() {
        Map<String, Integer> score = new HashMap<>();
        score.put("국어", 80);
        score.put("수학", 90);
        score.put("영어", 85);

        return score;
    }


}
