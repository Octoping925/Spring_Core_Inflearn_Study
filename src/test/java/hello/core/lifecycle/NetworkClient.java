package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient {
    private String url;

    public NetworkClient() {
        System.out.println("������ ȣ��, url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // ���� ���� �� ȣ��
    public void connect() {
        System.out.println("connect = " + url);
    }

    public void call(String message) {
        System.out.println("call = " + url + " message = " + message);
    }

    // ���� ���� �� ȣ��
    public void disconnect() {
        System.out.println("close " + url);
    }

    public void init() {
        connect();
        call("�ʱ�ȭ ���� �޽���");
    }

    public void close() {
        disconnect();
    }
}
