package com.sunshine.patterns.mediator;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/6/22.
 * 中介者模式测试
 */
public class MediatorTest {
	public static void main(String[] args) {
		Mediator mediator = new HomeChain();
		Person landlord = new Landlord();
		Person tenantOne = new Tenant();
		Person tenantTwo = new Tenant();
		Person tenantThree = new Tenant();
		mediator.register(tenantOne);
		mediator.register(tenantTwo);
		mediator.register(tenantThree);
		tenantOne.setName("Tenant One");
		tenantOne.setMediator(mediator);
		tenantOne.looking("the Tomorrow Community");
		tenantTwo.setName("Tenant Two");
		tenantTwo.setMediator(mediator);
		tenantTwo.looking("the Century Cmmunity");
		tenantThree.setName("Tenant Three");
		tenantThree.setMediator(mediator);
		tenantThree.looking("the Country Garden");
		landlord.setName("Ghost");
		landlord.setMediator(mediator);
		landlord.lease("the");
	}
}
