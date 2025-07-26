package com.Shrao.Jobapp.Service;

import com.Shrao.Jobapp.Repo.JobRepo;
import com.Shrao.Jobapp.model.jobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

//    @Autowired
//    private jobPost jp;

//    @Autowired
//    private JobRepo repo;

    @Autowired
    private JobRepo repo;  //the object of repo is in service class

    public void addJob(jobPost jp){ /// -->DTO(Data Transfer Object)-->used to transfer data from one class to another
         repo.addJobs(jp);
    }

    public List<jobPost> getallJobs(){
            return repo.getallJobs();
    }

}
