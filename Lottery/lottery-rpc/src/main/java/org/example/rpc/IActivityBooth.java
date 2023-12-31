package org.example.rpc;

import org.example.rpc.req.ActivityReq;
import org.example.rpc.res.ActivityRes;

/**
 * Description: 创建活动、更新活动、查询活动
 * Creator: levin
 * Date: 2/25/2023
 * Time: 8:54 PM
 * Email: levinforward@163.com
 */
public interface IActivityBooth {

    ActivityRes queryActivityById(ActivityReq req);
}
