package train;

import java.net.Socket;

/**
 * CountWords.java
 * Description: 统计流中长单词的数量，流的简单练习
 *
 * @author Peng Shiquan
 * @date 2020/4/4
 */
public class test {

    public static void socketClient() {
        try {
            Socket socket = new Socket("192.168.1.171", 8001);
            socket.getOutputStream();

            Thread.sleep(2000);
            System.out.println("aaa");
            socket.close();

            socket.getOutputStream();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        socketClient();

    }
}
