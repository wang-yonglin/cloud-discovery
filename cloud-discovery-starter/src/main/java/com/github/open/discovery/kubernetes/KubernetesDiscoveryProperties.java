package com.github.open.discovery.kubernetes;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jian.xu
 * @author <a href="mailto:yanglu_u@126.com">dbses</a>
 */
@Data
@ConfigurationProperties("cloud.kubernetes.discovery")
public class KubernetesDiscoveryProperties {

    private String primaryPortName = "service-port";
    /**
     * 多久获取一次服务名列表
     */
    private int fetchServiceIntervalSeconds = 30;
    /**
     * 多久获取一次服务实例列表（即 ip, port 等信息）
     */
    private int fetchInstanceIntervalSeconds = 30;

}
