package org.zerock.teamwebboard.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ContractorDTO {
    private String id;
    private Integer num;
    private String name;
    private String businessNum;
    private String cal;
    private String email;
    private String address;
    private String file;

    private LocalDate regDate;
    private LocalDate updateDate;
}
