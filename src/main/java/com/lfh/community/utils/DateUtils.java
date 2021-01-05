package com.lfh.community.utils;

/**
 * @Description:
 * @author: LFH
 * @date: 2021/1/4  10:50
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;

/***
 *      日期工具类
 *      字符串转UtilDate
 *      UtilDate转SqlDate
 *      UtilDate转字符串
 *      解决：Dao层的日期数据类型与数据库中的类型不一致，无法存储到数据库
 *      使用说明：如果是Sting类型的日期数据（格式：yyyy-MM-dd）先用方法strToUtil将数据类型转化成Util.Date类型，再用utilToSql方法将数据转换成Sql.Date类型。
 *
 */
public class DateUtils {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//时间格式化
    //1.字符串转化为util.Date
    public static java.util.Date strToUtil(String str){
        java.util.Date date = null;
        try {
            date = sdf.parse(str);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    //2.Util.Date转换为sql.Date
    public static java.sql.Date utilToSql(java.util.Date date){
        return new java.sql.Date(date.getTime());
    }
    //3.Util.Date转化为字符串形式
    public static String utilToStr(java.util.Date date){
        return sdf.format(date);
    }
}
