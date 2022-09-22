package cn.lq.rpc.ldl.Hello;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class HelloRequest implements Serializable {
    private static final long serialVersionUID = -1113111L;

    private String name;
}
