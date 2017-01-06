package com.monitor.constant;

/**
 * 服务指标项
 *
 * Created by biezhi on 2017/1/6.
 */
public enum ServiceType {

    CPU_USER("用户cpu使用率"),
    CPU_SYS("系统cpu使用率"),
    CPU_IOWAIT("io等待"),
    CPU_IDEL("cpu空闲率"),

    MEM_TOTAL("内存总量"),
    MEM_USED("已用内存量"),
    MEM_ACTUAL_USED("用户实际使用的内存"),
    MEM_FREE("剩余内存量"),

    LOAD_1("过去1分钟的系统平均负载"),
    LOAD_5("过去5分钟的系统平均负载"),
    LOAD_15("过去15分钟的系统平均负载"),

    DISK_USED("磁盘的已用存储空间"),
    DISK_FREE("磁盘的剩余存储空间"),
    DISK_TOTAL("磁盘存储总量"),
    DISK_READ_BYTES("磁盘每秒读取的字节数"),
    DISK_WRITE_BYTES("磁盘每秒写入的字节数")
    ;

    private String desc;

    ServiceType(String desc){
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
