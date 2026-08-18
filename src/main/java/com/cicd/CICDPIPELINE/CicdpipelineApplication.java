package com.cicd.CICDPIPELINE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CicdpipelineApplication {

    public String wecome(){
        return "welcome to CICD PIPELINE";
    }

    //    echo "# CICDPIPELINE" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/Kishor310/CICDPIPELINE.git
//    git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(CicdpipelineApplication.class, args);
	}




}
