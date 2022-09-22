package cn.lq.rpc.ldl.Hello;

public interface HelloService {
    HelloResponse hello(HelloRequest request);

    HelloResponse hi(HelloRequest request);
}
