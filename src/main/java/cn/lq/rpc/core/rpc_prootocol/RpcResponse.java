package cn.lq.rpc.core.rpc_prootocol;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class RpcResponse implements Serializable {

    private static final long serialVersionUID = -1111111L;

    // 协议头部份
    private String header;

    // 协议体部分
    private byte[] body;
}
