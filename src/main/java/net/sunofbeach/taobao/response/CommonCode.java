package net.sunofbeach.taobao.response;


public enum CommonCode {

    SUCCESS(true, 10000, "操作成功"),
    FAIL(false, 11111, "操作失败"),
    MSG_CODE_SEND_SUCCESS(true, 11114, "验证码发送成功"),
    MSG_CODE_SEND_FAILED(false, 11115, "验证码发送失败，请稍后重试"),
    VIP_ALLOWANCE_CONTAINS(true, 11128, "已经领取了VIP津贴"),
    VIP_ALLOWANCE_NOT_CONTAINS(false, 11129, "未领取了VIP津贴"),
    ACCOUNT_NOT_LOGIN(false, 11126, "账号未登录");

    //操作是否成功
    public boolean success;
    //操作代码
    public int code;
    //提示信息
    public String message;

    CommonCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }


}
