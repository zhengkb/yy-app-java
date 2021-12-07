package com.zkb.yyappjava.countmanage.packet;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountPacket {

    private String userName;

    private String password;

    private String telNum;

    private String account;
}
