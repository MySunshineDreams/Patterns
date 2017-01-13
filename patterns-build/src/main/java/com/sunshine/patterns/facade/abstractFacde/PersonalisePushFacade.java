package com.sunshine.patterns.facade.abstractFacde;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 */
public class PersonalisePushFacade extends AbstractPushFacade {
	private PersonaliseGroup group;
	private Message message;
	private Send send;

	public PersonalisePushFacade() {
		group = new PersonaliseGroup();
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
		public static final String PERSONALISE_GROUP_FULL = "teenage";
		public static final String PERSONALISE_GROUP_APPOINT = "adult";
		public static final String PERSONALISE_GROUP_DISTRICT = "elder";
		public static final String MESSAGE_ANDROID = "Android";
		public static final String MESSAGE_IOS = "iOS";
		public static final String MESSAGE_WIN_PHONE = "winPhone";
		public static final String SEND_PERSONAL = "personal";
		public static final String SEND_THIRD = "third";
		public static final String SEND_APNS = "apns";
	}
}
