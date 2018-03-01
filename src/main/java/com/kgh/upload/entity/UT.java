package com.kgh.upload.entity;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 工具类统一入口。（目的： 
 * 
 *    1.方便使用、无需记忆，只需输入“UT.”工具类就列出来了； 
 *    
 *    2.统一工具类、统一管理
 *    ）
 */
public class UT {
    private static Logger logger = LoggerFactory.getLogger("");
    /*
工具类列表：
    UT.Str     -- 字符串
    UT.Coll    -- 集合
    UT.Json    -- Json处理
    UT.Date    -- 日期、格式化
    UT.Split   -- 字符串拆分
    UT.IO      -- IO流
    UT.Thread  -- 线程
    UT.Random  -- 随机数
    UT.Res     -- 资源文件
    UT.Web     -- Web相关
    UT.Algr    -- 算法
    UT.Ref     -- 反射
     */
    
    /** 通用Logger */
    public static Logger getLogger() {
        return logger;
    }
    
    
    public static class Coll {
        /**
         * 实现类似于 sql的 order by 多个字段的功能。
         * @param comparatorList 按顺序指定多个比较器
         */
        @SafeVarargs
        public static <T> void sort(List<T> list, final Comparator<T>... comparatorList) {
            if (comparatorList == null || comparatorList.length==0) {
                throw new IllegalArgumentException("comparatorList is empty.");
            }
            Comparator<T> comparator = new Comparator<T>() {
                public int compare(T o1, T o2) {
                    for (Comparator<T> c : comparatorList) {
                        if (c.compare(o1, o2) > 0) {
                            return 1;
                        }
                        else if (c.compare(o1, o2) < 0) {
                            return -1;
                        }
                    }
                    return 0;
                }
            };
            Collections.sort(list, comparator);
        }
    }
    
    public static class IO extends IOUtils {
    }
    
    public static class Str extends StringUtils {
    }
    

    public static class Obj {
        /**
         * 比较两个值的大小，支持null
         */
        public static <T> int compareTo(Comparable<T> obj, T other) {
            if (obj != null) {
                if (other != null) {
                    return obj.compareTo(other);
                }
                return 1;
            }
            else {
                if (other != null) {
                    return -1;
                }
                return 0;
            }
        }
    }
    

}
