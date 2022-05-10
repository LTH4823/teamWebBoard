package org.zerock.teamwebboard.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AdminDTO {
    private String id;
    private String name;
    private Integer call;
    private String email;
    private Integer reportNum;

    private LocalDate regDate;
    private LocalDate updateDate;
}
