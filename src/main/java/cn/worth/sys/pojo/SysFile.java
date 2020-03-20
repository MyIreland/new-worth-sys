package cn.worth.sys.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author myireland
 * @version 1.0.0
 * @date 2019-10-08
 * @description
 **/
@Getter
@Setter
public class SysFile {
    /**
     * 盘符路径
     */
    private String dirName;

    /**
     * 盘符类型
     */
    private String sysTypeName;

    /**
     * 文件类型
     */
    private String typeName;

    /**
     * 总大小
     */
    private String total;

    /**
     * 剩余大小
     */
    private String free;

    /**
     * 已经使用量
     */
    private String used;

    /**
     * 资源的使用率
     */
    private double usage;
}