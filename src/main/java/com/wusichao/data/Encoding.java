package com.wusichao.data;

import java.nio.charset.Charset;

public class Encoding {
    public static String getEncoding(String str) {
        String encode;

        encode = "UTF-16";
        try {
            if (str.equals(new String(str.getBytes(), encode))) {
                return encode;
            }
        } catch (Exception ex) {
        }

        encode = "ASCII";
        try {
            if (str.equals(new String(str.getBytes(), encode))) {
                return "字符串<< " + str + " >>中仅由数字和英文字母组成，无法识别其编码格式";
            }
        } catch (Exception ex) {
        }

        encode = "ISO-8859-1";
        try {
            if (str.equals(new String(str.getBytes(), encode))) {
                return encode;
            }
        } catch (Exception ex) {
        }

        encode = "GB2312";
        try {
            if (str.equals(new String(str.getBytes(), encode))) {
                return encode;
            }
        } catch (Exception ex) {
        }

        encode = "UTF-8";
        try {
            if (str.equals(new String(str.getBytes(), encode))) {
                return encode;
            }
        } catch (Exception ex) {
        }

        /*
         *......待完善
         */

        return "未识别编码格式";
    }

    public static void main(String[] args) {
        System.out.println(getEncoding("å»ºä¿¡é\u0091«è\u008D£å\u009B\u009Eæ\u008A¥ç\u0081µæ´»é\u0085\u008Dç½®æ··å\u0090\u0088\",\"æ··å\u0090\u0088å"));
    }
}
