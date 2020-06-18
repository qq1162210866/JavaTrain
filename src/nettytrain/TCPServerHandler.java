package nettytrain;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;
import network_train.ARPojo;
import network_train.ARSwitch;

/**
 * TCPServerHandler.java
 * Description:
 *
 * @author Peng Shiquan
 * @date 2020/6/18
 */
public class TCPServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        try {
            ByteBuf recvmg = (ByteBuf) msg;
            String line = recvmg.toString(CharsetUtil.UTF_8);
            System.err.println("接收到消息" + line);
            if (line.contains("BG") && line.contains("ED")) {
                ARPojo arPojo = ARSwitch.LineSwitch(line);
                System.err.println("转换为pojo对象" + arPojo.toString());
            }
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
