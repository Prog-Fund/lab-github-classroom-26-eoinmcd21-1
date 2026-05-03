
package utils;

import java.io.*;

public class XMLSerializer implements ISerializer {

    private String fileName;

    public XMLSerializer(String fileName) {
        this.fileName = fileName;
    }

    public void write(Object obj) throws Exception {
        FileWriter writer = new FileWriter(fileName);
        writer.write(obj.toString());
        writer.close();
    }

    public Object read() throws Exception {
        return null; // basic safe version
    }
}
