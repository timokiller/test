package com.zfbTest;

import com.alipay.api.DefaultAlipayClient;

public class ZfbTest {
	
	public static Object test(String serverUrl, String appId, String privateKey){
		serverUrl = "http://mcloudmonitor.com/gateway.do";
		appId = "2016060301475367";
		privateKey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBANq9qTe1lSY7OfnWNdET3YlKBtJGg4IpjlcP/SudV0z2kp+JhjyqmZBqMm/EoZos7oQpeTjyggTaHUcwfYmkpKaybaTR4TZrx/fun/yhQojVOEUjIhzxaOWl5SHUWQpfsH8bg5ONuTEc6w5xCq9A+dOIicd+yUeMgL+Lo9xx0G/3AgMBAAECgYEAs2qbsMktBEXSIP21+L89mA1zGOijl5D0Yq8Hrs2IvOUGkPshcwNPoCerJQf4sVgnb5oBB1fKk6ZAG5NHdS3pqhiAqQU9zh0IHWTDly9KV3iPQq+lTT5uDjGUnK+p0M4JurLOucTFBP/casj4DVkr1ak/8cL76I6QPpByhU0sIdECQQD7xDycBAIYclI/bg2I3nzW/NNBXMm+gtc4Av428XLenA5Dni6ze0yv5cTnHMm8RTeGcA7jgsS8GS/Q3heg+tzJAkEA3mtCvaAKNUYGUVa6ZUza+E8i0CepygLjsFts4dxrZCt7dzCX6+utHJx3BHI7LXtz15f4jQmfLl8Rz0/oGzEGvwJAKO6jp/3i1VSo2JUs8Ca0B0P9mK/cQPQGx5189TPWKCkZDJdIIngWZLanh6efiNN8Dohjc0vMboRtyLiDAPIoOQJBAKZagSOE5L2tryH9BRKpJgmcXsRjNgnCmXuZFdnkW2ojX4fpD2fD8Mk6eYYYzgwZjq4MmzkZnjY3owF0mXxk8c8CQAYuDIrJa6ae60YGqEoXOloDRhEF+Td5ry+I0SjoBldZufCnxlvsk1Nj6i1PXxV7SueJdCYig1oERGdADDUXQps=";
		DefaultAlipayClient ap = new DefaultAlipayClient(serverUrl, appId, privateKey);
		return ap;
	}
	
	
	public static void main(String[] args) {
		String serverUrl = "http://mcloudmonitor.com/gateway.do";
		String appId = "2016060301475367";
		String privateKey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBANq9qTe1lSY7OfnWNdET3YlKBtJGg4IpjlcP/SudV0z2kp+JhjyqmZBqMm/EoZos7oQpeTjyggTaHUcwfYmkpKaybaTR4TZrx/fun/yhQojVOEUjIhzxaOWl5SHUWQpfsH8bg5ONuTEc6w5xCq9A+dOIicd+yUeMgL+Lo9xx0G/3AgMBAAECgYEAs2qbsMktBEXSIP21+L89mA1zGOijl5D0Yq8Hrs2IvOUGkPshcwNPoCerJQf4sVgnb5oBB1fKk6ZAG5NHdS3pqhiAqQU9zh0IHWTDly9KV3iPQq+lTT5uDjGUnK+p0M4JurLOucTFBP/casj4DVkr1ak/8cL76I6QPpByhU0sIdECQQD7xDycBAIYclI/bg2I3nzW/NNBXMm+gtc4Av428XLenA5Dni6ze0yv5cTnHMm8RTeGcA7jgsS8GS/Q3heg+tzJAkEA3mtCvaAKNUYGUVa6ZUza+E8i0CepygLjsFts4dxrZCt7dzCX6+utHJx3BHI7LXtz15f4jQmfLl8Rz0/oGzEGvwJAKO6jp/3i1VSo2JUs8Ca0B0P9mK/cQPQGx5189TPWKCkZDJdIIngWZLanh6efiNN8Dohjc0vMboRtyLiDAPIoOQJBAKZagSOE5L2tryH9BRKpJgmcXsRjNgnCmXuZFdnkW2ojX4fpD2fD8Mk6eYYYzgwZjq4MmzkZnjY3owF0mXxk8c8CQAYuDIrJa6ae60YGqEoXOloDRhEF+Td5ry+I0SjoBldZufCnxlvsk1Nj6i1PXxV7SueJdCYig1oERGdADDUXQps=";
		Object sp = test(serverUrl, appId, privateKey);
		System.out.println(sp);
	}
}
