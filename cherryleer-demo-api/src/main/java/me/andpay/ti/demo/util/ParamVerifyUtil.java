package me.andpay.ti.demo.util;

import me.andpay.ti.demo.exception.ParamIntegerNegativeException;
import me.andpay.ti.demo.exception.ParamNullException;

/**
 * 参数校验工具类
 *
 * @author : cherryleer
 */
public class ParamVerifyUtil {

    public static void verifyMessageNull(Object o) {

        if (o == null)
            throw new ParamNullException();

        return;
    }

    public static void verifyIntegerNegative(Integer i) {

        verifyMessageNull(i);

        if (i < 0)
            throw new ParamIntegerNegativeException();

        return;
    }

}
