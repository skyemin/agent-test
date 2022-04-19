package com.wei.agent;

import java.lang.instrument.Instrumentation;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author skye
 * @version 1.0
 * @date Created in 2022年04月15日 16:11
 * @since 1.0
 */
public class RunningAgent {

    public static void agentmain (String arg, Instrumentation instrumentation){
        System.out.println("动态探针启动！！！");
        System.out.println("动态探针传入参数：" + arg);
        instrumentation.addTransformer(new RunningTransformer());
    }

}
