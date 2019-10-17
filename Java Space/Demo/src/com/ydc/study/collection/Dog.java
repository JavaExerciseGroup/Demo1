package com.ydc.study.collection;


/**
 * @author Administrator
 * <p>
 * data 2019-10-17 10:10:51
 */
public class Dog {

    public Dog() {

    }

    /**
     * @param number      编号
     * @param name        名称
     * @param variety     品种
     * @param sex         性别
     * @param intimacy    亲密关系
     * @param healthLevel 健康程度
     */
    public Dog(int number, String name, String variety, char sex, int intimacy, int healthLevel) {
        setBiaohao(number);
        setName(name);
        setPingzhong(variety);
        setSex(sex);
        setQingmidu(intimacy);
        setJiankangzhi(healthLevel);
    }

    // TODO: 2019/10/17   以下代码按照按照上述修改。

    public void jk() {
        if (getJiankangzhi() <= 59) {
            System.out.println("狗狗的健康值小于60！ 领养失败");
        }
    }

    private int biaohao = 1;
    private String name = "豆豆";
    private String pingzhong = "拉布拉多";
    private char sex = '公';
    private int qingmidu = 50;
    private int jiankangzhi = 60;

    public String getPingzhong() {
        return pingzhong;
    }

    public void setPingzhong(String pingzhong) {
        this.pingzhong = pingzhong;
    }


    public int getBiaohao() {
        return biaohao;
    }

    public void setBiaohao(int biaohao) {
        this.biaohao = biaohao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getQingmidu() {
        return qingmidu;
    }

    public void setQingmidu(int qingmidu) {
        this.qingmidu = qingmidu;
    }

    public int getJiankangzhi() {
        return jiankangzhi;
    }

    public void setJiankangzhi(int jiankangzhi) {
        this.jiankangzhi = jiankangzhi;
    }
}
