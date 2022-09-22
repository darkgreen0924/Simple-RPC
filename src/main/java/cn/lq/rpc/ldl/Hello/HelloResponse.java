package cn.lq.rpc.ldl.Hello;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class HelloResponse implements Serializable {
    private static final long serialVersionUID = -111331L;

    private String msg;
}
