package org.example.domain.strategy.model.vo;

/**
 * @description:
 * @author： tankardyegga, 微信号:同名
 * @date: 2/27/2023
 * @Copyright： levinforward@163.com
 */
public class DrawAwardInfo {

    private String awardId;

    private String awardName;

    private Integer awardType;

    private String awardContent;

    public DrawAwardInfo() {
    }

    public DrawAwardInfo(String awardId, String awardName) {
        this.awardId = awardId;
        this.awardName = awardName;
    }

    public String getAwardId() {
        return awardId;
    }

    public void setAwardId(String awardId) {
        this.awardId = awardId;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getAwardContent() {
        return awardContent;
    }

    public void setAwardContent(String awardContent) {
        this.awardContent = awardContent;
    }
}
