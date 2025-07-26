package com.Shrao.Jobapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data //-->therefore no need for getters and setters,toString,hashcode and etc\
@NoArgsConstructor  //for default concstructors
@AllArgsConstructor //constructors for all the arguements
@Component
public class jobPost {
    private int postId;
    private String postProfile;
    private String postDesc ;
    private int reqExperience;
    private List<String> postTechStack;

}
