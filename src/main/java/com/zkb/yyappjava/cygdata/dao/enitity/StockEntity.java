package com.zkb.yyappjava.cygdata.dao.enitity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CodeAndDateKey.class)
@Table(name = "stock_zh_ah_name")
public class StockEntity implements Serializable {


    private static final long serialVersionUID = 4985107409377898718L;

    @Id
    private String code;

    @Id
    private String date;

    private String name;

    private String latestPrice;

    private String quoteChange;

    private String upsDowns;

    private String volume;

    private String turnover;

    private String amplitude;

    private String high;

    private String low;

    private String open;

    private String closed;

    private String quantityRatio;

    private String turnoverRate;

    private String peDynamic;

    private String pb;
}

@Data
class CodeAndDateKey implements Serializable {
    private String code;

    private String date;
}
