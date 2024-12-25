package cn.project.chatgpt.application;

/**
 * @Author: qiyuan
 * @Date: 2024/12/25 14:50
 * @Description: 微信公众号验签服务
 */
public interface IWeiXinValidateService {
    boolean checkSign(String signature, String timestamp, String nonce);
}
