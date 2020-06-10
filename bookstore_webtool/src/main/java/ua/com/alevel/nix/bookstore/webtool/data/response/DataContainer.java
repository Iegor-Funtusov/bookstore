package ua.com.alevel.nix.bookstore.webtool.data.response;

public class DataContainer<T> {

    private T data;

    public DataContainer(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
