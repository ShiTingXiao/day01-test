package cn.jiyun.pojo;

public class ShiTingXiao {

    private String userName;
    private Integer age;

    private String addr;

    public ShiTingXiao(String userName, Integer age, String addr) {
        userName = "史廷霄";
        age = 30;
        addr = "河南省社旗县";
        this.userName = userName;
        this.age = age;
        this.addr = addr;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
