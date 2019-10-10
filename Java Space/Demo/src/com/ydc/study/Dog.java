package com.ydc.study;

public  class Dog {
    public Dog(){}
    public Dog(int biaohao, String name,String pingzhong, char sex, int qingmidu , int jiankangzhi)
    {
        setBiaohao(biaohao);
        setName(name);
        setPingzhong(pingzhong);
        setSex(sex);
        setQingmidu(qingmidu);
        setJiankangzhi(jiankangzhi);
    }
    public void jk()
    {
        if (getJiankangzhi()<=59)
        {
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
