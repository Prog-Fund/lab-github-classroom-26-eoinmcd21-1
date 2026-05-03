
package utils;

public interface ISerializer {
    void write(Object obj) throws Exception;
    Object read() throws Exception;
}
