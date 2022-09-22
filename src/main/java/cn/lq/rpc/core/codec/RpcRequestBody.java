package cn.lq.rpc.core.codec;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
// 调用编码
public class RpcRequestBody implements Serializable {
    private static final long serialVersionUID = -23333L;

    private String interfaceName;
    private String methodName;
    private Object[] parameters;
    private Class<?>[] paramTypes;
}
