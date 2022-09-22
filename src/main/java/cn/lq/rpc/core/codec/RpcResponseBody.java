package cn.lq.rpc.core.codec;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class RpcResponseBody implements Serializable {

    private Object retObject;

}
