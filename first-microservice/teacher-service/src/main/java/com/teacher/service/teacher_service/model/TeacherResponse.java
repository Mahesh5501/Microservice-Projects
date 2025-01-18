package com.teacher.service.teacher_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherResponse {
    
    private int id;
    private String name;
    private String address;
    private String subject;

    private String status;
    private Integer errorcode;
    private String errorMessage;
}
