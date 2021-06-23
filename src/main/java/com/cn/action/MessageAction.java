package com.cn.action;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 直接基于Rest架构进行处理，省略了@ResponseBody注解
@RequestMapping("message")
public class MessageAction { // 控制层实现类

    /**
     * 日志工具
     */
    private static final Logger logger = LoggerFactory.getLogger(MessageAction.class);

    @PostMapping("/echo")
    public String echo(@RequestBody String msg){
        this.logger.info("*************************{}",msg);
        return "xx";
    }
}
