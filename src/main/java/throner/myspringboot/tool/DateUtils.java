package throner.myspringboot.tool;

import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chenjiansheng on 2020-6-30.
 */
public class DateUtils {

    public static String format(Date date,String format){
        SimpleDateFormat df = new SimpleDateFormat(format);
        String sResult = "";
        if(date!=null){
            sResult = df.format(date);
        }else{
            sResult = "";
        }
        return sResult;
    }

    public static String format(Date date){
        String sResult = format(date,"yyyyMMddHHmmss");
        return sResult;
    }
}
