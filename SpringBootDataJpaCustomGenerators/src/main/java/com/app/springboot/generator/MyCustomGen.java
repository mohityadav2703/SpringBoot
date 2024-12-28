package com.app.springboot.generator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

@SuppressWarnings("serial")
public class MyCustomGen implements IdentifierGenerator{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		SimpleDateFormat sdf=new SimpleDateFormat("ddMMyy");
		String dte=sdf.format(new Date());
		int random=Math.abs(new Random().nextInt());
		return "EMP :"+dte+"_"+random;
	}

}
