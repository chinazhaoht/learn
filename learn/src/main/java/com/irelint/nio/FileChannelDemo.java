package com.irelint.nio;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.RandomAccess;

/**
 * Created by Administrator on 2015-8-11.
 */
public class FileChannelDemo {
    public static void main(String[] args) throws IOException {

        RandomAccessFile aFile =  new RandomAccessFile("data/nio-data.txt","rw");
        FileChannel inChannel = aFile.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(48);

        int byteRead = inChannel.read(buf);
        while(byteRead != -1){
            System.out.println("Read"+byteRead);
            buf.flip();
            while(buf.hasRemaining()){
                System.out.print((char) buf.get());
            }
            buf.clear();
            byteRead = inChannel.read(buf);
        }
        aFile.close();
    }

    public void readFile() throws IOException {
        File file = new File("test.xml");
        FileInputStream fileInputStream = new FileInputStream(file);

        FileChannel fileChannel = fileInputStream.getChannel();
        ByteBuffer byteBuffer  = ByteBuffer.allocate(1024);
        fileChannel.read(byteBuffer);
    }

    public void writeFile() throws IOException {
        File file = new File("test.xml");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileChannel fileChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
       // String[] message = new String[]{"1","2","hello","workd"};
         Byte[] message = new Byte[]{1,2,3,4,5};
        for(int i=0;i<message.length;++i) {
            byteBuffer.put(message[i]);
        }
        byteBuffer.flip();
        fileChannel.write(byteBuffer);
    }

    public void selector() throws IOException {
        Selector selector = Selector.open();
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.configureBlocking(false);

        int[] ports = new int[]{234,8080};
        ServerSocket ss = ssc.socket();
       // InetSocketAddress address = new InetSocketAddress(ports[i]);
       // ss.bind(address);

        SelectionKey key = ssc.register(selector, SelectionKey.OP_ACCEPT);
    }
}
