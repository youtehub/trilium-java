package com.md.view.controller;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import com.md.view.entity.MDContent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
public class MDController {

    @ResponseBody
    @GetMapping(value = "print")
    public String login(@RequestParam(required = false) String key,
                        @RequestParam(required = false) String cookie,
                        HttpServletResponse response) {
        String urls = "http://10.9.19.5:6539/api/notes/" + key;
        String result = HttpRequest.get(urls)
                .header("Accept", "*/*")
                .header("Cookie", cookie)
                .execute().body();
        MDContent mdContent = JSONUtil.toBean(result, MDContent.class);
        String mdct = mdContent.getContent();
        return mdct;

    }

    @GetMapping(value = "/md")
    public String index() {
        return "index";

    }


}
