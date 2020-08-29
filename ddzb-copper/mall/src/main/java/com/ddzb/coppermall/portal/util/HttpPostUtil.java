package com.ddzb.coppermall.portal.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@Component
public class HttpPostUtil {

    private static int connectTimeOut;
    private static int readTimeOut;
    private static String requestEncoding;

    /**
     * 短信提供商开设账号时提供一下参数:
     * <p>
     * 账号、密码、通信key、IP、端口
     */

    static String account;
    static String password;
    static String veryCode;
    static String http_url;

    @Value("${sms.connectTimeOut}")
    public void setConnectTimeOut(int connectTimeOut) {
        HttpPostUtil.connectTimeOut = connectTimeOut;
    }

    @Value("${sms.readTimeOut}")
    public void setReadTimeOut(int readTimeOut) {
        HttpPostUtil.readTimeOut = readTimeOut;
    }

    @Value("${sms.requestEncoding}")
    public void setRequestEncoding(String requestEncoding) {
        HttpPostUtil.requestEncoding = requestEncoding;
    }

    @Value("${sms.account}")
    public void setAccount(String account) {
        HttpPostUtil.account = account;
    }

    @Value("${sms.password}")
    public void setPassword(String password) {
        HttpPostUtil.password = password;
    }

    @Value("${sms.veryCode}")
    public void setVeryCode(String veryCode) {
        HttpPostUtil.veryCode = veryCode;
    }

    @Value("${sms.http_url}")
    public void setHttp_url(String http_url) {
        HttpPostUtil.http_url = http_url;
    }

