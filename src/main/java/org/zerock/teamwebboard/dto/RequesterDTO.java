package org.zerock.teamwebboard.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RequesterDTO {
    private String id;
    private String name;
    private String call;
    private String email;
    private String file;
    private String residentNum;

    private LocalDate regDate;
    private LocalDate updateDate;
}
