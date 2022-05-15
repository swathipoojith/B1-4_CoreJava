package client;

import application.GsNormalAcc;
import application.GsPrimeAcc;
import application.GsshopFactory;
import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopFactory s=new GsshopFactory();
		PrimeAcc p=new GsPrimeAcc(123,"Vinat T N",250,true);
		NormalAcc n=new GsNormalAcc(124,"Tharun",300,10);
		System.out.println("Prime account ");
		p.bookProduct(p.getCharge());
		System.out.println("Normal account");
		n.bookProduct(n.getCharges());
		System.out.println(s.getNewPrimeAcc(1, "Swathi", 1236, true));
		System.out.println(s.getNewNormalAcc(800, "Krishna", 1000, 50));
		
		System.out.println(p);
		System.out.println(n);
		}

	}