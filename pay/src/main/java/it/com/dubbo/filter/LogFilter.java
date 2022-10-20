//package it.com.dubbo.filter;
//
//import org.apache.dubbo.common.constants.CommonConstants;
//import org.apache.dubbo.common.extension.Activate;
//import org.apache.dubbo.rpc.Filter;
//import org.apache.dubbo.rpc.Invocation;
//import org.apache.dubbo.rpc.Invoker;
//import org.apache.dubbo.rpc.Result;
//import org.apache.dubbo.rpc.RpcException;
//import org.springframework.util.StopWatch;
//
///**
// * @author hao.li
// * @Title:
// * @Description:
// * @date 2022/10/1917:52
// */
//@Activate(group = CommonConstants.CONSUMER, order = -110000)
//public class LogFilter implements Filter {
//    @Override
//    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        System.out.println("开始调用:" + stopWatch.prettyPrint());
//        Result result = invoker.invoke(invocation);
//        stopWatch.stop();
//        System.out.println("调用结果:" + result);
//        System.out.println("结束调用:" + stopWatch.prettyPrint());
//        return result;
//    }
//}
