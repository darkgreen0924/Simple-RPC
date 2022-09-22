package cn.lq.rpc.core.client;

import cn.lq.rpc.core.rpc_prootocol.RpcRequest;
import cn.lq.rpc.core.rpc_prootocol.RpcResponse;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class RpcClientTransfer {

    public RpcResponse sendRequest(RpcRequest rpcRequest) {
        try (Socket socket = new Socket("localhost", 9000)) {
            //发送transfer层
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            objectOutputStream.writeObject(rpcRequest);
            objectOutputStream.flush();

            RpcResponse rpcResponse = (RpcResponse) objectInputStream.readObject();
            return rpcResponse;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
