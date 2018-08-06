package com.neusoft.microservice.rule;

import java.util.List;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

/**
 * Create at 2018年8月6日 下午4:54:27
 *
 * @autuor huyz
 *
 * @version 1.0
 *
 *          ProjectName microservice-consumer-user-5001
 *
 *          Description: 定义负载规则  规则放在启动类扫描不到 即为单独配置 否则为全局配置
 * 
 */

public class MyLoadBalanceRule extends AbstractLoadBalancerRule {

	//IRule subRule = new RoundRobinRule();
	
	
	@Override
	public Server choose(Object key) {
		return choose(getLoadBalancer(), key);
	}

	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig) {

	}
	
	private int indexCount = 0;
	
	private int selectedServer = 0;

	public Server choose(ILoadBalancer lb, Object key) {
		
		List<Server> allServers = lb.getAllServers();
		//Random random = new Random();
		//selectedServer=random.nextInt()%allServers.size();
		if(++indexCount<3) {
			return allServers.get(selectedServer);
		}else {
			if(selectedServer==allServers.size()-1) {
				selectedServer=0;
			}else {
				selectedServer++;
			}
			indexCount=0;
			return  allServers.get(selectedServer);
		}
	}
}
