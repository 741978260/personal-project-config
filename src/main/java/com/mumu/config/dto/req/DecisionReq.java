package com.mumu.config.dto.req;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/6/30
 */
@Data
@NoArgsConstructor
public class DecisionReq {
//    @JSONField(name = "App_Name")
    @JsonProperty("App_Name")
    private String appName;  // 豆-首再加  卡-首再
    @JsonProperty("CreditReportSn")
//    @JSONField(name = "CreditReportSn")
    private String creditReportSn;  // 卡 豆
    @JsonProperty("CustName")
//    @JSONField(name = "CustName")
    private String custName;  // 卡 豆
        @JsonProperty("name")
//    @JSONField(name = "name")
    private String name;  // 卡 豆
    @JsonProperty("product_id")
//    @JSONField(name = "product_id")
    private String productId;  // 卡 豆  (豆豆String  卡卡int)
}
