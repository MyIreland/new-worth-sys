package cn.worth.sys.enums;

/**
 * @author myireland
 * @version 1.0.0
 * @date 2019-08-06
 * @description
 **/
public enum EntityTypeEnum {

    COMMON(0, "普通类型"), ADMIN(1, "管理员类型"), WX(2, "微信类型");
    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    EntityTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
