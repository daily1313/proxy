package hello.proxy.pureproxy.proxy;

import hello.proxy.pureproxy.proxy.code.Subject;

public class ProxyPatternClient {

    private Subject subject;

    public ProxyPatternClient(Subject subject) {
        this.subject = subject;
    }

    public void execute() {
        subject.operation();
    }
}
