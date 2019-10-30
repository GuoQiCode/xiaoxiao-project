package com.xiaoxiao.data;

/**
 * @project_name:xiaoxiao_application
 * @date:2019/10/30:17:20
 * @author:shinelon
 * @Describe:
 */

public class Result
{
    /**
     * 消息
     */
    private String msg;


    /**
     * 是否成功
     */
    private boolean succeed;


    /**
     * 返回的数据
     */
    private Object data;


    /**
     * 失败
     * @param msg 消息
     * @param succeed 成功
     * @return
     */
    public static Result failed(String msg, boolean succeed)
    {
        return new Result(msg,succeed);
    }


    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public boolean isSucceed()
    {
        return succeed;
    }

    public void setSucceed(boolean succeed)
    {
        this.succeed = succeed;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }


    /**
     * 成功消息
     * @param msg
     * @param data
     * @return
     */
    public static Result succeed(String msg,Object data){
        return new Result(msg,data);
    }

    /**
     * 成功
     * @param msg
     * @param succeed
     * @return
     */
    public static Result succeed(String msg,boolean succeed){
        return new Result(msg,succeed);
    }

    @Override
    public String toString()
    {
        return "Result{" + "msg='" + msg + '\'' + ", succeed=" + succeed + ", data=" + data + '}';
    }

    public Result(String msg, Object data)
    {
        this.msg = msg;
        this.data = data;
    }

    public Result(String msg, boolean succeed, Object data)
    {
        this.msg = msg;
        this.succeed = succeed;
        this.data = data;
    }

    public Result()
    {
    }
}
