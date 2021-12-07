package com.zkb.yyappjava.cygdata.dao.enitity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cyg")
public class CygDataInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String link;

    private String score;

    private String xlscore;

    private String jjscore;

    private String price;
}
