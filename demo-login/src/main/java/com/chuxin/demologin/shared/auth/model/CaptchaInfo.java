package com.chuxin.demologin.shared.auth.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Schema(description = "验证码信息")
@Data
@Builder
public class CaptchaInfo {

    @Schema(description = "验证码缓存 key")
    private String captchaKey;

    @Schema(description = "验证码图片Base64字符串")
    private String captchaBase64;
}
