package mp.advancedAPIs.oAuth.oAuthJson;

/**
 * @Author:Jrss
 * @Desp:通过OAuth的获取到的用户信息（snsapi_userinfo=scope）
 * @Date:Create in 12:47 2018/6/21
 * @Modified By:
 */
public class OAuthUserInfo {
    //用户的唯一标识
    private  String openid;
    //用户昵称
    private  String nickname;
    //用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
    private  String sex;
    //用户个人资料填写的省份
    private  String province;
    //普通用户个人资料填写的城市
    private  String city;
    //国家，如中国为CN
    private  String country;
    // 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空
    private  String headimgurl;
    //用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
    private  String []privilege;
    //只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。详见：https://open.weixin.qq.com/cgi-bin/showdocument?action=dir_list&amp;t=resource/res_list&verify=1&amp;lang=zh_CN
    private  String unionid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String[] getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String[] privilege) {
        this.privilege = privilege;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }
}
