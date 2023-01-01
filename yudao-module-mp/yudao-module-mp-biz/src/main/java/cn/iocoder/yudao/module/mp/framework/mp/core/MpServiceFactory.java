package cn.iocoder.yudao.module.mp.framework.mp.core;

import cn.iocoder.yudao.module.mp.dal.dataobject.account.MpAccountDO;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.api.WxMpService;

import java.util.List;

/**
 * {@link WxMpService} 工厂接口
 *
 * @author 芋道源码
 */
public interface MpServiceFactory {

    /**
     * 基于微信公众号的账号，初始化对应的 WxMpService 与 WxMpMessageRouter 实例
     *
     * @param list 公众号的账号列表
     */
    void init(List<MpAccountDO> list);

    /**
     * 获得 appId 对应的 WxMpService 实例
     *
     * @param appId 微信公众号 appId
     * @return WxMpService 实例
     */
    WxMpService getMpService(String appId);

    /**
     * 获得 appId 对应的 WxMpMessageRouter 实例
     *
     * @param appId 微信公众号 appId
     * @return WxMpMessageRouter 实例
     */
    WxMpMessageRouter getMpMessageRouter(String appId);
}