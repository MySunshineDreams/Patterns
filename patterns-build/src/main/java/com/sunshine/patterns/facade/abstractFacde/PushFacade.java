package com.sunshine.patterns.facade.abstractFacde;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 * 外观模式——外观类
 */
public class PushFacade extends AbstractPushFacade {

	private Group group;
	private Message message;
	private Send send;

	public PushFacade() {
		group = new Group();
		message = new Message();
		send = new Send();
	}

	@Override
	public void setGroup(String type) {
		group.group(type);
	}

	@Override
	public void setMessage(String type) {
		message.message(type);
	}

	@Override
	public void setSend(String type) {
		send.send(type);
	}

	public static class Constants {
		public static final String GROUP_FULL = "full";
		public static final String GROUP_APPOINT = "appoint";
		public static final String GROUP_DISTRICT = "district";
		public static final String GROUP_LABEL = "label";
		public static final String MESSAGE_ANDROID = "Android";
		public static final String MESSAGE_IOS = "iOS";
		public static final String MESSAGE_WIN_PHONE = "winPhone";
		public static final String SEND_PERSONAL = "personal";
		public static final String SEND_THIRD = "third";
		public static final String SEND_APNS = "apns";
	}
}
