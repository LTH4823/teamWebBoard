package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Requester {

    private String id;
    private String name;
    private String call;
    private String email;
    private String file;
    private String residentNum;

    private LocalDate regDate;
    private LocalDate updateDate;
}
