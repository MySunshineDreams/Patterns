package com.sunshine.patterns.facade;

import com.sunshine.patterns.facade.facade.PushFacade;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 * 外观模式测试
 */
public class FacadeTest {
	public static void main(String[] args) {
		facadeTest();
	}

	private static void facadeTest() {
		try {
			PushFacade facade = new PushFacade();
			facade.setGroup(PushFacade.Constants.GROUP_FULL);
			facade.setMessage(PushFacade.Constants.MESSAGE_ANDROID);
			facade.setSend(PushFacade.Constants.SEND_THIRD);

			facade.setGroup(PushFacade.Constants.GROUP_APPOINT);
			facade.setMessage(PushFacade.Constants.MESSAGE_IOS);
			facade.setSend(PushFacade.Constants.SEND_APNS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
