package com.eoc.controller;

import com.eoc.model.User;
import com.eoc.service.UserService;
import com.liutao.util.springboot.security.annotation.Encrypt;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
/**
 * Created by yy on 2018/11/22.
 * Smile Waits For You
 */
@RestController
public class TestController {
    private String publicKeyStr = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCeJdjoRJlTk7aMskUqpNLr8QY0CBR0Whjoy/WxQRpdSmclTJKLChln4WLOGOTFOVdYDCSGVKY5nIreUKet9NWjNq+N0JCmHUYzleIfdYqlkM0pHIjvXfsqd7/KsEbcrPgggfkm+v13uM/vkIauiGorAdAEz7z+FgvLVCFgnNkCIQIDAQAB";

    private String privateKeyStr = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAJ4l2OhEmVOTtoyyRSqk0uvxBjQIFHRaGOjL9bFBGl1KZyVMkosKGWfhYs4Y5MU5V1gMJIZUpjmcit5Qp6301aM2r43QkKYdRjOV4h91iqWQzSkciO9d+yp3v8qwRtys+CCB+Sb6/Xe4z++Qhq6IaisB0ATPvP4WC8tUIWCc2QIhAgMBAAECgYA+PcUFfOIfW5ZP/2VraB0/EMgROFDcjg0ZqhQTY/z9VGgN7PoL0Li5AqKBXJjE6lFu7LB/Uddt+ydIYdPsidx+VaRBHcGh2b7t6Psb9TOCSGKAMl1BNV74/2moFgttsKqI2upz/raAE4U/a3IoMZQlzoBvzOQp1rzIyUCf5fu3sQJBAN++bGCj30OZH6ZTNV/uHkJRO8Lpw94fahne3jHDVBhWwsIb81oYczEnJO6B0mZA13Zm17BUpJ4/5O10uYbP6C0CQQC08oM61nBogGNjPvKoHL8+9A5A3Sgoi3ufAtLAUpC6bFSxeDGud6JrXAVabtMaqh8aetSEdMdKfecdhZXwc+ZFAkBIzODeoPNoP055A+H+ELBvy5ayWPWONJKFUGrjrjaSpMhB+G46BnKUr7Polv0qoDZ7JANSMHhPtWJ7kNs87jERAkBrbt2Jjo5ZDXl1EIfEVqUZ/I+F5YkVYZN5WpTEyYDSnsU+RW3B95gAhDdNdSVz3HPxJeKN7kPxL4WMGqdmh3m9AkBWy9S6xPzADwy6Iy/S0aAQ5PZKUyrywfyYOk0xWSFU0/6aUtPN0BGS6gG1g/xJ0yAc8rHsTHYEbKnHUKcI3utz";

    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping(value = "userList")
    public String userList(@RequestBody String name) throws Exception{
        System.out.println("1111111");
        User user = new User();
        user.setCode("code");
        user.setName("1");
        user.setPw("1");
        int a = userService.addUser(user);
//        String nn = new Test().privateDecrypt(a);
        return "你好";
    }

    @RequestMapping(value = "createUlser")
    @ResponseBody
    public String createUlser(@RequestBody String list){
        System.out.println("2");
        return "sessecc";
    }
}
