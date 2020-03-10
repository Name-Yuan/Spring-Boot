package com.Alipay.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2016101900723732";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDB67RLLPwNKMAkDqXetTGgpAgK9KWZEbskCp3bIh6GuW7w32PPQ6jczTShJqcp0YvL4GYzjryaWOIx1volhcUDv3Z2zpTqXSriHtCh7CkkijR6azwD7SqxMQ9OY5MwVYWftU2ru9hanu3MOUmNoenu4Gk/EugQhexNEYZPXcvmbRI4YbWYeLRHUBMB65XN1nb65KMjv6Sk5KvC4pDSKKWhI1G+hlDaczj85PElXVPsdzdhbRZz1JkH9vyFwRvo2s0OgxZnqprgeoATg028N07/l4KPeQ2SZkqROnalu5qMH0FAXUv8Zj7Aq/b9p+XrA73g/+ROUzGDEdJupL5fqQi9AgMBAAECggEBALL6X5nut+dRUB03Y8HsDBTOsBmkeN6Q7d8y6UTh9bi0lv87vrwCH21C/CssKKbBHzyZLNqzB8GQ/ZuwZYmSMCboZGb8/ZZdTQIMHNUFyWdPI2ZFaMva7kdCF3VrE+NNW5nu1PQG2IWzH5kY2pkc8nMlrh2nzoXJhTIQVZ0U3ecZ8opmBYWoZvVnjAwkh/wm7SN+iWzp1gYqN0TunQ0OB31DTsXfeVpwvW5bQJgPBM3h7QmLCyjWL0CRcOYpm+jgHH2IbEyZT/+lMuHh4xn5JDu2yILbnWHn/jDNtUWUxV6DkD1HOv/20Zrz0zsYSHBshChWsFC31W0BaJE6RFQYWuECgYEA5DpMD2CpT75617091R1SomiI3L7T0F+3+qQ6DnsuAOyVVrW6RluwrpDifpglwILzmkqZ4aH+QMD+cZ8vFwsEaUJCtY4mARn9a7anA69Yoc2UvZ/2oLmq26RWJV8IqltwNxlG6nyHR3aaNVYGso+vQ9ZeUy866B7lEEYa72a9RXUCgYEA2YSutyt2/EsdfOeBkAPXVSs20Zl38LHGVfNqzD7vWWlDOZ7+C3o336s1M5t6NtW+dtxkspeEzgAGoDDd0/KJoYtqwddu3pSL4/HY7/Ukd27RACOC6kTf6lprnI8xsSlNiWGGdbdofQb21XzeUkmqHGTK8ptb9fXbJPAYzJIzJSkCgYEAnwu9S44aD3d3lfbMK0L2/jUJA4R8iZ7a0HE4ADV5Vq2IWNflyvhExTI0lPIkhOb9Kk3ItQO18pxL9RRwtYc4+L1zTaCU/XmGMFUmSJwekQt6FzdtoI4i8lOwsPRsToPQTKVx1SEZCQUu6/JaUn9tLUIrk567V12IVfH0/VbEma0CgYEAv9ozcAO6MtTd8WkP8cIxj0FKXJyMGZPzZ6QHMpbf7XDWhmAhmmX2GiWcCyS7Ktpj39qMRqk1zaxgK7JuNZ7anc2mH8qwU0maCTcrLJp/y4fGd+Tad17AUKfn+nKiVawkY2PNgM6ALqaR18MHJHUswVZ1Wn6FIe/zliTe+rCIw+ECgYA14xnKWhFhMls1iK3dc1bHZs5g5TH0G2JABtFIUjOFiGB/nT0aGAxxMDMREBbqQByMUjx7mUTOmitJemq3JRYQxfjl5CSDpi/wScv3Ti0ul0W49cbJZvuOVyl3Q9qnII+kRZy0+CaDF4SbDEohtwchRlO5jBy7x65t4iIaLeuwrw==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmuGP9+ED8H+QAuxnANq5FhiAHz2b4F9q53/WMLV41tTuIeuCmUDj4q+HHSSNjOHDneSMMQ6+PhzNWmkumIQhupw7t7djHsM5SE8MTIhJ5yYZTt0OXGWckhgaVqAjoede+ZSrphZe3MbbTxZyHXQGPFYfzCr5AN+xXStskHb6WQbb+v3IAICfJvfwj4vwiDyoTikMHAQC4p/JsTaS75jYw6lDqI/XfDVUNtpxFp6RaqwTvl84FuC6+HM9JP5YeXVQOm0v04XDk/PRvD6SM4ZcpEknrsoN8fIAtQ7zGvEP4plWU+M4jvhOPv0W1fbWxc+fCmWmr3/2/xghqt9FB3nMUQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}