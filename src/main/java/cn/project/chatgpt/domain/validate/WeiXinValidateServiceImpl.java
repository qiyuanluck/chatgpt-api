package cn.project.chatgpt.domain.validate;

import cn.project.chatgpt.application.IWeiXinValidateService;
import cn.project.chatgpt.infrastructure.util.sdk.SignatureUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: qiyuan
 * @Date: 2024/12/25 14:58
 * @Description:
 */
@Service
public class WeiXinValidateServiceImpl implements IWeiXinValidateService {

    @Value("${wx.config.token}")
    private String token;

    @Override
    public boolean checkSign(String signature, String timestamp, String nonce) {
        return SignatureUtil.check(token, signature, timestamp, nonce);
    }

}
