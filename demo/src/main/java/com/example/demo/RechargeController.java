package com.example.demo;

import model.plan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/recharge")
public class RechargeController {


        @GetMapping
        public String show(Model model){
            return "recharge";
        }
}
