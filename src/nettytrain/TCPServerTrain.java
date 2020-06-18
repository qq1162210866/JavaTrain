package nettytrain;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * TCPServerTrain.java
 * Description:  netty服务端的练习
 *
 * @author Peng Shiquan
 * @date 2020/6/18
 */
public class TCPServerTrain {
    //默认端口
    private Integer port = 10000;

    public TCPServerTrain(Integer port) {
        this.port = port;
    }

    public void run() throws Exception {
        // 接收传入的连接
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        //处理传入的连接，一般是bossGroup的二倍
        EventLoopGroup workGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup, workGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new TCPServerHandler());
                        }
                    })
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);
            //
            ChannelFuture channelFuture = serverBootstrap.bind(port).sync();
            //
            channelFuture.channel().closeFuture().sync();
        } finally {
            workGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }

    }

    public static void main(String[] args) throws Exception {
        int port = 10000;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        }

        new TCPServerTrain(port).run();

    }

}
