package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Contractor {

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
