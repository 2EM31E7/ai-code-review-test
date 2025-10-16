package IO;

import org.junit.Test;

import java.io.*;

/**
 * @Author: Bach912
 * @Description: 文件输出流示例，解决乱码问题
 * @DateTime: 2025/10/15 11:38
 **/
public class IOtest {
    public static final String url_text2 = "src/test/java/IO/test2.txt";
    public static final String url = "src/test/java/IO/test.txt";

    // 原始方法 - 会产生乱码
    @Test
    public void outputStreamByte() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/test/java/IO/test.txt");
        fileOutputStream.write(11);
        fileOutputStream.close();
    }
    
    // 解决方案1：使用字符流写入文本
    @Test
    public void outputStreamWithWriter() throws IOException {
        String string = "jzf";
        FileOutputStream outputStreamWriter = new FileOutputStream("src/test/java/IO/test.txt",true);
        outputStreamWriter.write(string.getBytes());
        outputStreamWriter.close();
    }
    
    // 解决方案2：使用OutputStreamWriter指定字符编码
    @Test
    public void outputStreamWithEncoding() throws IOException {
        // 明确指定UTF-8编码
        OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("src/test/java/IO/test.txt"), "UTF-8");
        writer.write("你好，这是使用OutputStreamWriter指定UTF-8编码写入的文本");
        writer.close();
    }

    @Test
    public void outputStreamWithWriter_1() throws IOException {
        //换行写
        FileOutputStream fileOutputStream = new FileOutputStream(url);
        String content = "asdas\r\nsadasd";
        fileOutputStream.write(content.getBytes());
        fileOutputStream.close();

    }

    @Test
    public void InputStream() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(url);
        int read = fileInputStream.read();
        System.out.println(read);
        fileInputStream.close();

    }

    @Test
    public void InputStream_2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(url);
        int word;
        while ((word = fileInputStream.read())!= -1 ) {
            System.out.println(word);
        }
        fileInputStream.close();
    }

    @Test
    public void copy() throws IOException {
        //边读边写
        FileInputStream fileInputStream = new FileInputStream(url);
        FileOutputStream fileOutputStream = new FileOutputStream(url_text2);
        int word;
        while ((word = fileInputStream.read()) != -1) {
            fileOutputStream.write(213);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
