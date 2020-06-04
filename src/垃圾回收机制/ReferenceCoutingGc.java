/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: ReferenceCoutingGc
 * Author:   李佳佳同学
 * Date:     2020/6/4 3:15
 * Description: 引用计数法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 垃圾回收机制;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试Java是不是使用引用计数法〉
 * 参数：-XX:PrintGCDetails
 *
 * @author 李佳佳同学
 * @create 2020/6/4
 * @since 1.0.0
 */
public class ReferenceCoutingGc {


    public Object instacne=null;
    private static final int _1MB=1024*1024;


    /*
    这个成员属性的作用是占一点内存，以便在GC日志中看清楚是否被回收过。
     */
    private byte[] bigsize=new byte[2*_1MB];

    public static void main(String[] args) {
        ReferenceCoutingGc objA=new ReferenceCoutingGc();
        ReferenceCoutingGc objeB=new ReferenceCoutingGc();
        //循环引用
        objA.instacne=objeB;
        objeB.instacne=objA;

        //主动GC查看效果。
        System.gc();
    }

}
