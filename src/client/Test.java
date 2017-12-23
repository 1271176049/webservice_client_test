package client;

import com.sdp.edu.server.TestServiceInf;
import com.sdp.edu.server.TestServiceInfService;

public class Test {
	public static void main(String[] args) {
		// 获取rpc的代理服务
		TestServiceInfService serviceInfService = new TestServiceInfService();
		// 获取接口
		TestServiceInf testServiceInf = serviceInfService.getTestServiceInfPort();
		// 调用接口
		String test = testServiceInf.test("苍山有井名为空");
		System.out.println(test);
	}
}
