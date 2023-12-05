package egovframework.com.cmm.util;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * 
 * @FileName  : NullUtil.java 
 * @Project     : fmss-svc 
 * @Date         : 2023. 12. 5. 
 * @author: hanslee 

 * @version : 1.0
 * @program info : 필요한 null체크는 지속적으로 업데이트 해주시기 바랍니다.
 */
public abstract class NullUtil {
	
    private NullUtil() {}
    
    
    
    public static boolean isNull(Object value) {
        return value == null;
    }
    
    
    
    public static boolean isNone(String value) {
        return value == null || value.length() == 0;
    }
    
    public static boolean isExctNone(String value) {
        return value == null || value.trim().length() == 0;
    }
    
    public static boolean notNone(String value) {
        return value != null && value.length() > 0;
    }
    
    public static boolean isExctNotNone(String value) {
        return value != null && value.trim().length() > 0;
    }
    
    
    
    
    public static boolean isNone(List<?> value) {
        return (value == null || value.isEmpty());
    }
    
    public static boolean isNone(Object[] value) {
        return (value == null || value.length == 0);
    }
    
    public static boolean isNone(Map<?, ?> value) {
        return (value == null || value.isEmpty());
    }
    
    
    
    
    public static String NVL(String originalStr, String defaultStr) {
        if (originalStr == null || originalStr.length() < 1) return defaultStr;
        return originalStr;
    }
    
    public static boolean allNull(Object... objs) {
        for (Object obj : objs) {
            if (obj != null) return false;
        }
        return true;
    }

    public static String toString(Object o) {
        if (o == null) {
            return null;
        }
        return String.valueOf(o).trim();
    }

    public static Integer toInteger(Object o) {
        if (o == null) {
            return null;
        }
        return Integer.valueOf(String.valueOf(o));
    }

    public static Float toFloat(Object o) {
        if (o == null) {
            return null;
        }
        return Float.valueOf(String.valueOf(o));
    }

    public static Double toDouble(Object o) {
        if (o == null) {
            return null;
        }
        return Double.valueOf(String.valueOf(o));
    }




    public static Field[] getFieldsFromClassAndAncestors(Class clazz) {
        List<Field> fields = new LinkedList<Field>(Arrays.asList(clazz.getDeclaredFields()));
        if (clazz.getSuperclass() != null && !clazz.getSuperclass().equals(Object.class)) {
            fields.addAll(Arrays.asList(getFieldsFromClassAndAncestors(clazz.getSuperclass())));
        }
        return fields.toArray(new Field[fields.size()]);
    }

    public static Timestamp toTimestamp(Object o) {
        if(o==null) {
            return null;
        }
        return Timestamp.valueOf(String.valueOf(o));
    }

    public static Long toLong(Object o) {
        if(o==null) {
            return null;
        }
        return Long.valueOf(String.valueOf(o));
    }

    public static Date toDate(Timestamp timestamp) {
        if(timestamp==null) {
            return null;
        }
        return new Date(timestamp.getTime());
    }

    public static BigDecimal toBigDecimal(String number) {
        return number==null || "".equals(number.trim()) ? null : new BigDecimal(number);
    }
    
    
}