    /**
     * 从输入流中读取数据
     *
     * @param inStream
     * @return
     * @throws Exception
     */
    public static byte[] readInputStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        byte[] data = outStream.toByteArray();// 网页的二进制数据
        outStream.close();
        inStream.close();
        return data;
    }

    public static String doGet(String requrl, Map<?, ?> parameters,
                               String recvEndcoding) {
        HttpURLConnection url_con = null;
        String responseContent = null;
        String vchartset = recvEndcoding == "" ? HttpPostUtil.requestEncoding
                : recvEndcoding;
        try {
            StringBuffer params = new StringBuffer();
            for (Iterator<?> iter = parameters.entrySet().iterator(); iter
                    .hasNext(); ) {
                Entry<?, ?> element = (Entry<?, ?>) iter.next();
                params.append(element.getKey().toString());
                params.append("=");
                params.append(URLEncoder.encode(element.getValue().toString(),
                        vchartset));
                params.append("&");
            }
            if (params.length() > 0) {
                params = params.deleteCharAt(params.length() - 1);
            }
            URL url = new URL(requrl);
            url_con = (HttpURLConnection) url.openConnection();
            url_con.setRequestMethod("GET");
            System.setProperty("连接超时：", String.valueOf(HttpPostUtil.connectTimeOut));
            System.setProperty("访问超时：", String.valueOf(HttpPostUtil.readTimeOut));
            url_con.setDoOutput(true);//
            byte[] b = params.toString().getBytes();
            url_con.getOutputStream().write(b, 0, b.length);
            url_con.getOutputStream().flush();
            url_con.getOutputStream().close();
            InputStream in = url_con.getInputStream();
            byte[] echo = new byte[10 * 1024];
            int len = in.read(echo);
            responseContent = (new String(echo, 0, len).trim());
            int code = url_con.getResponseCode();
            if (code != 200) {
                responseContent = "ERROR" + code;
            }
        } catch (Exception e) {
            System.out.println("网络故障:" + e.toString());
        } finally {
            if (url_con != null) {
                url_con.disconnect();
            }
        }
        return responseContent;

    }

    public static String doGet(String reqUrl, String recvEncoding) {
        HttpURLConnection url_con = null;
        String responseContent = null;
        String vchartset = recvEncoding == "" ? HttpPostUtil.requestEncoding
                : recvEncoding;
        try {
            StringBuffer params = new StringBuffer();
            String queryUrl = reqUrl;
            int paramIndex = reqUrl.indexOf("?");

            if (paramIndex > 0) {
                queryUrl = reqUrl.substring(0, paramIndex);
                String parameters = reqUrl.substring(paramIndex + 1,
                        reqUrl.length());
                String[] paramArray = parameters.split("&");
                for (int i = 0; i < paramArray.length; i++) {
                    String string = paramArray[i];
                    int index = string.indexOf("=");
                    if (index > 0) {
                        String parameter = string.substring(0, index);
                        String value = string.substring(index + 1,
                                string.length());
                        params.append(parameter);
                        params.append("=");
                        params.append(URLEncoder.encode(value, vchartset));
                        params.append("&");
                    }
                }

                params = params.deleteCharAt(params.length() - 1);
            }
            URL url = new URL(queryUrl);
            url_con = (HttpURLConnection) url.openConnection();
            url_con.setRequestMethod("GET");
            System.setProperty("sun.net.client.defaultConnectTimeout",
                    String.valueOf(HttpPostUtil.connectTimeOut));
            System.setProperty("sun.net.client.defaultReadTimeout",
                    String.valueOf(HttpPostUtil.readTimeOut));
            url_con.setDoOutput(true);
            byte[] b = params.toString().getBytes();
            url_con.getOutputStream().write(b, 0, b.length);
            url_con.getOutputStream().flush();
            url_con.getOutputStream().close();
            InputStream in = url_con.getInputStream();
            byte[] echo = new byte[10 * 1024];
            int len = in.read(echo);
            responseContent = (new String(echo, 0, len)).trim();
            int code = url_con.getResponseCode();
            if (code != 200) {
                responseContent = "ERROR" + code;
            }
        } catch (Exception e) {
            System.out.println("网络故障:" + e.toString());
        } finally {
            if (url_con != null) {
                url_con.disconnect();
            }
        }
        return responseContent;

    }

    public static String doPost(String reqUrl, Map<String, String> parameters,
                                String recvEncoding) throws Exception {
        HttpURLConnection url_con = null;
        String responseContent = null;
        String vchartset = recvEncoding == "" ? HttpPostUtil.requestEncoding
                : recvEncoding;
        try {
            StringBuffer params = new StringBuffer();
            if (parameters != null)
                for (Iterator<?> iter = parameters.entrySet().iterator(); iter
                        .hasNext(); ) {
                    Entry<?, ?> element = (Entry<?, ?>) iter.next();
                    params.append(element.getKey().toString());
                    params.append("=");
                    params.append(URLEncoder.encode(element.getValue().toString(),
                            vchartset));
                    params.append("&");
                }

            if (params.length() > 0) {
                params = params.deleteCharAt(params.length() - 1);
            }

            URL url = new URL(reqUrl);
            url_con = (HttpURLConnection) url.openConnection();
            url_con.setRequestMethod("POST");
            url_con.setConnectTimeout(HttpPostUtil.connectTimeOut);
            url_con.setReadTimeout(HttpPostUtil.readTimeOut);
            url_con.setDoOutput(true);
            byte[] b = params.toString().getBytes();
            url_con.getOutputStream().write(b, 0, b.length);
            url_con.getOutputStream().flush();
            url_con.getOutputStream().close();

            InputStream in = url_con.getInputStream();
            // byte[] echo = new byte[10 * 1024];
            // int len = in.read(echo);
            // responseContent = (new String(echo, 0, len)).trim();
            byte[] echo = readInputStream(in);
            responseContent = new String(echo, "UTF-8");
            int code = url_con.getResponseCode();
            if (code != 200) {
                responseContent = "ERROR" + code;
            }

        } catch (IOException e) {
            System.out.println("网络故障:" + e.toString());
        } finally {
            if (url_con != null) {
                url_con.disconnect();
            }
        }
        return responseContent;
    }

    public static String doPostJsonImage(String reqUrl, String parameters, String recvEncoding, String path) throws Exception {
        HttpURLConnection url_con = null;
        String responseContent = null;
        String vchartset = recvEncoding == "" ? HttpPostUtil.requestEncoding
                : recvEncoding;
        try {
            URL url = new URL(reqUrl);
            url_con = (HttpURLConnection) url.openConnection();
            url_con.setRequestProperty("accept", "*/*");
            url_con.setRequestProperty("Connection", "Keep-Alive");
            url_con.setRequestProperty("Cache-Control", "no-cache");
            url_con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            url_con.setRequestProperty("responseType", "'arraybuffer'");
            url_con.setRequestMethod("POST");
            url_con.setConnectTimeout(HttpPostUtil.connectTimeOut);
            url_con.setReadTimeout(HttpPostUtil.readTimeOut);
            url_con.setDoOutput(true);
            byte[] b = parameters.getBytes();
            url_con.getOutputStream().write(b, 0, b.length);
            url_con.getOutputStream().flush();
            url_con.getOutputStream().close();

            BufferedInputStream bis = new BufferedInputStream(url_con.getInputStream());
            OutputStream os = new FileOutputStream(new File(path));
            int len;
            byte[] arr = new byte[1024];
            while ((len = bis.read(arr)) != -1) {
                os.write(arr, 0, len);
                os.flush();
            }
            os.close();

//            InputStream in = url_con.getInputStream();
            // byte[] echo = new byte[10 * 1024];
            // int len = in.read(echo);
            // responseContent = (new String(echo, 0, len)).trim();
//            byte[] echo = readInputStream(in);
//            responseContent = new String(echo, "UTF-8");
            int code = url_con.getResponseCode();
            if (code != 200) {
                responseContent = "ERROR" + code;
            } else {
                responseContent = "OK";
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("网络故障:" + e.toString());
        } finally {
            if (url_con != null) {
                url_con.disconnect();
            }
        }
        return responseContent;
    }

    public static String doPost2(String reqUrl, String parameters, String recvEncoding) throws Exception {
        HttpURLConnection url_con = null;
        String responseContent = null;
        String vchartset = recvEncoding == "" ? HttpPostUtil.requestEncoding
                : recvEncoding;
        try {
            URL url = new URL(reqUrl);
            url_con = (HttpURLConnection) url.openConnection();
            url_con.setRequestProperty("accept", "*/*");
            url_con.setRequestProperty("Connection", "Keep-Alive");
            url_con.setRequestProperty("Cache-Control", "no-cache");
            url_con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            url_con.setRequestProperty("responseType", "'arraybuffer'");
            url_con.setRequestMethod("POST");
            url_con.setConnectTimeout(HttpPostUtil.connectTimeOut);
            url_con.setReadTimeout(HttpPostUtil.readTimeOut);
            url_con.setDoOutput(true);
            byte[] b = parameters.getBytes();
            url_con.getOutputStream().write(b, 0, b.length);
            url_con.getOutputStream().flush();
            url_con.getOutputStream().close();

//            BufferedInputStream bis = new BufferedInputStream(url_con.getInputStream());
//            OutputStream os = new FileOutputStream(new File(path));
//            int len;
//            byte[] arr = new byte[1024];
//            while ((len = bis.read(arr)) != -1) {
//                os.write(arr, 0, len);
//                os.flush();
//            }
//            os.close();

            InputStream in = url_con.getInputStream();
             byte[] echo = new byte[10 * 1024];
             int len = in.read(echo);
             responseContent = (new String(echo, 0, len)).trim();
//            byte[] echo = readInputStream(in);
//            responseContent = new String(echo, "UTF-8");
            int code = url_con.getResponseCode();
            if (code != 200) {
                responseContent = "ERROR" + code;
            }
//

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("网络故障:" + e.toString());
        } finally {
            if (url_con != null) {
                url_con.disconnect();
            }
        }
        return responseContent;
    }

    public static String getKeyVAlueSting(Map<String, String> map) {
        String sign = "";
        Set<String> set = map.keySet();
        for (String key : set) {
            sign += key + "=" + map.get(key) + "&";
        }
        sign = sign.substring(0, sign.length() - 1);
        return sign;
    }

    /**
     * 美圣短信
     *
     * @param mobile
     * @param tplId
     * @param content
     * @throws Exception
     */
    public static void sendMessageTemp(String mobile, String tplId, String content) throws Exception {
        String sendTplSmsUrl = http_url
                + "/service/httpService/httpInterface.do?method=sendMsg";
        Map<String, String> params = new HashMap<String, String>();
        params.put("username", account);
        params.put("password", password);
        params.put("veryCode", veryCode);
        params.put("mobile", mobile);
        params.put("content", content); // 变量值，以英文逗号隔开
        params.put("msgtype", "2"); // 2-模板短信
        params.put("tempid", tplId); // 模板编号
        params.put("code", "utf-8");
        String result = HttpPostUtil.doPost(sendTplSmsUrl, params, "utf-8");
    }

    /**
     * 亿美短信
     *
     * @param mobile
     * @param message
     * @throws Exception
     */
    public static void sendMessage(String mobile, String message) throws Exception {
        // register();
        Map<String, String> map = new HashMap<String, String>();
        /*
         * map.put("cdkey", "6SDK-EMY-6688-JDWMO"); map.put("password",
         * "256026");
         */
        // map.put("cdkey", "8SDK-EMY-6699-RJVLN");
        // map.put("password", "834270");

        map.put("cdkey", "3MV5-EMY-0130-OCRQN");
        map.put("password", "795852");
        map.put("phone", mobile);
        map.put("message", message);
        String temp = HttpPostUtil.doPost(
                "http://hprpt2.eucp.b2m.cn:8080/sdkproxy/sendsms.action", map,
                "utf-8");
        // String temp =
        // HttpPost.doPost("http://sdk4rptws.eucp.b2m.cn:8080/sdkproxy/sendsms.action",map,
        // "utf-8");
        System.out.println(temp);
    }

    public static void main(String[] args) {
//        try {
//            sendMessageTemp("18705153363", ConstantConfig.JSM4092903_0022, "1234");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            sendMessage("18705153363", "【好咚咚】您关注的品牌专场已经开始啦，正品好货，不容错过！回复TD退订");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
