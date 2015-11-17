package org.wlf.filedownloader_demo.util;

/**
 * time util
 * <br/>
 * 时间工具类
 *
 * @author wlf(Andy)
 * @email 411086563@qq.com
 */
public class TimeUtil {

    /**
     * format seconds to HH:mm:ss String
     *
     * @param seconds seconds
     * @return String of formatted in HH:mm:ss
     */
    public static String seconds2HH_mm_ss(long seconds) {

        long h = 0;
        long d = 0;
        long s = 0;
        long temp = seconds % 3600;

        if (seconds > 3600) {
            h = seconds / 3600;
            if (temp != 0) {
                if (temp > 60) {
                    d = temp / 60;
                    if (temp % 60 != 0) {
                        s = temp % 60;
                    }
                } else {
                    s = temp;
                }
            }
        } else {
            d = seconds / 60;
            if (seconds % 60 != 0) {
                s = seconds % 60;
            }
        }

        String hs = h < 10 ? "0" + h : h + "";
        String ds = d < 10 ? "0" + d : d + "";
        String ss = s < 10 ? "0" + s : s + "";

        return hs + ":" + ds + ":" + ss;
    }
}
