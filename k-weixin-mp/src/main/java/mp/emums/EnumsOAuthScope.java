package mp.emums;

/**
 * @Author:Jrss
 * @Desp:应用授权作用域
 * @Date:Create in 15:06 2018/6/20
 * @Modified By:
 */
public enum EnumsOAuthScope {
    /// 不弹出授权页面，直接跳转，只能获取用户openid
    snsapi_base,
    /// 弹出授权页面，可通过openid拿到昵称、性别、所在地。并且，即使在未关注的情况下，只要用户授权，也能获取其信息
    snsapi_userinfo
}


