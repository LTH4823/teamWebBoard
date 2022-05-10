package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    private String id;
    private String name;
    private Integer call;
    private String email;
    private Integer reportNum;

    private LocalDate regDate;
    private LocalDate updateDate;
}
