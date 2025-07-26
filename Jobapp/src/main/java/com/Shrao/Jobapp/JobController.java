package com.Shrao.Jobapp;


//import com.Shrao.Jobapp.model.JobPost;
import com.Shrao.Jobapp.Service.JobService;
import com.Shrao.Jobapp.model.jobPost;
//import com.Shrao.Jobapp.model.jobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class JobController {

    //*** The data rather object of one class is used to access and transfer it from contoller to service and service to repo..-->these objects are called DTO(Data Transfer Obejct)

    @Autowired
    private JobService service; //the object of service class is in controller class for accessing and transfer of data...this type of object is called DTO(Data Transfer Object)

    @RequestMapping({"/","home"})
    public String home(){
        System.out.println("Home method called");
        return "home";
    }

    @RequestMapping("addjob")
    public String  addJob(){
        System.out.println("Add job called");
        return "addJob";
    }

    @GetMapping("viewalljobs")
    public String viewallJobs(Model m){
        List<jobPost> jobs=service.getallJobs();
        m.addAttribute("jobPosts",jobs);
        System.out.println("View all jobs method called");
        return "viewallJobs";
    }

    @PostMapping("handleForm")
    public String handleForm(jobPost jp){  //jp is DTO(Data TRansfer object)..the same object is passed from controller to service and from service to repo...
        service.addJob(jp);

        return "success";
    }

}
